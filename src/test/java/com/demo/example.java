package com.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class example{
	public static void main(String[] args) {
		//split(Regular expression )--it is used for pattern matching
		/*String data="selenium,sql,java,testng,cucumber";
		String arr[]=data.split(",");
		for(String i:arr) {
			System.out.println(i);
		}
		
		String obj=data.split(",")[2];
		System.out.println(obj);
		
		String date="2024-Feb-14";
		String year=date.split("-")[0];
		String month=date.split("-")[1];
		String day=date.split("-")[2];
		System.out.println("year is"+year+"\nmonth is "+month +"\nday is"+day);
		*/
	/*	String s1=" Welcome to java class! ";
		String S2="Welcome to java class!";
		//concat() /+
		System.out.println(s1.concat(" "+S2));
		
		//trim()-ignores white space before and after string
		System.out.println(s1.trim());
		
		//chartat(index)
		System.out.println(S2.charAt(21));
		
		//contains
		System.out.println(s1.contains("Welcome"));
		
		//startswith() and endswith()
		System.out.println(s1.startsWith(" Wel"));
		System.out.println(s1.endsWith("class! "));
		
		//equality of Strings 1.equals()-exact matching but it is case senesitive 2.equalsignorecase()-exact matching but it is not case senesitive
		String a="Java is best programming language";
		String b="JAVa IS BEST PROGRAMMING LANGUAGE";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		//length()method includes char+index
		System.out.println(a.length());
		System.out.println(b.length());
		
		//conversion-touppercase() and tolowercase()
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
		//using literals
		String c1="java is";
		//c1=c1+"programming language";
		//System.out.println(c1);
		String c2="java is";
		System.out.println(c1==c2);
		
		//using new keyword
		String s2=new String("Java is");
		String s3=new String("Java is");
		System.out.println(s2==s3);
		*/
		
		//reverse a string without method
	/*	String s="Welcome";
		String res="";
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
		{
		res= res+s.charAt(i);
		}
		System.out.println(res);
		
		*/
		//reverse a string with method
	  /*  StringBuffer br=new StringBuffer("Hello");
		br.append("all");
		System.out.println(br);
		br.reverse();
		System.out.println(br);
		*/
		
		//remove duplicate characters from a string
	/*	String ss="ababababcdcdefab";
		
		LinkedHashSet<Character>  ls=new LinkedHashSet<Character>();
		for(int i=0;i<ss.length();i++)
		{
		ls.add( ss.charAt(i));	
		}
		System.out.println(ls);
		*/
		
		//even position characters in upper case and odd position characters in lower case
		/*String ss4="abcdef";
		System.out.println(ss4);
		String res="";
		for(int i=0;i<ss4.length();i++)
		{
			if(i%2==0)
			{
				res=res+ss4.toLowerCase().charAt(i);
			}else
			{
				res=res+ss4.toUpperCase().charAt(i);
			}
		}System.out.println(res);
		*/
		
		//remove spaces b/w given string
	/*	String s="welcome to java tutorial class";
		System.out.println(s);
		String res=s.replaceAll(" ", "");
		System.out.println(res);
		*/
		//amstrong means orginal and calculated numbers both are same
	/*	int num=153,r,res=0;
		int temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			res=res+(r*r*r);
		}
		//System.out.println(res);
		if(temp==res)
		{
			System.out.println(temp+" amstrong number");
		}else
		{
			System.out.println(temp+" not amstrong number");
		}
		*/
		//factorial number
	/*	int num=5, fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}System.out.println(fact);
		*/
		
		//palindrome number-reverse of number
	/*	int num=151,r,sum=0;
		int temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum*10+r;
		}System.out.println(sum);
		if(temp==sum)
		{
			System.out.println(temp+" palondrime number");
		}else
		{
			System.out.println(temp+ " not palindrome");
		}
		
		*/
		//swaping of two numbers
	/*	int a=151,b=0;
		System.out.println("before swaping a="+a +" b="+b );
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping a="+a +" b="+b);
		*/
		//1 to 100 numbers
	/*	//int num=100;
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
		*/
		//print 1 to 10 tables
		/*for(int rnum=1;rnum<=10;rnum++)
		{
			for(int c=1;c<=10;c++)
			{
				System.out.print(rnum*c+"\t");
			}System.out.println();
		}
		*/
		//printing stars
	/*	int num=4;
		for(int rnum=1;rnum<=num;rnum++)
		{
			for(int c=1;c<=num;c++)
			{
				System.out.print("*"+"\t");
			}System.out.println();
		}
		*/
		
		//printing numbers
	/*	for(int rnum=1;rnum<=5;rnum++)
		{
			for(int c=1;c<=rnum;c++)
			{
				//System.out.print(rnum+" ");
				System.out.print(c+" ");
			}System.out.println();
		}
		*/
		//printing L shape
	/*	for(int r=1;r<=10;r++)
		{
			if(r>=5)
			{
				System.out.print(r+" ");
			}else
			{
				System.out.println(r);
			}
		}
		
		*/
		
	/*	for(int rnum=1;rnum<=5;rnum++)
		{
			for(int c=1;c>=rnum;c--)
			{
				//System.out.print(rnum+" ");
				System.out.print("");
			}for(int k=1;k<=rnum;k++)
			{
				System.out.print("*");
			}System.out.println();
		}*/
		int num=5;
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"=");
		}
		
		
	}
}
