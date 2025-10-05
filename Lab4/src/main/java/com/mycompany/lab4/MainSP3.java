//Name : 
//Mssv : 
//Date : 
//Slide:

package com.mycompany.lab4;

import java.util.Scanner;

public class MainSP3 {

    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);
        // Sản phẩm constructor 3 tham số
        SanPham3 sp1 = new SanPham3("iPhone 17", 24990000, 500000);

        // Sản phẩm constructor 2 tham số
        SanPham3 sp2 = new SanPham3("Xiaomi 17 pro", 19990000);

        // Xuat
        System.out.println("----- San pham 1 -----");
        sp1.xuat();

        System.out.println("\n----- San pham 2 -----");
        sp2.xuat();
    }

}
