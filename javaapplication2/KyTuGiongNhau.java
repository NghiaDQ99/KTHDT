/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class KyTuGiongNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int insert = sc.nextInt();
            int delete = sc.nextInt();
            int copy = sc.nextInt();
            int[] dp = new int[n + 5];
            dp[0] = 0;
            dp[1] = insert;
            for (int i = 1; i <= n; i++) {
                if(i % 2 == 1) {
                    dp[i] = Math.min(dp[i - 1] + insert, dp[(i + 1) / 2] + copy + delete);
                }
                else{
                    dp[i] = Math.min(dp[i - 1] + insert, dp[i / 2] + copy);
                }
            }
            System.out.println(dp[n]);
        }
    }
}
