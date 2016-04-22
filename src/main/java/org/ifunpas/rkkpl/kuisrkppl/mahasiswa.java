/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkkpl.kuisrkppl;

/**
 *
 * @author SB-604-21
 */
public class mahasiswa {
    private String nama;
    private String nrp;
    private String matkul;

    public mahasiswa(String nama, String nrp, String matkul) {
        this.nama = nama;
        this.nrp = nrp;
        this.matkul = matkul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }
    
    
}
