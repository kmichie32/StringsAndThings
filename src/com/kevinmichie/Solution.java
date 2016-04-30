package com.kevinmichie;

import java.util.Scanner;

public class Solution {

    public void makeUpperCase(String a, String b){
        String toUpperCaseA = a.toUpperCase();
        String toUpperCaseB = b.toUpperCase();
        String holderA= toUpperCaseA.charAt(0) + "";
        String holderB= toUpperCaseB.charAt(0) + "";

        for(int i = 1; i < a.length(); i++){
            holderA += a.charAt(i);
        }
        for(int j = 1; j < b.length(); j++){
            holderB += b.charAt(j);
        }

        System.out.println(holderA + " "+ holderB);
    }

    public void lexicalScoping(String a, String b){

        if(a.charAt(0)> b.charAt(0)){
            System.out.println("Yes");
        }
        else if (a.charAt(0)<b.charAt(0)){
            System.out.println("No");
        }
        else if(a.charAt(0)== b.charAt(0) ){
            //int lengthOfLargerString;
            if(a.length() > b.length()){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");;
            }
            /*for(int i = 0 ; i < lengthOfLargerString; i++) {
                if (a.charAt(i) > b.charAt(i)) {
                    System.out.println("Yes");
                    break;
                }
                else{
                    System.out.println("Yes");
                    break;
                }
            }*/
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length()+B.length());

        solution.lexicalScoping(A,B);

        solution.makeUpperCase(A,B);

    }
}