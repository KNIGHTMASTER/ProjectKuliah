/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJInternalFrame.java
 *
 * Created on Apr 22, 2011, 8:39:42 AM
 */

package com.zisal.sipegadaian.Editing;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JTable;
import com.zisal.sipegadaian.sipegadaian.koneksi;
/**
 *
 * @author zisal
 */
public class EditBarang extends javax.swing.JInternalFrame {
public koneksi conn=new koneksi();
public Dimension ukuran_layar;
Connection koneksi=null;
ResultSet rs=null;
Statement st=null;
public JTable tabel=null;
    /** Creates new form NewJInternalFrame */
    public EditBarang() {
        initComponents();
        tampilBarang(getDataBarang());
    }
String id,nama,tgl_masuk,tgl_keluar,hrg_msk,hrg_keluar,jumlah,perpanjang;
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDbarang = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttgl_msk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttgl_keluar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txthrg_msk = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txthargakeluar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtjumlah = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbperpanjang = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        btcari = new javax.swing.JButton();
        BTUPDATE = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        btcekID = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 800, 160));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel2.setForeground(new java.awt.Color(235, 235, 247));
        jLabel2.setText("IDBARANG      :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 120, 20));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel3.setForeground(new java.awt.Color(235, 235, 247));
        jLabel3.setText("NAMA BARANG :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 20));

        txtIDbarang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDbarangFocusLost(evt);
            }
        });
        getContentPane().add(txtIDbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 100, -1));

        txtnama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnamaFocusLost(evt);
            }
        });
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 100, -1));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel4.setForeground(new java.awt.Color(235, 235, 247));
        jLabel4.setText("TANGGAL MASUK  :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 20));

        txttgl_msk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttgl_mskFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttgl_mskFocusLost(evt);
            }
        });
        getContentPane().add(txttgl_msk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 100, -1));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel5.setForeground(new java.awt.Color(235, 235, 247));
        jLabel5.setText("TANGGAL KELUAR :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, 20));

        txttgl_keluar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttgl_keluarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttgl_keluarFocusLost(evt);
            }
        });
        getContentPane().add(txttgl_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 100, -1));

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel6.setForeground(new java.awt.Color(235, 235, 247));
        jLabel6.setText("HARGA MASUK :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 120, 20));

        txthrg_msk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txthrg_mskFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txthrg_mskFocusLost(evt);
            }
        });
        getContentPane().add(txthrg_msk, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 100, -1));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel7.setForeground(new java.awt.Color(235, 235, 247));
        jLabel7.setText("HARGA KELUAR :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 130, 20));

        txthargakeluar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txthargakeluarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txthargakeluarFocusLost(evt);
            }
        });
        getContentPane().add(txthargakeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 100, -1));

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel8.setForeground(new java.awt.Color(235, 235, 247));
        jLabel8.setText("JUMLAH :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 70, 20));

        txtjumlah.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtjumlahFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlahFocusLost(evt);
            }
        });
        getContentPane().add(txtjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 100, -1));

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel9.setForeground(new java.awt.Color(235, 235, 247));
        jLabel9.setText("PERPANJANG :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 110, 20));

        cmbperpanjang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1000", "1500", "2000", "2500", "3000", "3500", "4000", "4500", "5000" }));
        getContentPane().add(cmbperpanjang, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 100, -1));

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabel10.setForeground(new java.awt.Color(242, 226, 226));
        jLabel10.setText("Cari Barang Berdasarkan Nama :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 240, -1));

        btcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/SEARCH.PNG"))); // NOI18N
        btcari.setText("CARI");
        btcari.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcariActionPerformed(evt);
            }
        });
        getContentPane().add(btcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 70, 20));

        BTUPDATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bModify.png"))); // NOI18N
        BTUPDATE.setText("UPDATE");
        BTUPDATE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTUPDATE.setEnabled(false);
        BTUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTUPDATEActionPerformed(evt);
            }
        });
        getContentPane().add(BTUPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 100, 20));

        btdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/CANCEL.PNG"))); // NOI18N
        btdelete.setText("DELETE");
        btdelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 100, 20));

        btcekID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/ok.png"))); // NOI18N
        btcekID.setText("CEK ID");
        btcekID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcekIDActionPerformed(evt);
            }
        });
        getContentPane().add(btcekID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 100, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/ubarang.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public int len(String field){
    int len=field.length();
    return len;
}
    private void txtIDbarangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDbarangFocusLost
        // TODO add your handling code here:
        if(len(txtIDbarang.getText())<5 || len(txtIDbarang.getText())>5){
            JOptionPane.showMessageDialog(null, "id kurang lengkap", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txtIDbarang.setText("00000");
            txtIDbarang.requestFocus();
        } else{

        }
}//GEN-LAST:event_txtIDbarangFocusLost

    private void txtnamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnamaFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_txtnamaFocusLost

    private void txttgl_mskFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttgl_mskFocusGained
        // TODO add your handling code here:
        if(len(txtnama.getText())==0){
            JOptionPane.showMessageDialog(null, "nama barang harus diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txtnama.setText("satu");
            txtnama.requestFocus();
        }
}//GEN-LAST:event_txttgl_mskFocusGained

    private void txttgl_mskFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttgl_mskFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_txttgl_mskFocusLost

    private void txttgl_keluarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttgl_keluarFocusGained
        // TODO add your handling code here:
        if(len(txttgl_msk.getText())==0){
            JOptionPane.showMessageDialog(null, "tanggal masuk barang diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txttgl_msk.setText("1999-01-01");
            txttgl_msk.requestFocus();
        }
}//GEN-LAST:event_txttgl_keluarFocusGained

    private void txttgl_keluarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttgl_keluarFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_txttgl_keluarFocusLost

    private void txthrg_mskFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthrg_mskFocusGained
        // TODO add your handling code here:
        if(len(txttgl_keluar.getText())==0){
            JOptionPane.showMessageDialog(null, "tanggal keluar barang harus diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txttgl_keluar.setText("1999-01-01");
            txttgl_keluar.requestFocus();
        }
}//GEN-LAST:event_txthrg_mskFocusGained

    private void txthrg_mskFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthrg_mskFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_txthrg_mskFocusLost

    private void txthargakeluarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthargakeluarFocusGained
        // TODO add your handling code here:
        if(len(txthrg_msk.getText())==0){
            JOptionPane.showMessageDialog(null, "harga masuk barang harus diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txthrg_msk.setText("1000");
            txthrg_msk.requestFocus();
        }
}//GEN-LAST:event_txthargakeluarFocusGained

    private void txthargakeluarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthargakeluarFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_txthargakeluarFocusLost

    private void txtjumlahFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlahFocusGained
        // TODO add your handling code here:
        if(len(txthargakeluar.getText())==0){
            JOptionPane.showMessageDialog(null, "harga keluar barang harus diisi", "WARNING",JOptionPane.INFORMATION_MESSAGE);
            txthargakeluar.setText("1000");
            txthargakeluar.requestFocus();
        }
}//GEN-LAST:event_txtjumlahFocusGained

    private void txtjumlahFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlahFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_txtjumlahFocusLost

