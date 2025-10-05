//Name : 
//Mssv : 
//Date : 
//Slide:

package com.mycompany.lab4;

import java.util.Scanner;

public class MainSP {

    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        // Nhập thông tin từ bàn phím
        System.out.println("*** San pham 1 ***");
        sp1.nhap();

        System.out.println("\n*** San pham 2 ***");
        sp2.nhap();

        // Xuất thông tin 2 sản phẩm
        System.out.println("\n*** Thong tin san pham 1 ***");
        sp1.xuat();

        System.out.println("\n*** Thong tin san pham 2 ***");
        sp2.xuat();

    }

}
