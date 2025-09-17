/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai10;
import java.util.Scanner;

/**
 *
 * @author Lê Hoàng Hải
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }

        System.out.println("Tong cac so tu 1 den " + n + " la: " + tong);
        sc.close();
    }
}
