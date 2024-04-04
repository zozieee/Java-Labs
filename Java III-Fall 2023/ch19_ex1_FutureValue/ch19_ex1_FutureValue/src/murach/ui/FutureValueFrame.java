/******************************************************************************
Programmer: Zoe Cope
Date: 11/09/2023
Lab 11
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*******************************************************************************/

package murach.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import murach.business.FinancialCalculations;

public class FutureValueFrame extends JFrame {

    private JTextField investmentField;
    private JTextField interestRateField;
    private JComboBox years;
    private JList futureValueList;
    private DefaultListModel<String> futureValueModel;

    public FutureValueFrame() {
        initComponents();
    }

    private void initComponents() {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException |
                 IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }

        setTitle("Future Value Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        investmentField = new JTextField();
        interestRateField = new JTextField();
        years = new JComboBox();
        futureValueList = new JList();
        futureValueModel=new DefaultListModel<>();
        JScrollPane futureValuePane = new JScrollPane(futureValueList);
        
        futureValuePane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        futureValuePane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        for (int yr = 1; yr<21; yr++){
            years.addItem(yr);        
        }
        years.setSelectedIndex(2);
        
        Dimension dim = new Dimension(150, 20);
        investmentField.setPreferredSize(dim);
        interestRateField.setPreferredSize(dim);
        years.setPreferredSize(dim);
        investmentField.setMinimumSize(dim);
        interestRateField.setMinimumSize(dim);
        years.setMinimumSize(dim);
        
        Dimension d2 = new Dimension(150,80);
        futureValuePane.setPreferredSize(d2);
        futureValuePane.setMinimumSize(d2);

        JButton calculateButton = new JButton("Calculate");
        JButton exitButton = new JButton("Exit");

        calculateButton.addActionListener(e -> calculateButtonClicked());
        exitButton.addActionListener(e -> exitButtonClicked());

        // button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(calculateButton);
        buttonPanel.add(exitButton);        

        // main panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.add(new JLabel("Monthly Investment:"), getConstraints(0, 0));
        panel.add(investmentField, getConstraints(1, 0));
        panel.add(new JLabel("Yearly Interest Rate:"), getConstraints(0, 1));
        panel.add(interestRateField, getConstraints(1, 1));
        panel.add(new JLabel("Years:"), getConstraints(0, 2));
        panel.add(years, getConstraints(1, 2));
        panel.add(new JLabel("Future Value:"), getConstraints(0, 3));
        panel.add(futureValuePane, getConstraints(1, 3));        

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }

    // helper method for getting a GridBagConstraints object
    private GridBagConstraints getConstraints(int x, int y) {
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(5, 5, 0, 5);
        c.gridx = x;
        c.gridy = y;
        return c;
    }

    private void calculateButtonClicked() {
        double investment = Double.parseDouble(investmentField.getText());
        double interestRate = Double.parseDouble(interestRateField.getText());
        int yearsInt = (int) years.getSelectedItem();
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        futureValueModel.clear();
        double futureValue;
        String yearlyString;
        for (int y=1;y<=yearsInt;y++){
            futureValue = FinancialCalculations.calculateFutureValue(investment, interestRate, y);
            yearlyString= "Year "+y+": "+ currency.format(futureValue);
            futureValueModel.addElement(yearlyString);
        }        
        futureValueList.setModel(futureValueModel);
    }

    private void exitButtonClicked() {
        System.exit(0);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            JFrame frame = new FutureValueFrame();
        });
    }    
}