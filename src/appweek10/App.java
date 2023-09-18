/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appweek10;

/**
 *
 * @author ASUS
 */
public class App extends javax.swing.JFrame {

    String angka;
    double hasil, angka1, angka2; 
    int hasilBulat, operasi;

    public App() {
        initComponents();
        angka="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextPane();
        persen = new javax.swing.JButton();
        seperX = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        clearEntry = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        plusminus = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        backSp = new javax.swing.JButton();
        per = new javax.swing.JButton();
        kuadrat = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        akar = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        samaDengan = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        koma = new javax.swing.JButton();
        nol = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jScrollPane1.setViewportView(display);

        persen.setBackground(new java.awt.Color(102, 153, 255));
        persen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        persen.setText("%");
        persen.setMaximumSize(new java.awt.Dimension(100, 100));
        persen.setPreferredSize(new java.awt.Dimension(70, 50));
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });

        seperX.setBackground(new java.awt.Color(102, 153, 255));
        seperX.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        seperX.setText("1/x");
        seperX.setMaximumSize(new java.awt.Dimension(100, 100));
        seperX.setPreferredSize(new java.awt.Dimension(70, 50));
        seperX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seperXActionPerformed(evt);
            }
        });

        tujuh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tujuh.setText("7");
        tujuh.setMaximumSize(new java.awt.Dimension(100, 100));
        tujuh.setPreferredSize(new java.awt.Dimension(70, 50));
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });

        empat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        empat.setText("4");
        empat.setMaximumSize(new java.awt.Dimension(100, 100));
        empat.setPreferredSize(new java.awt.Dimension(70, 50));
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });

        clearEntry.setBackground(new java.awt.Color(255, 102, 0));
        clearEntry.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clearEntry.setText("CE");
        clearEntry.setMaximumSize(new java.awt.Dimension(100, 100));
        clearEntry.setPreferredSize(new java.awt.Dimension(70, 50));
        clearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEntryActionPerformed(evt);
            }
        });

        satu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        satu.setText("1");
        satu.setMaximumSize(new java.awt.Dimension(100, 100));
        satu.setPreferredSize(new java.awt.Dimension(70, 50));
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });

        plusminus.setBackground(new java.awt.Color(102, 153, 255));
        plusminus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        plusminus.setText("+/-");
        plusminus.setMaximumSize(new java.awt.Dimension(100, 100));
        plusminus.setPreferredSize(new java.awt.Dimension(70, 50));
        plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminusActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 102, 0));
        clear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clear.setText("C");
        clear.setMaximumSize(new java.awt.Dimension(100, 100));
        clear.setPreferredSize(new java.awt.Dimension(70, 50));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        backSp.setBackground(new java.awt.Color(153, 153, 153));
        backSp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backSp.setText("<x");
        backSp.setMaximumSize(new java.awt.Dimension(100, 100));
        backSp.setPreferredSize(new java.awt.Dimension(70, 50));
        backSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSpActionPerformed(evt);
            }
        });

        per.setBackground(new java.awt.Color(153, 153, 153));
        per.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        per.setText("/");
        per.setMaximumSize(new java.awt.Dimension(100, 100));
        per.setPreferredSize(new java.awt.Dimension(70, 50));
        per.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perActionPerformed(evt);
            }
        });

        kuadrat.setBackground(new java.awt.Color(102, 153, 255));
        kuadrat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kuadrat.setText("x^2");
        kuadrat.setMaximumSize(new java.awt.Dimension(100, 100));
        kuadrat.setPreferredSize(new java.awt.Dimension(70, 50));
        kuadrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuadratActionPerformed(evt);
            }
        });

        delapan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delapan.setText("8");
        delapan.setMaximumSize(new java.awt.Dimension(100, 100));
        delapan.setPreferredSize(new java.awt.Dimension(70, 50));
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });

        lima.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lima.setText("5");
        lima.setMaximumSize(new java.awt.Dimension(100, 100));
        lima.setPreferredSize(new java.awt.Dimension(70, 50));
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });

        akar.setBackground(new java.awt.Color(102, 153, 255));
        akar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        akar.setText("sqrt");
        akar.setMaximumSize(new java.awt.Dimension(100, 100));
        akar.setPreferredSize(new java.awt.Dimension(70, 50));
        akar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akarActionPerformed(evt);
            }
        });

        kali.setBackground(new java.awt.Color(153, 153, 153));
        kali.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kali.setText("X");
        kali.setMaximumSize(new java.awt.Dimension(100, 100));
        kali.setPreferredSize(new java.awt.Dimension(70, 50));
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        kurang.setBackground(new java.awt.Color(153, 153, 153));
        kurang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kurang.setText("-");
        kurang.setMaximumSize(new java.awt.Dimension(100, 100));
        kurang.setPreferredSize(new java.awt.Dimension(70, 50));
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        tambah.setBackground(new java.awt.Color(153, 153, 153));
        tambah.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tambah.setText("+");
        tambah.setMaximumSize(new java.awt.Dimension(100, 100));
        tambah.setPreferredSize(new java.awt.Dimension(70, 50));
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        samaDengan.setBackground(new java.awt.Color(102, 153, 255));
        samaDengan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        samaDengan.setText("=");
        samaDengan.setMaximumSize(new java.awt.Dimension(100, 100));
        samaDengan.setPreferredSize(new java.awt.Dimension(70, 50));
        samaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samaDenganActionPerformed(evt);
            }
        });

        dua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dua.setText("2");
        dua.setMaximumSize(new java.awt.Dimension(100, 100));
        dua.setPreferredSize(new java.awt.Dimension(70, 50));
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });

        koma.setBackground(new java.awt.Color(153, 153, 153));
        koma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        koma.setText(".");
        koma.setMaximumSize(new java.awt.Dimension(100, 100));
        koma.setPreferredSize(new java.awt.Dimension(70, 50));
        koma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komaActionPerformed(evt);
            }
        });

        nol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nol.setText("0");
        nol.setMaximumSize(new java.awt.Dimension(100, 100));
        nol.setPreferredSize(new java.awt.Dimension(70, 50));
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });

        sembilan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sembilan.setText("9");
        sembilan.setMaximumSize(new java.awt.Dimension(100, 100));
        sembilan.setPreferredSize(new java.awt.Dimension(70, 50));
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });

        enam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enam.setText("6");
        enam.setMaximumSize(new java.awt.Dimension(100, 100));
        enam.setPreferredSize(new java.awt.Dimension(70, 50));
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });

        tiga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tiga.setText("3");
        tiga.setMaximumSize(new java.awt.Dimension(100, 100));
        tiga.setPreferredSize(new java.awt.Dimension(70, 50));
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });

        jLabel1.setText("Kalkulator_11S21034");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(persen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tujuh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(satu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seperX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plusminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kuadrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delapan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(akar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sembilan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(koma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backSp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(samaDengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(per, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(persen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backSp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(per, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seperX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kuadrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(akar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tujuh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delapan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sembilan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(satu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(koma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(samaDengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void clearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearEntryActionPerformed
        display.setText("");
        angka = "";
    }//GEN-LAST:event_clearEntryActionPerformed

    private void samaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samaDenganActionPerformed
        switch(operasi){
            case 1:
                angka2 = Double.parseDouble(angka);
                hasil = angka1 + angka2;
                angka = Double.toString(hasil);
                display.setText(angka);
                break;
            case 2:
                angka2 = Double.parseDouble(angka);
                hasil = angka1 - angka2;
                angka = Double.toString(hasil);
                display.setText(angka);
                break;
            case 3:
                angka2 = Double.parseDouble(angka);
                hasil = angka1 * angka2;
                angka = Double.toString(hasil);
                display.setText(angka);
                break;
            case 4:
                angka2 = Double.parseDouble(angka);
                if(angka2 == 0){
                    display.setText("Math Error");
                }else{
                hasil = angka1 / angka2;
                angka = Double.toString(hasil);
                display.setText(angka);
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_samaDenganActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
        angka1 = Double.parseDouble(angka);
        hasil = angka1 * 0.01;
        angka = Double.toString(hasil);
        display.setText(angka);
    }//GEN-LAST:event_persenActionPerformed

    private void perActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perActionPerformed
        angka1 = Double.parseDouble(angka);
        display.setText("/");
        angka = "";
        operasi = 4;
    }//GEN-LAST:event_perActionPerformed
    
    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
        angka += "4";
        display.setText(angka);
    }//GEN-LAST:event_empatActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
        angka += "0";
        display.setText(angka);
    }//GEN-LAST:event_nolActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        angka += "1";
        display.setText(angka);
    }//GEN-LAST:event_satuActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        angka += "2";
        display.setText(angka);
    }//GEN-LAST:event_duaActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
        angka += "3";
        display.setText(angka);
    }//GEN-LAST:event_tigaActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
        angka += "5";
        display.setText(angka);
    }//GEN-LAST:event_limaActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
        angka += "6";
        display.setText(angka);
    }//GEN-LAST:event_enamActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
        angka += "7";
        display.setText(angka);
    }//GEN-LAST:event_tujuhActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
        angka += "8";
        display.setText(angka);
    }//GEN-LAST:event_delapanActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
        angka += "9";
        display.setText(angka);
    }//GEN-LAST:event_sembilanActionPerformed

    private void komaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komaActionPerformed
        angka += ".";
        display.setText(angka);
    }//GEN-LAST:event_komaActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        display.setText("");
        angka1 = 0;
        angka2 = 0;
        hasil = 0;
        angka = "";
    }//GEN-LAST:event_clearActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        angka1 = Double.parseDouble(angka);
        display.setText("+");
        angka = "";
        operasi = 1;
    }//GEN-LAST:event_tambahActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        angka1 = Double.parseDouble(angka);
        display.setText("-");
        angka = "";
        operasi = 2;
    }//GEN-LAST:event_kurangActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        angka1 = Double.parseDouble(angka);
        display.setText("*");
        angka = "";
        operasi = 3;
    }//GEN-LAST:event_kaliActionPerformed

    private void backSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSpActionPerformed
        display.setText(display.getText().substring(0,display.getText().length()-1));
        angka = display.getText();
    }//GEN-LAST:event_backSpActionPerformed

    private void akarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akarActionPerformed
        angka1 = Double.parseDouble(angka);
        if(angka1 < 0){
            display.setText("Syntax Error");
        }else{
        hasil = Math.sqrt(angka1);
        angka = Double.toString(hasil);
        display.setText(angka);      
        } 
    }//GEN-LAST:event_akarActionPerformed

    private void kuadratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuadratActionPerformed
        angka1 = Double.parseDouble(angka);
        hasil = angka1 * angka1;
        angka = Double.toString(hasil);
        display.setText(angka);
    }//GEN-LAST:event_kuadratActionPerformed

    private void seperXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seperXActionPerformed
        angka1 = Double.parseDouble(angka);
        hasil = 1/angka1;
        angka = Double.toString(hasil);
        display.setText(angka);
    }//GEN-LAST:event_seperXActionPerformed

    private void plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminusActionPerformed
        double angkaSign = (-1) * Double.parseDouble(angka);
        angka = Double.toString(angkaSign);
        display.setText(angka);
    }//GEN-LAST:event_plusminusActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akar;
    private javax.swing.JButton backSp;
    private javax.swing.JButton clear;
    private javax.swing.JButton clearEntry;
    private javax.swing.JButton delapan;
    private javax.swing.JTextPane display;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kali;
    private javax.swing.JButton koma;
    private javax.swing.JButton kuadrat;
    private javax.swing.JButton kurang;
    private javax.swing.JButton lima;
    private javax.swing.JButton nol;
    private javax.swing.JButton per;
    private javax.swing.JButton persen;
    private javax.swing.JButton plusminus;
    private javax.swing.JButton samaDengan;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton seperX;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tiga;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
