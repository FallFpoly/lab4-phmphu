/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class SanPham1 {

    public String TenSP;
    public Double Gia;
    public Double GiamGia;
    // Phương thức tính thuế nhập khẩu (10% giá sản phẩm)

    public double getThueNhapKhau() {
        return Gia * 0.1;
    }
    public SanPham1(){
        
    }
     // Get & Set
    public String getTenSp() {
        return TenSP;
    }

    public void setTenSp(String TenSP) {
        this.TenSP = TenSP;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public double getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(double GiamGia) {
        this.GiamGia = GiamGia;
    }

    //nhập
    public void nhap(java.util.Scanner sc) {
        System.out.print("Nhap ten san pham: ");
        TenSP = sc.nextLine();
        System.out.print("Nhap don gia: ");
        Gia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        GiamGia = sc.nextDouble();
        sc.nextLine(); // bỏ qua ký tự xuống dòng
    }

    // Constructor 
    public SanPham1(String TenSP, double Gia, double GiamGia) {
        this.TenSP = TenSP;
        this.Gia = Gia;
        this.GiamGia = GiamGia;
    }

    public void xuat() {
        System.out.println("ten san pham: " + TenSP);
        System.out.println("gia san pham: " + Gia);
        System.out.println("giam gia: " + GiamGia);
        System.out.println("thue: " + getThueNhapKhau());
    }

}
