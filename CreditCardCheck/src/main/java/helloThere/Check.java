package helloThere;

public class Check {
	public void checkCard(float num) {
		String temp = Double.toString(num);
		if(temp.length() < 14 || temp.length() > 19) {
			System.out.println("False");
		}
		char x = temp.charAt(temp.length());
		//this y is important
		int y = Integer.parseInt(String.valueOf(x));
		//stripping the temp1 of the last character
		String temp1 = temp.substring(0, temp.length()-1);
		//using String builder so some of what I do is easier.
		StringBuilder input = new StringBuilder();
		input.append(temp1);
		input.reverse();
		int[] input1 = new int[temp1.length()];
		for(int i =0;i<temp1.length();i++) {
			input1[i] = temp1.charAt(i);
		}
		int tempDig = 0;
		
		for(int i =0;i<input1.length;i++) {
			//my janky way of doubling each odd number digit.
			if(i % 2 != 0) {
				tempDig = input1[i] * 2;
				if(tempDig > 9) {
					String temp2 = Integer.toString(tempDig);
					int[] temp3 = new int[2];
					int sum = 0;
					for(int j = 0;j<temp2.length();j++) {
						temp3[i] = temp2.charAt(i);
					}
					for(int j = 0;j<temp3.length;j++) {
						sum += temp3[j];
					}
					tempDig = sum;
				}
				input1[i] = tempDig;
			}
		}
		int trueSum = 0;
		for(int i=0;i<input1.length;i++) {
			trueSum += input1[i];
		}
		String temp4 = Integer.toString(trueSum);
		char z = temp4.charAt(temp4.length());
		int w = Integer.parseInt(String.valueOf(z));
		int u = 10 -w;
		if(u != y) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}
		
	}
	
	public static void main(String[] args) {
		Check test = new Check();
		test.checkCard(25);
		
	}
}
