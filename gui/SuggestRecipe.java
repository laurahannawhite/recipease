/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recipease.gui;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
import recipease.objects.RecipeData;

/**
 *
 * @author Laura
 */
public class SuggestRecipe extends javax.swing.JFrame {
Connection con;
ConnectionManager cm;

    /**
     * Creates new form SuggestRecipe
     */
    public SuggestRecipe() {
        initComponents();
        cm = new ConnectionManager();
        con = cm.CreateConnection();
    }
    
    public SuggestRecipe(Connection c, ConnectionManager c1) {
        con = c;
        cm = c1;
        initComponents();
    }
    
    private void suggestion(){
        String criteria;
        RecipeData recData = new RecipeData();
        
        if(!"".equals(cuisineField.getText())){
            criteria = cuisineField.getText();
            String qry = "SELECT * FROM recipe WHERE Cuisine = '" + criteria +"'";
            System.out.println(qry);
            try{
            Statement sta = con.prepareStatement(qry);
            ResultSet rs = sta.executeQuery(qry);
                        
            //Gets the number of results
            rs.last();
            int len = rs.getRow();
            
            if(len > 0){
            //Generates a random number
            Random rand = new Random();
            int x = rand.nextInt(len) + 1;
                System.out.println("Length of result set: " + len);
                System.out.println("Random number: " + x);
            
            //Picks a random entry from the result set
            
            rs.beforeFirst();
            //System.out.println(rs.getString(2));
            while(rs.next()){
                System.out.println(rs.getString(3));
                if(rs.getRow() == x){
                //set name
                recData.setName(rs.getString(2));
                //set ingredients
                recData.setIngredients(rs.getString(3));
                //set method
                recData.setMethod(rs.getString(4));
                //set cuisine
                recData.setCuisine(rs.getString(5));
                //set meal
                recData.setMeal(rs.getString(6));
                //set servings
                recData.setServes(rs.getString(7));
                //set Time
                recData.setTime(rs.getString(8));
                
                //break;
                }
            }
            
            
            Recipe rec = new Recipe(recData, "suggestion");
            rec.setVisible(true);
            this.dispose();
            }else{
             //if there are no results for the search term, the user is shown a message dialog
                
             JOptionPane.showMessageDialog(null, "Sorry! No results for that. Try again.");
             cuisineField.setText("");
            }
            
            }catch(Exception e){
                System.out.println("Cannot connect to database");
            }
            
            
        }else{
            suggestionMeal();
        }
        
        
        
    }
    
    private void suggestionMeal(){
        
        String meal = (String)mealBox.getSelectedItem();
        System.out.println(meal);
        RecipeData recData = new RecipeData();
        
        String qry = "SELECT * FROM recipe WHERE Meal = '" + meal +"'";
            System.out.println(qry);
            try{
            Statement sta = con.prepareStatement(qry);
            ResultSet rs = sta.executeQuery(qry);
                        
            //Gets the number of results
            rs.last();
            int len = rs.getRow();
            
            if(len > 0){
            //Generates a random number
            Random rand = new Random();
            int x = rand.nextInt(len) + 1;
                System.out.println("Length of result set: " + len);
                System.out.println("Random number: " + x);
            
            //Picks a random entry from the result set
            
            rs.beforeFirst();
            //System.out.println(rs.getString(2));
            while(rs.next()){
                System.out.println(rs.getString(3));
                if(rs.getRow() == x){
                //set name
                recData.setName(rs.getString(2));
                //set ingredients
                recData.setIngredients(rs.getString(3));
                //set method
                recData.setMethod(rs.getString(4));
                //set cuisine
                recData.setCuisine(rs.getString(5));
                //set meal
                recData.setMeal(rs.getString(6));
                //set servings
                recData.setServes(rs.getString(7));
                //set Time
                recData.setTime(rs.getString(8));
                
                //break;
                }
            }
            Recipe rec = new Recipe(recData, "suggestion");
            rec.setVisible(true);
            this.dispose();
            
            }else{
             //if there are no results for the search term, the user is shown a message dialog
                
             JOptionPane.showMessageDialog(null, "Sorry! No results for that. Try again.");
             cuisineField.setText("");
            }
            
            } catch (Exception e){
                System.out.println("cannot connect to database");
            }
           
        
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
        jLabel1 = new javax.swing.JLabel();
        cuisineField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mealBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Can't decide what to eat? Let me suggest something for you!");

        cuisineField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cuisineFieldKeyReleased(evt);
            }
        });

        jLabel3.setText("Enter a cuisine:");

        jLabel4.setText("OR");

        mealBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Dinner", "Breakfast", "Lunch", "Snack", "Dessert", "Appetiser", "Salad"}));

        jLabel5.setText("Choose a meal type:");

        jButton1.setText("Let's Go!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(mealBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cuisineField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel3)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuisineField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mealBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        suggestion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cuisineFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuisineFieldKeyReleased
         if (evt.getKeyCode() == KeyEvent.VK_ENTER){
             //allows the user to just hit enter to search
             suggestion();
         }
    }//GEN-LAST:event_cuisineFieldKeyReleased

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
            java.util.logging.Logger.getLogger(SuggestRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuggestRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuggestRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuggestRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuggestRecipe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cuisineField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox mealBox;
    // End of variables declaration//GEN-END:variables
}
