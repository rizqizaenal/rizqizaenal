/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasircafe_rizqi;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RplScada2018
 */
public class pembayaran extends javax.swing.JFrame {
Connection con;
DefaultTableModel tm;
    /**
     * Creates new form payment
     */
    public pembayaran() {
        initComponents();
        connect();
        cbid();
        cbidpeg();
        id_otomatis();
        id_master.setEnabled(false);
    }
private void connect(){
        con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir_cafe","root","");
        } catch(Exception e) {
            System.out.print("ERROR KONEKSI KE DATABASE:\n" + e);
        }
}

private void id_otomatis(){
    try {
        Connection c = con;
        Statement s = c.createStatement();
        String sql ="SELECT * FROM tbl_masterpesan ORDER BY id_master DESC";
        ResultSet r = s.executeQuery(sql);
        if (r.next()) {
            String No = r.getString("id_master");
            String otomatis ="" +(Integer.parseInt(No)+1);
            id_master.setText(otomatis);
        }else {
            id_master.setText("1");
        }
        r.close();
        s.close();
    }catch (Exception e) {
        System.out.print("autonumber error");
    }
}

private void cbid(){
            
        try{
            PreparedStatement s = con.prepareStatement("SELECT * FROM tbl_detailpesan where status='Belum Lunas'");
            ResultSet r = s.executeQuery();
            while(r.next()) {
                order_id.addItem(r.getString("id_detail"));
            }
        } catch(Exception e) {
            System.out.print("ERROR KONEKSI KE DATABASE:\n" + e);
            }
        }

private void cbidpeg(){
    
    try {
        PreparedStatement s = con.prepareStatement("SELECT * FROM tbl_pegawai");
            ResultSet r = s.executeQuery();
            while(r.next()) {
                id_pegawai.addItem(r.getString("id_pegawai"));
            }
        } catch(Exception e) {
            System.out.print("ERROR KONEKSI KE DATABASE:\n" + e); 
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

        id_master = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        order_id = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        pembayaran = new javax.swing.JTable();
        idpeg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        byr = new javax.swing.JTextField();
        back = new javax.swing.JTextField();
        id_pegawai = new javax.swing.JComboBox<>();
        tgl_byr = new com.toedter.calendar.JDateChooser();
        tambah = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel3.setText("ID MASTER");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("FORM PEMBAYARAN");

        jLabel2.setText("ID DETAIL");

        order_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_idMouseClicked(evt);
            }
        });
        order_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_idActionPerformed(evt);
            }
        });

        pembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Menu", "QTY", "Total"
            }
        ));
        pembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pembayaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pembayaran);
        if (pembayaran.getColumnModel().getColumnCount() > 0) {
            pembayaran.getColumnModel().getColumn(2).setResizable(false);
        }

        idpeg.setText("ID PEGAWAI");

        jLabel5.setText("TANGGAL BAYAR");

        jLabel6.setText("BAYAR");

        jLabel7.setText("KEMBALI");

        byr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byrActionPerformed(evt);
            }
        });
        byr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                byrKeyReleased(evt);
            }
        });

        back.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                backKeyReleased(evt);
            }
        });

        tambah.setText("TAMBAH");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel4.setText("Total");

        jButton1.setText("ADD");
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
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idpeg)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(byr)
                                    .addComponent(back)
                                    .addComponent(id_pegawai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tgl_byr, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tambah)
                                .addGap(82, 82, 82)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exit)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(order_id, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(order_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idpeg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tgl_byr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(byr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(exit))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void order_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_idActionPerformed

    private void pembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pembayaranMouseClicked

    }//GEN-LAST:event_pembayaranMouseClicked

    private void order_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_idMouseClicked
        tm = new DefaultTableModel(
    null,
    new Object[] {"NAMA MENU", "QTY", "TOTAL"}
    );
pembayaran.setModel(tm);
tm.getDataVector().removeAllElements();

try {
    PreparedStatement s = con.prepareStatement("SELECT tbl_menu.nama_menu, tbl_detailpesan.qty, tbl_detailpesan.total FROM tbl_menu, tbl_detailpesan where tbl_menu.id_menu=tbl_detailpesan. id_menu AND id_detail LIKE '%"+ order_id.getSelectedItem().toString() +"%'");
 ResultSet r = s.executeQuery();
    while(r.next()) {
        Object[] data = {
            r.getString(1),
            r.getString(2),
            r.getString(3)
             
        };
        tm.addRow(data);
        jLabel4.setText(String.valueOf(r.getString(3)));
    }
       } catch(Exception e) {
        System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
    }//GEN-LAST:event_order_idMouseClicked
}
    
    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        String Tampilan="yyyy-MM-dd";
        SimpleDateFormat fm=new SimpleDateFormat (Tampilan);
        String tgl=String.valueOf(fm.format(tgl_byr.getDate()));
        try{
            Connection c = con;
            int baris = pembayaran.getRowCount();
            for (int a = 0; a < baris; a++) {
                id_otomatis();
            PreparedStatement ps = con.prepareStatement("INSERT INTO tbl_masterpesan VALUES (?,?,?,?)");
            ps.setString(1, id_master.getText());
            ps.setString(2, order_id.getSelectedItem().toString());
            ps.setString(3, id_pegawai.getSelectedItem().toString());
            ps.setString(4, tgl);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"data telah disimpan");
            } 
        } catch(Exception e) {
            System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
    }//GEN-LAST:event_tambahActionPerformed
    }
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        kasir ksr=new kasir();
        ksr.show();
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void backKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backKeyReleased
        
    }//GEN-LAST:event_backKeyReleased

    private void byrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_byrKeyReleased
        int kembali,bayar,total;
        total=Integer.parseInt(jLabel4.getText());
        bayar=Integer.parseInt(byr.getText());
        
        kembali=bayar-total;
        back.setText(String.valueOf(kembali));
    }//GEN-LAST:event_byrKeyReleased

    private void byrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_byrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) pembayaran.getModel();
        try {
            PreparedStatement s = con.prepareStatement("SELECT nama_menu, qty, total FROM tbl_menu,tbl_detailpesan where tbl_menu.id_menu=tbl_detailpesan.id_menu and id_detail LIKE'%"+ order_id.getSelectedItem().toString() +"%' and tbl_detailpesan.status='Belum Lunas'");
            ResultSet r = s.executeQuery();
            while(r.next()){
                Object[] data ={
                    r.getString(1),
                    r.getString(2),
                    r.getString(3)
                };
                model.addRow(data);
                int jumlah = model.getRowCount();
                int sum=0;
                for (int i = 0; i < jumlah; i++) {
                int total = Integer.valueOf(model.getValueAt(i, 2).toString());
                sum += total;
                }
                jLabel4.setText(String.valueOf(sum));
            }
        }catch(Exception e) {
            System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
        }
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
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembayaran().setVisible(true);
}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField back;
    private javax.swing.JTextField byr;
    private javax.swing.JButton exit;
    private javax.swing.JTextField id_master;
    private javax.swing.JComboBox<String> id_pegawai;
    private javax.swing.JLabel idpeg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> order_id;
    private javax.swing.JTable pembayaran;
    private javax.swing.JButton tambah;
    private com.toedter.calendar.JDateChooser tgl_byr;
    // End of variables declaration//GEN-END:variables

    

   
}
