/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodTruck_Bill;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FoodTruck extends javax.swing.JFrame{

    double firstnum;
    double secondnum;
    double result;
    String operation;

    
    static double us;
    static double aus;
    static double jap;
    static double pound;
    static double Tea;
static double iceTea;
static double coffee;
static double coldCoffee;
static double cola;
static double banana;
static double choco;
static double del;
static double tax;
 static double costChicken;
static double costCheese;
static double costTikki;
static double costZinger;
    
   int c=0;
    
    double arr[]=new double[5];
    public FoodTruck()throws IOException {
        Thread thread = new Thread(new Runnable(){

            @Override
            public void run() {
                try {
            FileReader reader = new FileReader("F:\\NETBEAN PROJECTS\\Bill System\\src\\FoodTruck_Bill\\Info1");
            BufferedReader br = new BufferedReader(reader);
            String s1 = br.readLine();
            if(s1!=null)
            {
                us = Double.parseDouble(s1);
            }
            String s2 = br.readLine();
            if(s2!=null)
            {
                jap = Double.parseDouble(s2);
            }
            String s3 = br.readLine();
            if(s3!=null)
            {
                aus = Double.parseDouble(s3);
            }
            String s4 = br.readLine();
            if(s4!=null)
            {
                pound = Double.parseDouble(s4);
            }
            br.close();
            } catch (FileNotFoundException ex) {
            Logger.getLogger(FoodTruck.class.getName()).log(Level.SEVERE, null, ex);
        }       catch (IOException ex) {
                    Logger.getLogger(FoodTruck.class.getName()).log(Level.SEVERE, null, ex);
                }
        try
        {
        FileReader reader2 = new FileReader("F:\\NETBEAN PROJECTS\\Bill System\\src\\FoodTruck_Bill\\Info2");
            BufferedReader br = new BufferedReader(reader2);
            
             String s14 = br.readLine();
            if(s14!=null)
            {
                costChicken = Double.parseDouble(s14);
            }
            String s15 = br.readLine();
            if(s15!=null)
            {
                costCheese = Double.parseDouble(s15);
            }
            String s16 = br.readLine();
            if(s16!=null)
            {
                costTikki = Double.parseDouble(s16);
            }
            String s17 = br.readLine();
            if(s17!=null)
            {
                costZinger = Double.parseDouble(s17);
            }
            String s9 = br.readLine();
            if(s9!=null)
            {
                cola = Double.parseDouble(s9);
            }
            String s7 = br.readLine();
            if(s7!=null)
            {
                coffee = Double.parseDouble(s7);
            }
            String s5 = br.readLine();
            if(s5!=null)
            {
                Tea = Double.parseDouble(s5);
            }
            String s8 = br.readLine();
            if(s8!=null)
            {
                coldCoffee = Double.parseDouble(s8);
            }
            String s6 = br.readLine();
            if(s6!=null)
            {
                iceTea = Double.parseDouble(s6);
            }
            String s10 = br.readLine();
            if(s10!=null)
            {
                banana = Double.parseDouble(s10);
            }
            String s11 = br.readLine();
            if(s11!=null)
            {
                choco = Double.parseDouble(s11);
            }
            String s13 = br.readLine();
            if(s13!=null)
            {
                tax = Double.parseDouble(s13);
            }
            String s12 = br.readLine();
            if(s12!=null)
            {
                del = Double.parseDouble(s12);
            }
            br.close();
        }catch (FileNotFoundException ex) {
            Logger.getLogger(FoodTruck.class.getName()).log(Level.SEVERE, null, ex);
        }       catch (IOException ex) {
                    Logger.getLogger(FoodTruck.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        thread.start();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextReceipt = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jtxtDisplay = new javax.swing.JTextField();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnPlus = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtnMinus = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnMul = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnC = new javax.swing.JButton();
        jBtnEqual = new javax.swing.JButton();
        jBtnDiv = new javax.swing.JButton();
        jBtnPorM = new javax.swing.JButton();
        jBtnDeci = new javax.swing.JButton();
        jBtnArrow = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jcChicken = new javax.swing.JCheckBox();
        jcCheese = new javax.swing.JCheckBox();
        jcTikki = new javax.swing.JCheckBox();
        jcZinger = new javax.swing.JCheckBox();
        jtxtTikki = new javax.swing.JTextField();
        jtxtChicken = new javax.swing.JTextField();
        jtxtZinger = new javax.swing.JTextField();
        jtxtCheese = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcTax = new javax.swing.JCheckBox();
        jcDelivery = new javax.swing.JCheckBox();
        jcmbDrink = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlbCostofDrinks = new javax.swing.JLabel();
        jlbCostofMeal = new javax.swing.JLabel();
        jlbCostofDelivery = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jBtnTotal = new javax.swing.JButton();
        jBtnReceipt = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jcmbCurrency = new javax.swing.JComboBox();
        jtxtConvert = new javax.swing.JTextField();
        jlb1Convert = new javax.swing.JLabel();
        jBtnConvert = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlbSubTotal = new javax.swing.JLabel();
        jlbTax = new javax.swing.JLabel();
        jlbTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBtnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTextReceipt.setColumns(20);
        jTextReceipt.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextReceipt.setRows(5);
        jScrollPane1.setViewportView(jTextReceipt);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("RECEIPT", jPanel8);

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnPlus.setText("+");
        jBtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtnMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnMinus.setText("-");
        jBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinusActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtnMul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnMul.setText("*");
        jBtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMulActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnC.setText("C");
        jBtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCActionPerformed(evt);
            }
        });

        jBtnEqual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnEqual.setText("=");
        jBtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualActionPerformed(evt);
            }
        });

        jBtnDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnDiv.setText("/");
        jBtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivActionPerformed(evt);
            }
        });

        jBtnPorM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnPorM.setText("+/-");
        jBtnPorM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPorMActionPerformed(evt);
            }
        });

        jBtnDeci.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnDeci.setText(".");
        jBtnDeci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeciActionPerformed(evt);
            }
        });

        jBtnArrow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnArrow.setText("←");
        jBtnArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnArrowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBtn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jBtn0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtnArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnDeci, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBtn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtn8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(jBtn5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(jBtnPorM, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jBtnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(3, 3, 3))
                                    .addComponent(jBtnMul, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(jBtnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jBtnEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnPorM, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnDeci, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CALCULATOR", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jcChicken.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcChicken.setText("Chicken Burger");
        jcChicken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcChickenMouseClicked(evt);
            }
        });
        jcChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcChickenActionPerformed(evt);
            }
        });

        jcCheese.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcCheese.setText("Cheese Burger");
        jcCheese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcCheeseMouseClicked(evt);
            }
        });
        jcCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCheeseActionPerformed(evt);
            }
        });

        jcTikki.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcTikki.setText("McAloo Tikki");
        jcTikki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcTikkiMouseClicked(evt);
            }
        });
        jcTikki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTikkiActionPerformed(evt);
            }
        });

        jcZinger.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcZinger.setText("Zinger Burger");
        jcZinger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcZingerMouseClicked(evt);
            }
        });
        jcZinger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcZingerActionPerformed(evt);
            }
        });

        jtxtTikki.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtTikki.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtTikki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTikkiActionPerformed(evt);
            }
        });

        jtxtChicken.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtChicken.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtxtZinger.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtZinger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtxtCheese.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtCheese.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Drinks");

        jcTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcTax.setText("Tax");
        jcTax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcTaxMouseClicked(evt);
            }
        });
        jcTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTaxActionPerformed(evt);
            }
        });

        jcDelivery.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcDelivery.setText("Home Delivery");
        jcDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcDeliveryMouseClicked(evt);
            }
        });
        jcDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDeliveryActionPerformed(evt);
            }
        });

        jcmbDrink.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcmbDrink.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a drink", "Cold Coffee", "Cola", "Banana Shake", "Chocolate Shake", "Ice Tea", "Tea", "Coffee" }));
        jcmbDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbDrinkActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Quantity");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Item");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcTikki)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcCheese)
                                    .addComponent(jcZinger))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtZinger, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtTikki, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                                    .addComponent(jcChicken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtChicken, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcmbDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcTax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcDelivery)))
                        .addGap(34, 34, 34))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcChicken)
                    .addComponent(jtxtChicken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCheese)
                    .addComponent(jtxtCheese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcTikki)
                    .addComponent(jtxtTikki, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcZinger)
                    .addComponent(jtxtZinger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcTax)
                    .addComponent(jcDelivery))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Cost of Drinks");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Cost of Meal");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Cost of Delivery");

        jlbCostofDrinks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbCostofDrinks.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbCostofDrinks.setText("0.00");
        jlbCostofDrinks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlbCostofMeal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbCostofMeal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbCostofMeal.setText("0.00");
        jlbCostofMeal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlbCostofDelivery.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbCostofDelivery.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbCostofDelivery.setText("0.00");
        jlbCostofDelivery.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbCostofDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCostofMeal, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jlbCostofDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCostofDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlbCostofMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jlbCostofDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jBtnTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnTotal.setText("Total");
        jBtnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnTotalMouseClicked(evt);
            }
        });
        jBtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTotalActionPerformed(evt);
            }
        });

        jBtnReceipt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnReceipt.setText("Receipt");
        jBtnReceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnReceiptMouseClicked(evt);
            }
        });
        jBtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReceiptActionPerformed(evt);
            }
        });

        jBtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jBtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jBtnTotal)
                .addGap(52, 52, 52)
                .addComponent(jBtnReceipt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jBtnReset)
                .addGap(70, 70, 70)
                .addComponent(jBtnExit)
                .addGap(85, 85, 85))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnTotal)
                    .addComponent(jBtnReceipt)
                    .addComponent(jBtnReset)
                    .addComponent(jBtnExit))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jcmbCurrency.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmbCurrency.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one...", "US", "Australia", "Japan", "Pound", " " }));
        jcmbCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCurrencyActionPerformed(evt);
            }
        });

        jtxtConvert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtConvert.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlb1Convert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlb1Convert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb1Convert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jBtnConvert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnConvert.setText("Convert");
        jBtnConvert.setBorder(null);
        jBtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConvertActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Currency Converter");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jBtnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlb1Convert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtConvert)
                            .addComponent(jcmbCurrency, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlb1Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Sub Total :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Tax :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Total :");

        jlbSubTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbSubTotal.setText("0.00");
        jlbSubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlbTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbTax.setText("0.00");
        jlbTax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlbTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbTotal.setText("0.00");
        jlbTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbTax, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jlbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jlbSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jlbTax, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(jlbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BILLING SYSTEM");

        jBtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnUpdate.setText("Update Prices");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Update Currency");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnUpdate)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCheeseActionPerformed
        double cheese = Double.parseDouble(jtxtCheese.getText());
        
        if(jcCheese.isSelected()&&jcChicken.isSelected())
        {
            arr[1]=(cheese*costCheese);
        } 
    }//GEN-LAST:event_jcCheeseActionPerformed

    private void jtxtTikkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTikkiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTikkiActionPerformed

    private void jcTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTaxActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        if(c==1)
        {
            jtxtDisplay.setText("");
            c=0;
        }
        String EnterNumber = jtxtDisplay.getText()+jBtn7.getText();
       jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        if(c==1)
        {
            jtxtDisplay.setText("");
            c=0;
        }
        String EnterNumber = jtxtDisplay.getText()+jBtn8.getText();
       jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
       if(c==1)
        {
            jtxtDisplay.setText("");
            c=0;
        }
        String EnterNumber = jtxtDisplay.getText()+jBtn9.getText();
       jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        if(c==1)
        {
            jtxtDisplay.setText("");
            c=0;
        }
        String EnterNumber = jtxtDisplay.getText()+jBtn4.getText();
       jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
       if(c==1)
        {
            jtxtDisplay.setText("");
            c=0;
        }
        String EnterNumber = jtxtDisplay.getText()+jBtn5.getText();
       jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        if(c==1)
        {
            jtxtDisplay.setText("");
            c=0;
        }
        String EnterNumber = jtxtDisplay.getText()+jBtn6.getText();
       jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        if(c==1)
        {
            jtxtDisplay.setText("");
            c=0;
        }
        String EnterNumber = jtxtDisplay.getText()+jBtn1.getText();
       jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
       if(c==1)
        {
            jtxtDisplay.setText("");
            c=0;
        }
        String EnterNumber = jtxtDisplay.getText()+jBtn2.getText();
       jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        if(c==1)
        {
            jtxtDisplay.setText("");
            c=0;
        }
        String EnterNumber = jtxtDisplay.getText()+jBtn3.getText();
       jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        if(c==1)
        {
            jtxtDisplay.setText("");
            c=0;
        }
        String EnterNumber = jtxtDisplay.getText()+jBtn0.getText();
       jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCActionPerformed
        jtxtDisplay.setText(null);
    }//GEN-LAST:event_jBtnCActionPerformed

    private void jBtnArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnArrowActionPerformed
        String backspace=null;
        if(jtxtDisplay.getText().length()>0){
            StringBuilder str = new StringBuilder(jtxtDisplay.getText());
            str.deleteCharAt(jtxtDisplay.getText().length()-1);
            backspace = str.toString();
            jtxtDisplay.setText(backspace);
        }
    }//GEN-LAST:event_jBtnArrowActionPerformed

    private void jBtnDeciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeciActionPerformed
        if(c==1)
        {
            jtxtDisplay.setText("");
            c=0;
        }
        jtxtDisplay.setText(jtxtDisplay.getText()+jBtnDeci.getText());
    }//GEN-LAST:event_jBtnDeciActionPerformed

    private void jBtnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMulActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="*";
    }//GEN-LAST:event_jBtnMulActionPerformed

    private void jBtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivActionPerformed
         firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="/";
    }//GEN-LAST:event_jBtnDivActionPerformed

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinusActionPerformed
         firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="-";
    }//GEN-LAST:event_jBtnMinusActionPerformed

    private void jBtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusActionPerformed
         firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="+";
    }//GEN-LAST:event_jBtnPlusActionPerformed

    private void jBtnPorMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPorMActionPerformed
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = ops*(-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnPorMActionPerformed

    private void jBtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqualActionPerformed
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if(operation == "+")
        {
            result = firstnum + secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
        else  if(operation == "-")
        {
            result = firstnum - secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
        else  if(operation == "*")
        {
            result = firstnum * secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
        else  if(operation == "/")
        {
            result = firstnum / secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
        else  if(operation == "%")
        {
            result = firstnum % secondnum;
            answer = String.format("%.2f",result);
            jtxtDisplay.setText(answer);
        }
        c++;
    }//GEN-LAST:event_jBtnEqualActionPerformed

    private void jBtnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConvertActionPerformed
        double rupee = Double.parseDouble(jtxtConvert.getText());
        if(jcmbCurrency.getSelectedItem().equals("US"))
        {
            String convert = String.format("%.2f Dollar",rupee*us);
            jlb1Convert.setText(convert);
        }
        else if(jcmbCurrency.getSelectedItem().equals("Australia"))
        {
            String convert = String.format("%.2f Dollar",rupee*aus);
            jlb1Convert.setText(convert);
        }
        else if(jcmbCurrency.getSelectedItem().equals("Japan"))
        {
            String convert = String.format("%.2f Yen",rupee*jap);
            jlb1Convert.setText(convert);
        }
        else if(jcmbCurrency.getSelectedItem().equals("Pound"))
        {
            String convert = String.format("%.2f Pound",rupee*pound);
            jlb1Convert.setText(convert);
        }
        
    }//GEN-LAST:event_jBtnConvertActionPerformed

    private void jcmbDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbDrinkActionPerformed
        
        if(jcmbDrink.getSelectedItem().equals("Tea"))
        {
            String convert = String.format("%.2f",Tea);
            jlbCostofDrinks.setText(convert);
        }
        else if(jcmbDrink.getSelectedItem().equals("Ice Tea"))
        {
            String convert = String.format("%.2f",iceTea);
            jlbCostofDrinks.setText(convert);
        }
        else if(jcmbDrink.getSelectedItem().equals("Coffee"))
        {
            String convert = String.format("%.2f",coffee);
            jlbCostofDrinks.setText(convert);
        }
        else if(jcmbDrink.getSelectedItem().equals("Cold Coffee"))
        {
            String convert = String.format("%.2f",coldCoffee);
            jlbCostofDrinks.setText(convert);
        }
        else if(jcmbDrink.getSelectedItem().equals("Cola"))
        {
            String convert = String.format("%.2f",cola);
            jlbCostofDrinks.setText(convert);
        }
        else if(jcmbDrink.getSelectedItem().equals("Banana Shake"))
        {
            String convert = String.format("%.2f",banana);
            jlbCostofDrinks.setText(convert);
        }
        else if(jcmbDrink.getSelectedItem().equals("Chocolate Shake"))
        {
            String convert = String.format("%.2f",choco);
            jlbCostofDrinks.setText(convert);
        }
        else if(jcmbDrink.getSelectedItem().equals("Select a drink"))
        {
            jlbCostofDrinks.setText("0.00");
        }
    }//GEN-LAST:event_jcmbDrinkActionPerformed

    private void jcmbCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCurrencyActionPerformed
        if(jcmbCurrency.getSelectedItem().equals("Choose one..."))
        {
            jlb1Convert.setText("");
            jtxtConvert.setText("");
        }
    }//GEN-LAST:event_jcmbCurrencyActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jcDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcDeliveryMouseClicked
        
        if(jcDelivery.isSelected())
        {
            String deliver = String.format("%.2f",del);
            jlbCostofDelivery.setText(deliver);
        }
        else
        {
            jlbCostofDelivery.setText("0.00");
        }
    }//GEN-LAST:event_jcDeliveryMouseClicked

    private void jcDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDeliveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcDeliveryActionPerformed

    private void jBtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReceiptActionPerformed
      
    }//GEN-LAST:event_jBtnReceiptActionPerformed

    private void jBtnReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnReceiptMouseClicked
       jTextReceipt.setText(null);
        double cost1 = Double.parseDouble(jlbCostofDrinks.getText());
       double cost2 = Double.parseDouble(jlbCostofDelivery.getText());
       double cost3 = Double.parseDouble(jlbCostofMeal.getText());
       double cost4 = Double.parseDouble(jlbTax.getText());
       String cost5 = jlbSubTotal.getText();
       String cost6 = jlbTotal.getText();
       jTextReceipt.append("\tYour Bill Is As Follows :\n\n"+"Cost of Meal :\t\t"
       +cost3+"\nCost of Drinks :\t"+cost1+"\nCost of Delivery :\t"+cost2+"\nSub Total :\t\t"
       +cost5+"\nTax :\t\t\t"+cost4+"\nTotal Payable Amount :\t"+cost6+"\n\nThanks For Ordering\n\n");
         
    }//GEN-LAST:event_jBtnReceiptMouseClicked

    private void jcTaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcTaxMouseClicked
        double total1 = Double.parseDouble(jlbCostofDrinks.getText());
        double total2 = Double.parseDouble(jlbCostofMeal.getText());
        
        double allTotal = (total1+total2)*tax;
        if(jcTax.isSelected())
        {
            String tax_amt = String.format("%.2f",allTotal);
            jlbTax.setText(tax_amt);
        }
        else
        {
            jlbTax.setText("0.00");
        }
    }//GEN-LAST:event_jcTaxMouseClicked

    private void jcChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcChickenActionPerformed
       
       double chicken = Double.parseDouble(jtxtChicken.getText());
        
        if(jcChicken.isSelected())
        {
            arr[0]=(chicken*costChicken);
        } 
        
    }//GEN-LAST:event_jcChickenActionPerformed

    private void jcTikkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTikkiActionPerformed
       double tikki = Double.parseDouble(jtxtTikki.getText());
        
        if(jcCheese.isSelected()&&jcChicken.isSelected()&&jcTikki.isSelected())
        {
            arr[2]=(tikki*costTikki);
        } 
    }//GEN-LAST:event_jcTikkiActionPerformed

    private void jcZingerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcZingerActionPerformed
        double zinger = Double.parseDouble(jtxtZinger.getText());
      
        if(jcCheese.isSelected()&&jcChicken.isSelected()&&jcTikki.isSelected()&&jcZinger.isSelected())
        {
            arr[3]=(zinger*costZinger);
        }
    }//GEN-LAST:event_jcZingerActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
       jlbCostofDelivery.setText("0.00");
        jlb1Convert.setText(null);
        jlbCostofDrinks.setText("0.00");
        jlbCostofMeal.setText("0.00");
        jlbSubTotal.setText("0.00");
        jlbTax.setText("0.00");
        jlbTotal.setText("0.00");
        jtxtConvert.setText(null);
        jtxtDisplay.setText(null);
        jtxtChicken.setText(null);
        jtxtCheese.setText(null);
        jtxtTikki.setText(null);
        jtxtZinger.setText(null);
        jcTax.setSelected(false);
        jcDelivery.setSelected(false);
        jcChicken.setSelected(false);
        jcCheese.setSelected(false);
        jcTikki.setSelected(false);
        jcZinger.setSelected(false);
        jTextReceipt.setText(null);
        jcmbDrink.setSelectedIndex(0);
        jcmbCurrency.setSelectedIndex(0);
        
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jcChickenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcChickenMouseClicked
        double meal = Double.parseDouble(jlbCostofMeal.getText());
        double chicken = Double.parseDouble(jtxtChicken.getText());
        
        if(jcChicken.isSelected())
        {
            arr[0]=(chicken*costChicken) + meal;
            String show = String.format("%.2f",arr[0]);
            jlbCostofMeal.setText(show);
        }
        else
        {
            meal = Double.parseDouble(jlbCostofMeal.getText());
            chicken = Double.parseDouble(jtxtChicken.getText());
            meal = meal - (chicken*costChicken);
           String e = String.format("%.2f", meal);
            jlbCostofMeal.setText(e);
        }
    }//GEN-LAST:event_jcChickenMouseClicked

    private void jcCheeseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcCheeseMouseClicked
        double meal = Double.parseDouble(jlbCostofMeal.getText());
        double cheese = Double.parseDouble(jtxtCheese.getText());
        
        if(jcCheese.isSelected())
        {
            arr[1]=(cheese*costCheese) + meal;
            String show = String.format("%.2f",arr[1]);
            jlbCostofMeal.setText(show);
        }
        else
        {
             meal = Double.parseDouble(jlbCostofMeal.getText());
            cheese = Double.parseDouble(jtxtCheese.getText());
            meal = meal - (cheese*costCheese);
           String e = String.format("%.2f", meal);
            jlbCostofMeal.setText(e);
        }
    }//GEN-LAST:event_jcCheeseMouseClicked

    private void jcTikkiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcTikkiMouseClicked
         double meal = Double.parseDouble(jlbCostofMeal.getText());
        double tikki = Double.parseDouble(jtxtTikki.getText());
        
        if(jcTikki.isSelected())
        {
            arr[2]=(tikki*costTikki) + meal;
            String show = String.format("%.2f",arr[2]);
            jlbCostofMeal.setText(show);
        }
        else
        {
             meal = Double.parseDouble(jlbCostofMeal.getText());
            tikki = Double.parseDouble(jtxtTikki.getText());
            meal = meal - (tikki*costTikki);
           String e = String.format("%.2f", meal);
            jlbCostofMeal.setText(e);
        }
    }//GEN-LAST:event_jcTikkiMouseClicked

    private void jcZingerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcZingerMouseClicked
         double meal = Double.parseDouble(jlbCostofMeal.getText());
        double zinger = Double.parseDouble(jtxtZinger.getText());
        
        if(jcZinger.isSelected())
        {
            arr[3]=(zinger*costZinger) + meal;
            String show = String.format("%.2f",arr[3]);
            jlbCostofMeal.setText(show);
        }
        else
        {
            meal = Double.parseDouble(jlbCostofMeal.getText());
            zinger = Double.parseDouble(jtxtZinger.getText());
            meal = meal - (zinger*costZinger);
           String e = String.format("%.2f", meal);
            jlbCostofMeal.setText(e);
        }
    }//GEN-LAST:event_jcZingerMouseClicked

    private void jBtnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnTotalMouseClicked
        double total1 = Double.parseDouble(jlbCostofDrinks.getText());
        double total2 = Double.parseDouble(jlbCostofMeal.getText());
        double total3 = Double.parseDouble(jlbCostofDelivery.getText());
        
        double allTotal = total1+total2+total3;
        String set1 = String.format("Rs %.2f", allTotal);
        jlbSubTotal.setText(set1);
        if(jcTax.isSelected())
        {
        double tt = (total1+total2)*0.14;
        String set3 = String.format("%.2f",tt);
        jlbTax.setText(set3);
        }
        else
        {
            jlbTax.setText("0.00");
        }
        double r=(allTotal+Double.parseDouble(jlbTax.getText()));
        String set2 = String.format("Rs %.2f", r);
        jlbTotal.setText(set2);
        
        
        
        
    }//GEN-LAST:event_jBtnTotalMouseClicked

    private void jBtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnTotalActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed

        UpdateInfo t = new UpdateInfo();
        t.setVisible(true);
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Currency t1 = new Currency();
        t1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FoodTruck().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FoodTruck.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnArrow;
    private javax.swing.JButton jBtnC;
    private javax.swing.JButton jBtnConvert;
    private javax.swing.JButton jBtnDeci;
    private javax.swing.JButton jBtnDiv;
    private javax.swing.JButton jBtnEqual;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnMinus;
    private javax.swing.JButton jBtnMul;
    private javax.swing.JButton jBtnPlus;
    private javax.swing.JButton jBtnPorM;
    private javax.swing.JButton jBtnReceipt;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnTotal;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextReceipt;
    private javax.swing.JCheckBox jcCheese;
    private javax.swing.JCheckBox jcChicken;
    private javax.swing.JCheckBox jcDelivery;
    private javax.swing.JCheckBox jcTax;
    private javax.swing.JCheckBox jcTikki;
    private javax.swing.JCheckBox jcZinger;
    private javax.swing.JComboBox jcmbCurrency;
    private javax.swing.JComboBox jcmbDrink;
    private javax.swing.JLabel jlb1Convert;
    private javax.swing.JLabel jlbCostofDelivery;
    private javax.swing.JLabel jlbCostofDrinks;
    private javax.swing.JLabel jlbCostofMeal;
    private javax.swing.JLabel jlbSubTotal;
    private javax.swing.JLabel jlbTax;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JTextField jtxtCheese;
    private javax.swing.JTextField jtxtChicken;
    private javax.swing.JTextField jtxtConvert;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtTikki;
    private javax.swing.JTextField jtxtZinger;
    // End of variables declaration//GEN-END:variables
}
