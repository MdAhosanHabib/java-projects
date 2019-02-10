
package examples;

import static java.awt.SystemColor.text;


public class Ruting extends javax.swing.JFrame {

    
    public Ruting() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox();
        Section = new javax.swing.JComboBox();
        show = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 6, true));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daffodil International University(DIU)");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Class ruting(PC)");

        day.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "Satureday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        Section.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Section.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Section", "Pc-A", "Pc-B", "Pc-C", "Pc-D", "Pc-E" }));
        Section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionActionPerformed(evt);
            }
        });

        show.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        home.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 3, true));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Time", "Course", "RoomNo", "Teacher Name"
            }
        ));
        jScrollPane1.setViewportView(table);

        clear.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel3.setText("MD. AHOSAN HABIB");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Section, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(549, 549, 549)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(day, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Section, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(home)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_dayActionPerformed

    private void SectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SectionActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
          table.setValueAt("", 0, 0);

                table.setValueAt(null, 0, 1);
                  table.setValueAt(null, 0, 2);
                    table.setValueAt(null, 0, 3);
                      table.setValueAt("", 1, 0);

                       table.setValueAt(null, 1, 1);
                       table.setValueAt(null, 1, 2);
                       table.setValueAt(null, 1, 3);
                         table.setValueAt("", 2, 0);

                            table.setValueAt(null, 2, 1);
                             table.setValueAt(null, 2, 2);
                          table.setValueAt(null, 2, 3);
                
    }//GEN-LAST:event_clearActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
       if(Section.getSelectedItem()=="Pc-D"){
          if(day.getSelectedItem()=="Satureday"){
           table.setValueAt("You have no class",0,1);    
        }
         if(day.getSelectedItem()=="Sunday"){
            table.setValueAt("8.30 am",0, 0);
                table.setValueAt("Bangladesh studies", 0, 1);
                table.setValueAt("Ab3", 0, 2);
                table.setValueAt("KRI",0,3);       
                 table.setValueAt("10.00 am",1, 0);
                table.setValueAt("Digital Electronics", 1, 1);
                table.setValueAt("Ab1-602", 1, 2);
                table.setValueAt("MD",1,3);         
            
   }
          if(day.getSelectedItem()=="Monday"){
            table.setValueAt("11.30 am", 0, 0);
                table.setValueAt("Oop",0, 1);
                table.setValueAt("Ab1-304", 0, 2);
                table.setValueAt("ZH",0,3);
                
                 table.setValueAt("4.00 pm", 1, 0);
                table.setValueAt("Engineering Math",1, 1);
                table.setValueAt("Ab1-302", 1, 2);
                table.setValueAt("MAAM",1,3); 
                
          }
           if(day.getSelectedItem()=="Tuesday"){
            table.setValueAt("01.00 pm", 0, 0);
                table.setValueAt("Bangladesh studys", 0, 1);
                table.setValueAt("Ab3-212", 0, 2);
                table.setValueAt("KRI",0,3);  
                
                 table.setValueAt("2.30 pm", 1, 0);
                 table.setValueAt("Digital Electronics", 1, 1);
                 table.setValueAt("Ab3-214", 1, 2);
                 table.setValueAt("MD",1,3);     
   }
            if(day.getSelectedItem()=="Wednesday"){
            table.setValueAt("8.30 am", 0, 0);
                table.setValueAt("Oop java lab", 0, 1);
                table.setValueAt("Ab1-704", 0, 2);
                table.setValueAt("TK",0,3);      
           
   }
             if(day.getSelectedItem()=="Thursday"){
                   table.setValueAt("8.30 1m", 0, 0);
                table.setValueAt("Engineering Math",0, 1);
                table.setValueAt("Ab1-302", 0, 2);
                table.setValueAt("MAAM",0,3); 
                
               table.setValueAt("2.30 pm", 1, 0);
                 table.setValueAt("Digital Electronics lab", 1, 1);
                 table.setValueAt("Ab3-106", 1, 2);
                 table.setValueAt("MD",1,3);     
   }
               
   }
       if(Section.getSelectedItem()=="Pc-A"){
          if(day.getSelectedItem()=="Satureday"){
           table.setValueAt("You have no class",0,1);    
        }
         if(day.getSelectedItem()=="Sunday"){
            table.setValueAt("8.30 am",0, 0);
                table.setValueAt("Bangladesh studies", 0, 1);
                table.setValueAt("Ab3", 0, 2);
                table.setValueAt("KRI",0,3);       
                 table.setValueAt("10.00 am",1, 0);
                table.setValueAt("Digital Electronics", 1, 1);
                table.setValueAt("Ab1-602", 1, 2);
                table.setValueAt("MD",1,3);         
            
   }
          if(day.getSelectedItem()=="Monday"){
            table.setValueAt("11.30 am", 0, 0);
                table.setValueAt("Oop",0, 1);
                table.setValueAt("Ab1-304", 0, 2);
                table.setValueAt("ZH",0,3);
                
                 table.setValueAt("4.00 pm", 1, 0);
                table.setValueAt("Engineering Math",1, 1);
                table.setValueAt("Ab1-302", 1, 2);
                table.setValueAt("MAAM",1,3); 
                
          }
           if(day.getSelectedItem()=="Tuesday"){
            table.setValueAt("01.00 pm", 0, 0);
                table.setValueAt("Bangladesh studys", 0, 1);
                table.setValueAt("Ab3-212", 0, 2);
                table.setValueAt("KRI",0,3);  
                
                 table.setValueAt("2.30 pm", 1, 0);
                 table.setValueAt("Digital Electronics", 1, 1);
                 table.setValueAt("Ab3-214", 1, 2);
                 table.setValueAt("MD",1,3);     
   }
            if(day.getSelectedItem()=="Wednesday"){
            table.setValueAt("8.30 am", 0, 0);
                table.setValueAt("Oop java lab", 0, 1);
                table.setValueAt("Ab1-704", 0, 2);
                table.setValueAt("TK",0,3);      
           
   }
             if(day.getSelectedItem()=="Thursday"){
                   table.setValueAt("8.30 1m", 0, 0);
                table.setValueAt("Engineering Math",0, 1);
                table.setValueAt("Ab1-302", 0, 2);
                table.setValueAt("MAAM",0,3); 
                
               table.setValueAt("2.30 pm", 1, 0);
                 table.setValueAt("Digital Electronics lab", 1, 1);
                 table.setValueAt("Ab3-106", 1, 2);
                 table.setValueAt("MD",1,3);     
   }
               
   }
       if(Section.getSelectedItem()=="Pc-B"){
          if(day.getSelectedItem()=="Satureday"){
           table.setValueAt("You have no class",0,1);    
        }
         if(day.getSelectedItem()=="Sunday"){
            table.setValueAt("8.30 am",0, 0);
                table.setValueAt("Bangladesh studies", 0, 1);
                table.setValueAt("Ab3", 0, 2);
                table.setValueAt("KRI",0,3);       
                 table.setValueAt("10.00 am",1, 0);
                table.setValueAt("Digital Electronics", 1, 1);
                table.setValueAt("Ab1-602", 1, 2);
                table.setValueAt("MD",1,3);         
            
   }
          if(day.getSelectedItem()=="Monday"){
            table.setValueAt("11.30 am", 0, 0);
                table.setValueAt("Oop",0, 1);
                table.setValueAt("Ab1-304", 0, 2);
                table.setValueAt("ZH",0,3);
                
                 table.setValueAt("4.00 pm", 1, 0);
                table.setValueAt("Engineering Math",1, 1);
                table.setValueAt("Ab1-302", 1, 2);
                table.setValueAt("MAAM",1,3); 
                
          }
           if(day.getSelectedItem()=="Tuesday"){
            table.setValueAt("01.00 pm", 0, 0);
                table.setValueAt("Bangladesh studys", 0, 1);
                table.setValueAt("Ab3-212", 0, 2);
                table.setValueAt("KRI",0,3);  
                
                 table.setValueAt("2.30 pm", 1, 0);
                 table.setValueAt("Digital Electronics", 1, 1);
                 table.setValueAt("Ab3-214", 1, 2);
                 table.setValueAt("MD",1,3);     
   }
            if(day.getSelectedItem()=="Wednesday"){
            table.setValueAt("8.30 am", 0, 0);
                table.setValueAt("Oop java lab", 0, 1);
                table.setValueAt("Ab1-704", 0, 2);
                table.setValueAt("TK",0,3);      
           
   }
             if(day.getSelectedItem()=="Thursday"){
                   table.setValueAt("8.30 1m", 0, 0);
                table.setValueAt("Engineering Math",0, 1);
                table.setValueAt("Ab1-302", 0, 2);
                table.setValueAt("MAAM",0,3); 
                
               table.setValueAt("2.30 pm", 1, 0);
                 table.setValueAt("Digital Electronics lab", 1, 1);
                 table.setValueAt("Ab3-106", 1, 2);
                 table.setValueAt("MD",1,3);     
   }
               
   }
    
       if(Section.getSelectedItem()=="Pc-C"){
          if(day.getSelectedItem()=="Satureday"){
           table.setValueAt("You have no class",0,1);    
        }
         if(day.getSelectedItem()=="Sunday"){
            table.setValueAt("8.30 am",0, 0);
                table.setValueAt("Bangladesh studies", 0, 1);
                table.setValueAt("Ab3", 0, 2);
                table.setValueAt("KRI",0,3);       
                 table.setValueAt("10.00 am",1, 0);
                table.setValueAt("Digital Electronics", 1, 1);
                table.setValueAt("Ab1-602", 1, 2);
                table.setValueAt("MD",1,3);         
            
   }
          if(day.getSelectedItem()=="Monday"){
            table.setValueAt("11.30 am", 0, 0);
                table.setValueAt("Oop",0, 1);
                table.setValueAt("Ab1-304", 0, 2);
                table.setValueAt("ZH",0,3);
                
                 table.setValueAt("4.00 pm", 1, 0);
                table.setValueAt("Engineering Math",1, 1);
                table.setValueAt("Ab1-302", 1, 2);
                table.setValueAt("MAAM",1,3); 
                
          }
           if(day.getSelectedItem()=="Tuesday"){
            table.setValueAt("01.00 pm", 0, 0);
                table.setValueAt("Bangladesh studys", 0, 1);
                table.setValueAt("Ab3-212", 0, 2);
                table.setValueAt("KRI",0,3);  
                
                 table.setValueAt("2.30 pm", 1, 0);
                 table.setValueAt("Digital Electronics", 1, 1);
                 table.setValueAt("Ab3-214", 1, 2);
                 table.setValueAt("MD",1,3);     
   }
            if(day.getSelectedItem()=="Wednesday"){
            table.setValueAt("8.30 am", 0, 0);
                table.setValueAt("Oop java lab", 0, 1);
                table.setValueAt("Ab1-704", 0, 2);
                table.setValueAt("TK",0,3);      
           
   }
             if(day.getSelectedItem()=="Thursday"){
                   table.setValueAt("8.30 1m", 0, 0);
                table.setValueAt("Engineering Math",0, 1);
                table.setValueAt("Ab1-302", 0, 2);
                table.setValueAt("MAAM",0,3); 
                
               table.setValueAt("2.30 pm", 1, 0);
                 table.setValueAt("Digital Electronics lab", 1, 1);
                 table.setValueAt("Ab3-106", 1, 2);
                 table.setValueAt("MD",1,3);     
   }
               
   }
       if(Section.getSelectedItem()=="Pc-E"){
          if(day.getSelectedItem()=="Satureday"){
           table.setValueAt("You have no class",0,1);    
        }
         if(day.getSelectedItem()=="Sunday"){
            table.setValueAt("8.30 am",0, 0);
                table.setValueAt("Bangladesh studies", 0, 1);
                table.setValueAt("Ab3", 0, 2);
                table.setValueAt("KRI",0,3);       
                 table.setValueAt("10.00 am",1, 0);
                table.setValueAt("Digital Electronics", 1, 1);
                table.setValueAt("Ab1-602", 1, 2);
                table.setValueAt("MD",1,3);         
            
   }
          if(day.getSelectedItem()=="Monday"){
            table.setValueAt("11.30 am", 0, 0);
                table.setValueAt("Oop",0, 1);
                table.setValueAt("Ab1-304", 0, 2);
                table.setValueAt("ZH",0,3);
                
                 table.setValueAt("4.00 pm", 1, 0);
                table.setValueAt("Engineering Math",1, 1);
                table.setValueAt("Ab1-302", 1, 2);
                table.setValueAt("MAAM",1,3); 
                
          }
           if(day.getSelectedItem()=="Tuesday"){
            table.setValueAt("01.00 pm", 0, 0);
                table.setValueAt("Bangladesh studys", 0, 1);
                table.setValueAt("Ab3-212", 0, 2);
                table.setValueAt("KRI",0,3);  
                
                 table.setValueAt("2.30 pm", 1, 0);
                 table.setValueAt("Digital Electronics", 1, 1);
                 table.setValueAt("Ab3-214", 1, 2);
                 table.setValueAt("MD",1,3);     
   }
            if(day.getSelectedItem()=="Wednesday"){
            table.setValueAt("8.30 am", 0, 0);
                table.setValueAt("Oop java lab", 0, 1);
                table.setValueAt("Ab1-704", 0, 2);
                table.setValueAt("TK",0,3);      
           
   }
             if(day.getSelectedItem()=="Thursday"){
                   table.setValueAt("8.30 1m", 0, 0);
                table.setValueAt("Engineering Math",0, 1);
                table.setValueAt("Ab1-302", 0, 2);
                table.setValueAt("MAAM",0,3); 
                
               table.setValueAt("2.30 pm", 1, 0);
                 table.setValueAt("Digital Electronics lab", 1, 1);
                 table.setValueAt("Ab3-106", 1, 2);
                 table.setValueAt("MD",1,3);     
   }
               
   }
       
    }//GEN-LAST:event_showActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Ruting ob=new Ruting();
        ob.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(Ruting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ruting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ruting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ruting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ruting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Section;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox day;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton show;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

   
    }

