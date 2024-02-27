package com.demo;

public class Array {

	public static void main(String[] args) {
		// using literals
		/*
		 * int array[]= {10,20,30,40,90}; for(int i:array) { System.out.println(i); }
		 * 
		 * //using new keyword int sid[]=new int[5]; sid[0]=101; sid[1]=102; sid[2]=103;
		 * sid[3]=104; sid[4]=105; System.out.println(sid.length);
		 * 
		 * for(int i=0;i<5;i++) { System.out.println(sid[i]); }
		 */
		// multiple dimensional array using literals
		/*
		 * String realdata[][]=
		 * {{"username","password"},{"rakesh","rakesh123"},{"rakesh","rakesh123"},{
		 * "rakesh","rakesh123"}};
		 * 
		 * System.out.println("number of rows"+(realdata.length-1));
		 * System.out.println("number of columns"+realdata[0].length); for(int
		 * i=0;i<realdata.length;i++) { for(int j=0;j<realdata[i].length;j++) {
		 * System.out.print(realdata[i][j]+"\t"); }System.out.println(); } for(Object
		 * i[]:realdata) { for(Object j:i) { System.out.print(j+"\t");
		 * }System.out.println(); }
		 */
		// using new keyword
		/*
		 * String array[][]=new String[4][2];
		 * 
		 * array[0][0]="Rakesh"; array[0][1]="R@kesh123"; array[1][0]="Rajesh";
		 * array[1][1]="R@jesh123"; array[2][0]="radha"; array[2][1]="r@dha123";
		 * array[3][0]="ganesh"; array[3][1]="g@nesh123";
		 * 
		 * System.out.println("no of rows"+array.length);
		 * System.out.println("no of columns"+array[0].length);
		 * 
		 * for(String i[]:array) { for(String j:i) { System.out.print(j+"\t");
		 * }System.out.println(); }
		 */

	}
}