public String getID(){
id=txtIDbarang.getText();
return id;

}
public String getNama(){
    nama=txtnama.getText();
    return nama;
}

public String gettgl_msuk(){
tgl_masuk=txttgl_msk.getText();
return tgl_masuk;
}

public String gettgl_keluar(){
tgl_keluar=txttgl_keluar.getText();
return tgl_keluar;
}

public String getHrg_msk(){
hrg_msk=txthrg_msk.getText();
return  hrg_msk;
}

public String getHrg_klr(){
hrg_keluar=txthargakeluar.getText();
return hrg_keluar;
}
public String getJumlah(){
jumlah=txtjumlah.getText();
return jumlah;
}
public String getPerpanjang(){
perpanjang=(String) cmbperpanjang.getSelectedItem();
return perpanjang;
}
public String getIDtbl,getNamatbl,getTgl_Msktbl,getTgl_Klrtbl,getHrg_Msktbl,getHrg_Klrtbl,getJumlahtbl,getPerptbl;

private Object[][] getDataBarang(){
    Object[][] data=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        koneksi=DriverManager.getConnection("jdbc:mysql://localhost/pegadaian?;","root","");
        st= (Statement) koneksi.createStatement();
        String query="SELECT * FROM barang;";
        rs=st.executeQuery(query);
        rs.last();
        int baris=rs.getRow();
        rs.beforeFirst();
        data=new Object[baris][8];
        int no=-1;
        while(rs.next()){
            no+=1;
            data[no][0]=rs.getString("idbarang");
            getIDtbl=data[no][0].toString();
            data[no][1]=rs.getString("nama");
            getNamatbl=data[no][1].toString();
            data[no][2]=rs.getString("tgl_masuk");
            getTgl_Msktbl=data[no][2].toString();
            data[no][3]=rs.getString("tgl_keluar");
            getTgl_Klrtbl=data[no][3].toString();
            data[no][4]=rs.getString("harga_masuk");
            getHrg_Msktbl=data[no][4].toString();
            data[no][5]=rs.getString("harga_keluar");
            getHrg_Klrtbl=data[no][5].toString();
            data[no][6]=rs.getString("jumlah");
            getJumlahtbl=data[no][6].toString();
            data[no][7]=rs.getString("perpanjang_per_bln");
            getPerptbl=data[no][7].toString();
        }
        st.close();        
    }
    catch(Exception e){

    }
    return data;
}
    public void tampilBarang(Object [][] data){
        String [] nama_kol={"idbarang","nama","tgl_masuk","tgl_keluar","harga_masuk","harga_keluar","jumlah","perpanjanga"};
        tabel=new JTable(data,nama_kol);
        jScrollPane1.setViewportView(tabel);
    }

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        /*ukuran_layar=Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((ukuran_layar.width / 2) - (getSize().width / 2), (ukuran_layar.height / 2) - (getSize().height / 2));*/
    }//GEN-LAST:event_formInternalFrameActivated

    private void BTUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTUPDATEActionPerformed
        // TODO add your handling code here:
    try{
        conn.konek();
        PreparedStatement ps=null;
        String query="update barang set nama=?, tgl_masuk=?, tgl_keluar=?, harga_masuk=?, 0harga_keluar=?, jumlah=?, perpanjang_per_bln=? where idbarang=?";
        ps=koneksi.prepareStatement(query);
        ps.setString(1, txtnama.getText());
        ps.setString(2, txttgl_msk.getText());
        ps.setString(3, txttgl_keluar.getText());
        ps.setString(4, txthrg_msk.getText());
        ps.setString(5, txthargakeluar.getText());
        ps.setString(6, txtjumlah.getText());
        ps.setString(7, cmbperpanjang.getSelectedItem().toString());
        ps.setString(8, txtIDbarang.getText());
        
        int ok=ps.executeUpdate();
        if(ok>0){
            JOptionPane.showMessageDialog(this, "Edit data barang sukses","Informasi",JOptionPane.INFORMATION_MESSAGE);
            tampilBarang(getDataBarang());
        }
        else{
            JOptionPane.showMessageDialog(this, "Edit data barang gagal","Informasi",JOptionPane.INFORMATION_MESSAGE);
            tampilBarang(getDataBarang());
        }
        ps.close();
        isClear();
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Editing data gagal karena "+e);
    }
    }//GEN-LAST:event_BTUPDATEActionPerformed
