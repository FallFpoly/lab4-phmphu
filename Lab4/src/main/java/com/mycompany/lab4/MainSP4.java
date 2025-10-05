/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class MainSP4 {

    public static void main(String[] args) {
        SanPham4 sp1 = new SanPham4("Laptop MSI Katana 15 HX B14WEK-027VN", 37690000, 3700000);
        SanPham4 sp2 = new SanPham4("MacBook Pro 14 M4", 37690000);
        System.out.println("----- San pham 1 -----");
        sp1.xuat();
        System.out.println("\n----- San pham 2 -----");
        sp2.xuat();
    }
}
