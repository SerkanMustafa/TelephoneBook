package base;

import javax.swing.*; //biblioteka za jButton-jLabel i drugi j-options
import java.util.*; //za arraylist

public class TelephoneBook extends javax.swing.JFrame {
public int labelSession = 0;
public ArrayList<String> users = new ArrayList<String>();
    public TelephoneBook() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAddUser = new javax.swing.JMenuItem();
        jMenuSearchUser = new javax.swing.JMenuItem();

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

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelephoneBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuAddUser;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuSearchUser;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
