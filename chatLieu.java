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
public class chatLieu {
    String maChatLieu,ten;

    public chatLieu(String maChatLieu, String ten) {
        this.maChatLieu = maChatLieu;
        this.ten = ten;
    }

    public String getMaChatLieu() {
        return maChatLieu;
    }

    public void setMaChatLieu(String maChatLieu) {
        this.maChatLieu = maChatLieu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public chatLieu() {
    }
    
}
