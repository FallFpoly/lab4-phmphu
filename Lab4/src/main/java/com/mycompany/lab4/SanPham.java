/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class SanPham {

    public String TenSP;
    public double Gia;
    public double GiamGia;

    // Constructor
    public SanPham(String TenSP, double Gia, double GiamGia) {
        this.TenSP = TenSP;
        this.Gia = Gia;
        this.GiamGia = GiamGia;
    }

    public SanPham() {

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
//    thuế

    public double getThueNhapKhau() {
        return Gia * 0.1;
    }

    //nhập
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        TenSP = sc.nextLine();
        System.out.print("Nhap don gia: ");
        Gia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        GiamGia = sc.nextDouble();
        sc.nextLine(); // bỏ qua ký tự xuống dòng
    }

    //xuất
    public void xuat() {
        System.out.println("Ten san pham: " + TenSP);
        System.out.println("Don gia: " + Gia);
        System.out.println("Giam gia: " + GiamGia);
        System.out.println("Thue: " + getThueNhapKhau());

    }

}
