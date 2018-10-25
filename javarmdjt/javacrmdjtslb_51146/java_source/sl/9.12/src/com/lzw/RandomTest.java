package com.lzw;

import java.util.*;

public class RandomTest {

	/**
	 * @param args
	 * 获取2到32之间的6个偶数，并且求这6个偶数的和
	 */
	public static double EvenNum(double num1,double num2){
		double s=0;
		int[] j=new int[6];
		Random cres = new Random();
		for (int w = (int)num1,i=0; w <= (int)num2; w += 2) {
				j[i] = cres.nextInt((int) num2);
				if (j[i]!=0&&j[i] % 2 == 0) {
					System.out.println(j[i]);
					s += j[i];
					i++;
				}
				if(i==6) break;
		}
		return s;
	}	
	public static double EvenNum2(double num1,double num2){
		double s=0;
		int[] j=new int[6];
		for(int i=0,w=0;i<20;i++){
			j[w]=(int)num1+(int)(Math.random()*(num2-num1));
			if (j[w]!=0&&j[w] % 2 == 0) {
				System.out.println("打印2到32之间的偶数(不包括32)"+j[w]);
				s += j[w];
				w++;
			}
			if(w==6) break;
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println("和为："+EvenNum2(2,32));
	}

}
