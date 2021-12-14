/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class KiemTraLienThongManh {
    static ArrayList<Integer>[] ke = new ArrayList[1005];
    static boolean chuaxet[] = new boolean[1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            for(int i=1; i<=n; i++){
                ke[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for(int i=1; i<=m;i++){
                int u = sc.nextInt(), v = sc.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            dfs(1);
            boolean check = true;
            for(int i=1; i<=n; i++){
                if(chuaxet[i]){
                    check = false;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static void dfs(int u){
        chuaxet[u] = false;
        for(Integer v : ke[u]){
            if(chuaxet[v])
                dfs(v);
        }
    }
}
