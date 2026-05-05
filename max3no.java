package controlstate;

public class max3no {

	public static void main(String[] args) {
		int a=4,b=20,c=70;
		if(a>=b&&a>=c) {
			System.out.println(a+" is max");
		}
		else if(b>=a&&b>=c) {
		   System.out.println(b+" is max");
		}
		else {
			System.out.println(c+" is max");
		}

	}

}
