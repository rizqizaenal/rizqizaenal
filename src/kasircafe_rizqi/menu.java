/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasircafe_rizqi;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.ImageIcon;
/**
 *
 * @author RplScada2018
 */
public class menu extends javax.swing.JFrame {
    Connection con;
DefaultTableModel tm;
private void connect(){
        con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/kasir_cafe","root","");
        } catch(Exception e) {
            System.out.print("ERROR KONEKSI KE DATABASE:\n" + e);
        }
}
private void refreshTable(){
    tm = new DefaultTableModel(
    null,
    new Object[] {"MENU ID", "NAMA", "HARGA", "FOTO"}
    );
menu.setModel(tm);
tm.getDataVector().removeAllElements();

try {
    PreparedStatement s = con.prepareStatement("SELECT * FROM tbl_menu");
    ResultSet r = s.executeQuery();
    while(r.next()) {
        Object[] data = {
            r.getString(1),
            r.getString(2),
            r.getString(3),
            r.getString(4)
                
        };
        tm.addRow(data);
    }
} catch(Exception e) {
    System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
}

}
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        connect();
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        menuid = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        foto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("FROM MANAGE MENU");

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        cari.setText("CARI");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        jLabel2.setText("MENU ID");

        jLabel3.setText("NAMA");

        jLabel4.setText("HARGA");

        jLabel5.setText("FOTO");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        menuid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuidActionPerformed(evt);
            }
        });

        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });

        foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoActionPerformed(evt);
            }
        });

        jButton2.setText("Search Foto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        tambah.setText("TAMBAH");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        ubah.setText("UBAH");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menu);

        jButton1.setText("EXIT");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(478, 478, 478))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cari)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(ubah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hapus)
                                .addGap(43, 43, 43)
                                .addComponent(jButton1)
                                .addGap(67, 67, 67))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuid, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tambah)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hapus)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(menuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ubah)
                                    .addComponent(tambah))
                                .addGap(23, 23, 23))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        tm = new DefaultTableModel(null,
    new Object[] {"ID MENU","NAMA MENU","HARGA","FOTO" });
    menu.setModel(tm);
    tm.getDataVector().removeAllElements();
    try{
        PreparedStatement s = con.prepareStatement("SELECT *from tbl_menu where id_menu LIKE '%"+ 
                search.getText().toString() +"%' or nama_menu LIKE '%" + search.getText().toString() +"%'");
        ResultSet r = s.executeQuery();
        while(r.next()){
        Object[] data ={
        r.getString(1),
        r.getString(2),
        r.getString(3),
        r.getString(4)
        };
        tm.addRow(data);
    }
    } catch(Exception e) {
    System.out.print("EROR KUERI KE DATABASE:\n" + e + "\n\n");
    }
    }//GEN-LAST:event_cariActionPerformed
    
    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void menuidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuidActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fotoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser("");
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        foto.setText(filename);
        Image getAbsolutePath=null;
        ImageIcon icon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jLabel6.getWidth(),
                jLabel6.getHeight(), Image.SCALE_SMOOTH));
        jLabel6.setIcon(icon);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // hapus
        int ok = JOptionPane.showConfirmDialog(null,"Anda Yakin Ingin Menghapus Data Ini"+menuid.getText()+"'","Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (ok==0);
                try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM tbl_menu WHERE id_menu=?");
            ps.setString(1, menuid.getText());
            ps.executeUpdate();
            
            refreshTable();
            menuid.setText("");
            nama.setText("");
            harga.setText("");
            foto.setText("");
        } catch(Exception e) {
            System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
                }
    }//GEN-LAST:event_hapusActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // tambah
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO tbl_menu VALUES (?,?,?,?)");
            ps.setString(1, menuid.getText());
            ps.setString(2, nama.getText());
            ps.setString(3, harga.getText());
            ps.setString(4, foto.getText());
            ps.executeUpdate();
            
            refreshTable();
            menuid.setText("");
            nama.setText("");
            harga.setText("");
            foto.setText("");
        } catch(Exception e) {
         System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // ubah
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE tbl_menu SET nama_menu=?,harga=?,foto=? WHERE id_menu=?");
            ps.setString(1, nama.getText());
            ps.setString(2, harga.getText());
            ps.setString(3, foto.getText());
            ps.setString(4, menuid.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"data telah di update");
            refreshTable();
            menuid.setText("");
            nama.setText("");
            harga.setText("");
            foto.setText("");
        } catch(Exception e) {
        System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        int i = menu.getSelectedRow();
    if (i == -1){
        //tidak ada baris terseleksi
        return;
    }
    
    String menid = (String)tm.getValueAt(i, 0);
    menuid.setText(menid);
    
    String nam = (String)tm.getValueAt(i, 1);
    nama.setText(nam);
    
    String harg = (String)tm.getValueAt(i, 2);
    harga.setText(harg);
    
    String fot = (String)tm.getValueAt(i, 3);
    foto.setText(fot);
   
    }//GEN-LAST:event_menuMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        manager menag=new manager();
        menag.show();
        this.dispose();
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JTextField foto;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menu;
    private javax.swing.JTextField menuid;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField search;
    private javax.swing.JButton tambah;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
