/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class SanPham4 {
    private String tenSP;
    private Double Gia;
    private Double giamGia;
    
    //constructor
    public SanPham4(){
        
    }
    //constructor 2 tham so
    public SanPham4(String tenSP, double Gia) {
        this(tenSP, Gia, 0);
    }
    // Constructor 3 tham số
    public SanPham4(String tenSP, double Gia, double giamGia) {
        this.tenSP = tenSP;
        this.Gia = Gia;
        this.giamGia = giamGia;
    }
    //get set
    public String gettenSP(){
        return tenSP;
    }
    public void settenSP(){
        this.tenSP = tenSP;
    }
    public double getGia(){
        return Gia;
    }
    public void setGia(){
        this.Gia = Gia;
    }
    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    private double getThueNhapKhau() {
        return Gia * 0.1;
    }
    public void xuat() {
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Don gia: " + Gia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
}
