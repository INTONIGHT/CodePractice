package helloThere;

public class Check {
	boolean checkCard(int num) {
		String temp = Integer.toString(num);
		int x = temp.charAt(num.length());
		if(temp.length() < 14 || temp.length() > 19) {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
