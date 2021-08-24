package helloThere;

public class Check {
	public boolean checkCard(String num) {
		int sum = 0;
		boolean change = false;
		for(int i = num.length() - 1; i >=0; i--) {
			int n = Integer.parseInt(num.substring(i,1+i));
			if (change) {
				n = n*2;
				if(n > 9) {
					n = (n%10) +1;
				}
			}
			sum +=n;
			change = !change;
		}
		return (sum % 10 == 0);
	}
	
	public static void main(String[] args) {
		Check test = new Check();
		String x = "1234567890123452";
		System.out.println(test.checkCard(x));
		
	}
}
