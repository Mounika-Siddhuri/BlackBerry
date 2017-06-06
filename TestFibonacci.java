package collections;

public class TestFibonacci {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter the length:");
		int n=scanner.nextInt();
		int n1=0;
		int n2=1;
		System.out.println(n1+"\n"+n2);
		for(int i=1;i<=n;i++){
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
