/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quyhoachdong;

import java.util.Scanner;

/**
 *
 * @author Nghĩa
 */
public class ConEch {
    public static void main(String[] args) {
        long f[] = new long[55];
        f[1]=1; f[2]=2; f[3]=4;
        for(int i=0; i<=50; i++){
            f[i]=f[i-1] + f[i-2] + f[i-3];
        }
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            System.out.println(f[n]);
        }
    }
}
