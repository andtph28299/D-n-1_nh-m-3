/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author DO VAN DAO
 */
public class mauSac {
    String maMauSac,ten;

    public mauSac(String maMauSac, String ten) {
        this.maMauSac = maMauSac;
        this.ten = ten;
    }

    public String getMaMauSac() {
        return maMauSac;
    }

    public void setMaMauSac(String maMauSac) {
        this.maMauSac = maMauSac;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public mauSac() {
    }
    
}
