/******************************************************************************
Programmer: Zoe Cope
Date: 10/27/2023
Lab 9
Instructor: Dr. Rafael Azuaje
College: San Antonio College
*******************************************************************************/
import java.text.NumberFormat;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MPGApplication extends Application {
    private TextField milesTxt;
    private TextField gallonsTxt;
    private TextField mpgTxt;

    @Override
    public void start(Stage primaryStage) {
      
        primaryStage.setTitle("Miles Per Gallon Calculator");
        
        GridPane root = new GridPane();
        //Align top center
        root.setAlignment(Pos.TOP_LEFT);
        //10 px space between rows and col
        root.setHgap(10);
        root.setVgap(10);
        //pad 25 px from edge of window
        root.setPadding(new Insets(25,25,25,25));
        
        Scene scene = new Scene(root, 275, 175);
        //create three text fields with labels
        root.add(new Label("Miles:"), 0, 0);
        milesTxt=new TextField();
        root.add(milesTxt,1,0);
        
        root.add(new Label("Gallons:"), 0, 1);
        gallonsTxt=new TextField();
        root.add(gallonsTxt,1,1);
        
        root.add(new Label("MPG:"), 0, 2);
        mpgTxt=new TextField();
        //third textfield is read only
        mpgTxt.setEditable(false);
        root.add(mpgTxt,1,2);        

        Button btn = new Button();
        btn.setText("Calculate");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
            //called when user pushes button
            
                //convert textfields into Doubles
                double miles=Double.parseDouble(milesTxt.getText());
                double gallons=Double.parseDouble(gallonsTxt.getText());
                double mpg=miles/gallons;
                
                NumberFormat num= NumberFormat.getNumberInstance();
                //set text field to mgp calculation when button is pressed
                mpgTxt.setText(num.format(mpg));
            }
        });
        root.add(btn,1,3);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
