package basicPrograms;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1+" "+n2);
		
		for (int i =1 ; i<=n ; i++) {
			int n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;	
		}
	}
}
