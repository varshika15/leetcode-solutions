package com.techmisal.easy;

//import java.io.*;
//import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Keypad {
	
	public static void solve(int arr[], int index, String str[], StringBuilder sb, 
			ArrayList<String> result) {
      if(index==arr.length) {
          result.add(sb.toString());
//          System.out.println(result);
      }
      else {
          sb = new StringBuilder(sb.toString());
//          System.out.println(sb);
          String s = str[arr[index]];
          for(int i=0;i<s.length();++i) {
              sb.append(s.charAt(i));
              solve(arr,index+1,str,sb,result);
              sb = new StringBuilder(sb.substring(0,sb.length()-1));
//              System.out.println(sb);
          }
      }
  }
  
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		    t--;
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = sc.nextInt();
		        
		    String str[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		    ArrayList<String> result = new ArrayList<String>();
		    StringBuilder sb = new StringBuilder();
		    solve(arr,0,str,sb,result);
		    for(int i=0;i<result.size();i++)
		        System.out.print(result.get(i)+" ");
		    System.out.println();
		}
	}

}