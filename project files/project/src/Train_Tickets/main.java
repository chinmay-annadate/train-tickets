/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Train_Tickets;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author user
 */
public class main extends javax.swing.JFrame {
    private Object JoptionPane;
  

    /**
     * Creates new form main
     */
    public main() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Std = new javax.swing.JRadioButton();
        Eco = new javax.swing.JRadioButton();
        First = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Adult = new javax.swing.JRadioButton();
        Child = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Single = new javax.swing.JRadioButton();
        Return = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Sub = new javax.swing.JTextField();
        Tax = new javax.swing.JTextField();
        Totl = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Dest = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Train Ticketing System");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 20, 416, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Class");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 80, 54, 29);

        buttonGroup1.add(Std);
        Std.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Std.setForeground(new java.awt.Color(255, 255, 255));
        Std.setText("Standard");
        Std.setOpaque(false);
        getContentPane().add(Std);
        Std.setBounds(40, 120, 99, 31);

        buttonGroup1.add(Eco);
        Eco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Eco.setForeground(new java.awt.Color(255, 255, 255));
        Eco.setText("Economic");
        Eco.setOpaque(false);
        getContentPane().add(Eco);
        Eco.setBounds(40, 150, 103, 31);

        buttonGroup1.add(First);
        First.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        First.setForeground(new java.awt.Color(255, 255, 255));
        First.setText("First Class");
        First.setOpaque(false);
        First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstActionPerformed(evt);
            }
        });
        getContentPane().add(First);
        First.setBounds(40, 180, 107, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Adult/Child");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 80, 112, 29);

        buttonGroup2.add(Adult);
        Adult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Adult.setForeground(new java.awt.Color(255, 255, 255));
        Adult.setText("Adult");
        Adult.setOpaque(false);
        getContentPane().add(Adult);
        Adult.setBounds(160, 120, 69, 31);

        buttonGroup2.add(Child);
        Child.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Child.setForeground(new java.awt.Color(255, 255, 255));
        Child.setText("Child");
        Child.setOpaque(false);
        getContentPane().add(Child);
        Child.setBounds(160, 150, 67, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Type");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 80, 52, 29);

        buttonGroup3.add(Single);
        Single.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Single.setForeground(new java.awt.Color(255, 255, 255));
        Single.setText("Single");
        Single.setOpaque(false);
        getContentPane().add(Single);
        Single.setBounds(280, 120, 75, 31);

        buttonGroup3.add(Return);
        Return.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Return.setForeground(new java.awt.Color(255, 255, 255));
        Return.setText("Return");
        Return.setOpaque(false);
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        getContentPane().add(Return);
        Return.setBounds(280, 150, 81, 31);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Destination");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 80, 118, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Subtotal:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 240, 81, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tax:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 280, 40, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 320, 53, 25);

        Sub.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(Sub);
        Sub.setBounds(170, 240, 138, 28);

        Tax.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaxActionPerformed(evt);
            }
        });
        getContentPane().add(Tax);
        Tax.setBounds(170, 280, 138, 28);

        Totl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(Totl);
        Totl.setBounds(170, 320, 138, 28);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Calculate Amount");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 240, 171, 31);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Make Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 280, 147, 31);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(380, 320, 75, 31);

        Dest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Dest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select City>", "Mumbai", "Delhi", "Kolkata", "Chennai" }));
        Dest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestActionPerformed(evt);
            }
        });
        getContentPane().add(Dest);
        Dest.setBounds(370, 120, 140, 28);

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(390, 370, 53, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Train_Tickets/new.PNG"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 540, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Double phi=0.0;
        String cls="",adu="",typ="",de="";
        //class
        Double access_fee=0.00;
        if(Std.isSelected())
        {access_fee=100.00;
        cls="Standard";
        }

        else if(Eco.isSelected())
        {access_fee=200.00;
        cls="Economic";
        }

        else if(First.isSelected())
        {access_fee=400.00;
        cls="First Class";
        }
        
        else
        {JOptionPane.showMessageDialog(null,"Please select class");
        phi=1.0;
        }

        //Adult/child
        Double age=0.00;
        if (Adult.isSelected())
        {age=100.00;
        adu="Adult";
        }

        else if (Child.isSelected())
        {age=50.00;
        adu="Child";
        }
        
        else
        {JOptionPane.showMessageDialog(null,"Please select adult/child");
        phi=1.0;
        }

        //JourneyType
        Double trip=0.00;
        if (Single.isSelected())
        {trip=1.00;
        typ="Single";
        }

        else if (Return.isSelected())
        {trip=2.00;
        typ="Return";
        }
        
        else
        {JOptionPane.showMessageDialog(null,"Please select type of journey");
        phi=1.0;        }

        //Destination
        Double dest=0.00;
        if (Dest.getSelectedItem().equals("Mumbai"))
        {dest=100.00;
        de="Mumbai";
        }

        else if (Dest.getSelectedItem().equals("Chennai"))
        {dest=200.00;
        de="Chennai";
        }

        else if (Dest.getSelectedItem().equals("Delhi"))
        {dest=300.00;
        de="Delhi";
        }

        else if (Dest.getSelectedItem().equals("Kolkata"))
        {dest=400.00;
        de="Kolkata";
        }
        
        else
        {JOptionPane.showMessageDialog(null,"Please select destination");
            phi=1.0;}
        
        Double SubTotl= (access_fee + age + dest)*trip;
        Double tax=0.20*SubTotl;
        Double totl= SubTotl + tax;
       
        if(phi==1.0)
            {Sub.setText(null);        
             Tax.setText(null);        
             Totl.setText(null);   }
        
        else
        {Sub.setText("₹ "+SubTotl +"/-");        
         Tax.setText("₹ "+tax +"/-");        
         Totl.setText("₹ "+totl +"/-");
        }
        
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/accounts","root","root");
            
            Statement stmt=con.createStatement();
            
            String query= "Insert into main values('"+cls+"' , '"+adu+"' , '"+typ+"' , '"+de+"' , '"+totl+"')";
            
            int rs=stmt.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Click on Make Payment");            
          }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());        
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Std.setSelected(false);
        Eco.setSelected(false);
        First.setSelected(false);
        Adult.setSelected(false);
        Child.setSelected(false);
        Single.setSelected(false);
        Return.setSelected(false);
        Dest.setSelectedItem("<Select City>");
        Sub.setText(null);
        Tax.setText(null);
        Totl.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        card obj= new card();
        String check=Sub.getText();
        String check1="";
        
        if(check.equals(check1))
            JOptionPane.showMessageDialog(null,"Please Calculate Amount");
        else
        {obj.setVisible(true);
        this.dispose();}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TaxActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void DestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null,"Are you sure you want to Exit", "Exit Program Message Box", 
                JOptionPane.YES_NO_OPTION);
        
       if (confirmed==JOptionPane.YES_OPTION){
           dispose();
       }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Adult;
    private javax.swing.JRadioButton Child;
    private javax.swing.JComboBox Dest;
    private javax.swing.JRadioButton Eco;
    private javax.swing.JRadioButton First;
    private javax.swing.JRadioButton Return;
    private javax.swing.JRadioButton Single;
    private javax.swing.JRadioButton Std;
    private javax.swing.JTextField Sub;
    private javax.swing.JTextField Tax;
    private javax.swing.JTextField Totl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
