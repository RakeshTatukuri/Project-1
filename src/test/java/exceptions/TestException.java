package exceptions;

public class TestException {

	public static void main(String[] args) {
		
		try {
			throw new customException("due to invalid value");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