public void isClear(){
        txtIDbarang.setText("");
        txthargakeluar.setText("");
        txthrg_msk.setText("");
        txtjumlah.setText("");
        txtnama.setText("");
        txttgl_keluar.setText("");
        txttgl_msk.setText("");
}
private void getFromDatabase(){
        txtIDbarang.setText(getIDtbl);
        txthargakeluar.setText(getHrg_Klrtbl);
        txthrg_msk.setText(getHrg_Msktbl);
        txtjumlah.setText(getJumlahtbl);
        txtnama.setText(getNamatbl);
        txttgl_keluar.setText(getTgl_Klrtbl);
        txttgl_msk.setText(getTgl_Msktbl);
}private Object[][] getDataCari(){
    Object[][] data=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        koneksi=DriverManager.getConnection("jdbc:mysql://localhost/pegadaian?;","root","");
        st= (Statement) koneksi.createStatement();
        String query="SELECT * FROM barang WHERE nama LIKE ('%"+txtcari.getText()+"%');";
        rs=st.executeQuery(query);        
        rs.last();
        int baris=rs.getRow();
        rs.beforeFirst();
        data=new Object[baris][8];
        int no=-1;
        while(rs.next()){
            no+=1;
            data[no][0]=rs.getString("idbarang");            
            data[no][1]=rs.getString("nama");            
            data[no][2]=rs.getString("tgl_masuk");            
            data[no][3]=rs.getString("tgl_keluar");           
            data[no][4]=rs.getString("harga_masuk");            
            data[no][5]=rs.getString("harga_keluar");            
            data[no][6]=rs.getString("jumlah");            
            data[no][7]=rs.getString("perpanjang_per_bln");            
        }
        st.close();       
    }
    catch(Exception e){

    }
    return data;
}
    private void btcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcariActionPerformed
        // TODO add your handling code here:
