/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recipease.gui;

import javax.swing.ImageIcon;
import recipease.objects.RecipeData;
import recipease.utils.SendEmail;

/**
 *
 * @author Laura
 */
public final class Recipe extends javax.swing.JFrame {
String recipeName;
RecipeData rd;
String source;
    /**
     * Creates new form Recipe
     */

     //constructor without parameters
    public Recipe() {

        initComponents();
    }
    
    public Recipe(RecipeData rd) {
        this.rd = rd;
        initComponents();
        setLabels();
        setIng();
        setMethod();
        
    }
    
    public Recipe(RecipeData rd, String s) {
        this.rd = rd;
        source = s;
        initComponents();
        setLabels();
        setIng();
        setMethod();
        jButton2.setText("Suggest something else please!");
        
    }
    
    public final void setLabels(){
        
        recipeLabel.setText(rd.getName());
        cLabel.setText(rd.getCuisine());
        mLabel.setText(rd.getMeal());
        serveLabel.setText(rd.getServes());
        timeLabel.setText(rd.getTime());
       // ingText.setText(rd.getIngredients());
        
    }
//    public final void setRecipeName(String r){
//        recipeName = r;
//        recipeLabel.setText(recipeName);
//    }

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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ingredientLabel = new javax.swing.JLabel();
        ingPane = new javax.swing.JScrollPane();
        ingText = new javax.swing.JTextArea();
        cuisineLabel = new javax.swing.JLabel();
        mealLabel = new javax.swing.JLabel();
        recipeLabel = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        mLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        serveLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(189, 240, 234));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipease/gui/images/r.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipease/gui/images/bowl.png"))); // NOI18N
        jButton2.setText("No thanks! Let's search again.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Yum! Email this to me!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipease/gui/images/hat.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipease/gui/images/hat.png"))); // NOI18N

        ingredientLabel.setText("Ingredients for");

        ingText.setEditable(false);
        ingText.setColumns(20);
        ingText.setRows(5);
        ingPane.setViewportView(ingText);

        cuisineLabel.setText("Cuisine: ");

        mealLabel.setText("Meal: ");

        recipeLabel.setText("jLabel2");

        cLabel.setText("jLabel2");

        mLabel.setText("jLabel2");

        jLabel2.setText("Method:");

        max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipease/gui/images/expandbutton.png"))); // NOI18N
        max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                maxMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                maxMouseReleased(evt);
            }
        });

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipease/gui/images/minbutton.png"))); // NOI18N
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minMouseReleased(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("Serves:");

        jLabel6.setText("Time: ");

        serveLabel.setText("jLabel7");

        timeLabel.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(max)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(min)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ingredientLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(recipeLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ingPane, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cuisineLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cLabel))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(timeLabel))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(mealLabel)
                                                    .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(serveLabel)
                                                    .addComponent(mLabel)))))
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel5)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingredientLabel)
                    .addComponent(recipeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ingPane, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cuisineLabel)
                            .addComponent(cLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mealLabel)
                            .addComponent(mLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(serveLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(timeLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(max)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(min))
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(source == null){
        Search search = new Search();
        search.setVisible(true);
        this.dispose();
        }else{
           SuggestRecipe suggestRecipe = new SuggestRecipe();
           suggestRecipe.setVisible(true);
           this.dispose();
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void maxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMousePressed
        ImageIcon newIcon = new ImageIcon(getClass().getResource("images/expandbuttonclicked.png"));
        max.setIcon(newIcon); 
    }//GEN-LAST:event_maxMousePressed

    private void maxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseReleased
         ImageIcon newIcon = new ImageIcon(getClass().getResource("images/expandbutton.png"));
         max.setIcon(newIcon); 
    }//GEN-LAST:event_maxMouseReleased

    private void minMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMousePressed
        ImageIcon newIcon = new ImageIcon(getClass().getResource("images/minbuttonclicked.png"));
        min.setIcon(newIcon); 
    }//GEN-LAST:event_minMousePressed

    private void minMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseReleased
        ImageIcon newIcon = new ImageIcon(getClass().getResource("images/minbutton.png"));
        min.setIcon(newIcon);         
    }//GEN-LAST:event_minMouseReleased

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
        //makes text box longer
        
        this.setSize(645, 707);
       
        jTextArea1.setSize(94, 264); 
        jScrollPane1.setSize(94, 264);
        System.out.println("clicked");
    }//GEN-LAST:event_maxMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setSize(645, 607);
       
        jTextArea1.setSize(94, 164); 
        jScrollPane1.setSize(94, 164);
        System.out.println("clicked");
    }//GEN-LAST:event_minMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        SendEmail sendEmail = new SendEmail();
        sendEmail.run();
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recipe().setVisible(true);
            }
        });
    }
    
    public void setIng(){
        
        //sets the text for the ingredients
        ingText.setText(rd.getIngredients());
        ingText.setCaretPosition(0);

       
    }
    
    public final void setMethod(){
        //sets text of method
        jTextArea1.setText(rd.getMethod());
        jTextArea1.setCaretPosition(0);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cLabel;
    private javax.swing.JLabel cuisineLabel;
    private javax.swing.JScrollPane ingPane;
    private javax.swing.JTextArea ingText;
    private javax.swing.JLabel ingredientLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mLabel;
    private javax.swing.JLabel max;
    private javax.swing.JLabel mealLabel;
    private javax.swing.JLabel min;
    private javax.swing.JLabel recipeLabel;
    private javax.swing.JLabel serveLabel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
