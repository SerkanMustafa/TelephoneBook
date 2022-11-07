package base;

import java.awt.Color;
import javax.swing.*; //biblioteka za jButton-jLabel i drugi j-options
import java.util.*; //za arraylist
import java.awt.color.*;
import static java.awt.Color.*;

public class TelephoneBook extends javax.swing.JFrame {
public int labelSession = 0;
public ArrayList<String> users = new ArrayList<String>();
    public TelephoneBook() {
        initComponents();
        LoginPage.setVisible(true);
        LoginPage.setSize(300,300);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPage = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAddUser = new javax.swing.JMenuItem();
        jMenuSearchUser = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        LoginPage.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                LoginPageWindowClosing(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPageLayout = new javax.swing.GroupLayout(LoginPage.getContentPane());
        LoginPage.getContentPane().setLayout(LoginPageLayout);
        LoginPageLayout.setHorizontalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(Login)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        LoginPageLayout.setVerticalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Login)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        jMenu1.setText("Потребители");

        jMenuAddUser.setText("Добави");
        jMenuAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddUserActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAddUser);

        jMenuSearchUser.setText("Търси");
        jMenuSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSearchUserActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSearchUser);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Съобщения");

        jMenuItem1.setText("Messages");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddUserActionPerformed
     
        String name= JOptionPane.showInputDialog(this,"Въведете име на нов потребител ","Нов потребител",1); 
//joptinpanshowninputdialag vryshta stringova promenliva zatova go zapazvame v tip String, vyvedeniq tekst shte ni potrqbva v ostanalata cast na zadacata
        String phone= JOptionPane.showInputDialog(this,"Въведете телефонен номер","Нов Потребител",1);

        JLabel nameLabel = new JLabel();
        jPanel1.add(nameLabel);
        nameLabel.setLocation(50, 50 +30*labelSession);
        nameLabel.setSize(200, 20);
        nameLabel.setText(name);
        
         JLabel phoneLabel = new JLabel();
        jPanel1.add(phoneLabel);
        phoneLabel.setLocation(250, 50 + 30*labelSession);
        phoneLabel.setSize(200, 20);
        phoneLabel.setText(phone);
        labelSession++;    
        users.add(name+"!-"+phone);
        
    }//GEN-LAST:event_jMenuAddUserActionPerformed

    private void jMenuSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSearchUserActionPerformed
        String name= JOptionPane.showInputDialog(this,"Въведете име ","Намери телефонния номер на потребител",3); 
            boolean found = false;
        for (int i = 0; i < users.size(); i++) {
            String[] item = users.get(i).split("!-");
            if (name.toLowerCase().equals(item[0].toLowerCase())) { //CASE INSENSITIVE
                JOptionPane.showMessageDialog(this, "Телефонният номер на " + item[0] + " е " + item[1]);
                found=true;                    
            }
        }if(!found){
        JOptionPane.showMessageDialog(this, "Не е намерен такъв потребител");}
    }//GEN-LAST:event_jMenuSearchUserActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
            
        int result = JOptionPane.showConfirmDialog(this, "Exit?","Exit?",0 );
      
        if(result != 0)
        {
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }else{
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);}

    }//GEN-LAST:event_formWindowClosing

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
String name = jTextField1.getText();
String password = String.valueOf((jPasswordField1.getPassword()));

if(name.equals("admin") && password.equals("admin")){
    this.setVisible(true);
    LoginPage.dispose();
}else{
LoginPage.getContentPane().setBackground(red);
}
    }//GEN-LAST:event_LoginActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void LoginPageWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LoginPageWindowClosing
        System.exit(0);
    }//GEN-LAST:event_LoginPageWindowClosing

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      Messages newFrame = new Messages();
      newFrame.setVisible(true);
      
       
           
    }//GEN-LAST:event_jMenuItem1ActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelephoneBook().setVisible(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JDialog LoginPage;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAddUser;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuSearchUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