tampilBarang(getDataCari());
txtcari.requestFocus();
    }//GEN-LAST:event_btcariActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        // TODO add your handling code here:
        int konfirmasi=JOptionPane.showConfirmDialog(rootPane, "apakah anda yakin ingin menghapus ? ", "haspus",JOptionPane.YES_NO_CANCEL_OPTION);
        if(konfirmasi==JOptionPane.YES_OPTION){
            String idbarang=tabel.getValueAt(tabel.getSelectedRow(),0).toString();
            try{
                conn.konek();
                PreparedStatement ps=null;
                String query="DELETE FROM barang WHERE idbarang=?";
                ps=koneksi.prepareStatement(query);
                ps.setString(1, idbarang);
                int ok=ps.executeUpdate();
                if(ok==1)
                    JOptionPane.showMessageDialog(this,"DELETE berhasil","DELETE",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"DELETE GAGAL","DELETE",JOptionPane.INFORMATION_MESSAGE);
                ps.close();
                tampilBarang(getDataBarang());
            } catch(SQLException e){
                System.out.println("HAPUS data GAGAL karena"+e.toString());
            }
        } else{
            System.out.print("penghapusan digagalkan");
        }
}//GEN-LAST:event_btdeleteActionPerformed

    private void btcekIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcekIDActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
//            JOptionPane.showMessageDialog(null, "DRIVER OK","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
            koneksi=DriverManager.getConnection("jdbc:mysql://localhost/pegadaian?;","root","");
//            JOptionPane.showMessageDialog(null, "KONEKSI OK","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
            st=(Statement) koneksi.createStatement();
//            JOptionPane.showMessageDialog(null, "CREATE STATEMENT OK","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
            rs=st.executeQuery("SELECT * FROM barang WHERE idbarang='"+txtIDbarang.getText()+"';");
            //+ "WHERE idbarang='"+txtIDbarang.getText()+"'"
//            JOptionPane.showMessageDialog(null, "SELECT Barang OK","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "ID Barang : Benar","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
                BTUPDATE.setEnabled(true);
                txtnama.setText(rs.getString("nama"));
                txttgl_msk.setText(rs.getString("tgl_masuk"));
                txttgl_keluar.setText(rs.getString("tgl_keluar"));
                txthrg_msk.setText(rs.getString("harga_masuk"));
                txthargakeluar.setText(rs.getString("harga_keluar"));
                txtjumlah.setText(rs.getString("jumlah"));
            }
            else{
                JOptionPane.showMessageDialog(null, "ID Barang : Salah","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
                BTUPDATE.setEnabled(false);
                isClear();
                txtIDbarang.requestFocus();
            }
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_btcekIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTUPDATE;
    private javax.swing.JButton btcari;
    private javax.swing.JButton btcekID;
    private javax.swing.JButton btdelete;
    private javax.swing.JComboBox cmbperpanjang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIDbarang;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txthargakeluar;
    private javax.swing.JTextField txthrg_msk;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttgl_keluar;
    private javax.swing.JTextField txttgl_msk;
    // End of variables declaration//GEN-END:variables

}
