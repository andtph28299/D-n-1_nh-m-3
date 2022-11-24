/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author DO VAN DAO
 */
public class hoaDon {
    String maHD,maNV,maKH,trangThai;
    Date ngayTao;

    public hoaDon(String maHD, String maNV, String maKH, String trangThai, Date ngayTao) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.maKH = maKH;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
    }

    public hoaDon() {
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    
}
