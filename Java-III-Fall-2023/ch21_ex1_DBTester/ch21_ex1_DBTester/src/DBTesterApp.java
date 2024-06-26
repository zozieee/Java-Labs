/******************************************************************************
Programmer: Zoe Cope
Date: 11/24/2023
Lab 13
Instructor: Dr. Rafael Azuaje
College: San Antonio College 

*******************************************************************************/
import java.sql.*;

public class DBTesterApp {

    private static Connection connection;

    public static void main(String args[]) {        
        // open connection
        try {
            String dbUrl = "jdbc:sqlite:products.sqlite";
            connection = DriverManager.getConnection(dbUrl);        
        } catch (SQLException e) {
            System.err.println(e);
            return;
        }        
        
        // select data from database
        printProducts();
        printFirstProduct();
        printProductByCode("jsp");

        // modify data in the database
        Product p = new Product("test", "Test Product", 49.50);
        insertProduct(p);
        printProducts();
        deleteProduct(p);
        printProducts();

        // close connection
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);            
        }
    }

    public static void printProducts() {
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM Products")) {
            Product p;

            System.out.println("Product list:");
            while (rs.next()) {
                String code = rs.getString("ProductCode");
                String description = rs.getString("Description");
                double price = rs.getDouble("Price");

                p = new Product(code, description, price);

                printProduct(p);
            }
            System.out.println();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void printFirstProduct() {
        //prints the record for the first product in the Products table
        
        try(Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM Products")){
            if (rs.next()){
                //retrieve data using column names
                String code = rs.getString("ProductCode");
                String description = rs.getString("Description");
                double price = rs.getDouble("Price");
                Product p = new Product(code, description, price);
                
                System.out.println("First product: ");
                printProduct(p);
                System.out.println();
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void printProductByCode(String productCode) {
        //code that prints the product with the specified code
        //uses prepared statement to create result set
        
        try(PreparedStatement ps = connection.prepareStatement(
                "SELECT * WHERE ProductCode = ?")){
            ps.setString(1, productCode);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                String code = rs.getString(1);
                String description = rs.getString(2);
                double price = rs.getDouble(3);
                Product p = new Product(code, description, price);
                
                System.out.println("Product by code: " + productCode);
                printProduct(p);
                System.out.println();
            }
            rs.close();
        }catch (SQLException e){
            System.out.println(e);
        }  
    }

    public static void insertProduct(Product p) {
    // code that inserts the specified product into the database
        String insertProduct
                = "INSERT INTO Products (ProductCode, Description, Price) "
                + "VALUES (?,?,?)";
        
        try (PreparedStatement ps = connection.prepareStatement(insertProduct)){
        System.out.println("Insert test: ");
        
        ps.setString(1,p.getCode());
        ps.setString(2,p.getDescription());
        ps.setDouble(3,p.getPrice());
        ps.executeUpdate();

        printProduct(p);
        System.out.println();
        }catch (SQLException e){
        // displays an error message if a product with the specifed code already exists
            System.out.println(e);
        }
    }

    private static void deleteProduct(Product p) {
    //deletes the specified product from the database
        String deleteProduct
                = "DELETE FROM Products "
                + "WHERE ProductCode = ?";
        
        try(PreparedStatement ps = connection.prepareStatement(deleteProduct)){
            System.out.println("Delete test: ");
            
            ps.setString(1,p.getCode());
            ps.executeUpdate();
            
            printProduct(p);
            
            System.out.println();
        }catch (SQLException e){
        // displays an error message if a product with the specifed code does not exist
            System.out.println(e);
        } 
    }

    // use this method to print a Product object on a single line
    private static void printProduct(Product p) {
        String productString
                = StringUtil.padWithSpaces(p.getCode(), 12)
                + StringUtil.padWithSpaces(p.getDescription(), 38)
                + p.getFormattedPrice();

        System.out.println(productString);
    }
}