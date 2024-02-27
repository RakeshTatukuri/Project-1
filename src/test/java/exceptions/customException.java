package exceptions;

public class customException extends Exception{

	String str;
	customException(String str)
	{
		//super(str);
		this.str=str;
	}
	public String toString()
	{
		return ("msg="+str);
	}
   
}
