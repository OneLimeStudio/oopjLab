//import java.util.Scanner;

class helloworld{

	public static void main(String[] args){
		System.out.println("Hello");
		//Scanner sc = new Scanner(System.in);

		int arr[]  = new int[10], sum = 0;
		for (int i = 0;i < 10 ;i++ ) {
			arr[i] = Integer.parseInt(args[i]);
			sum += arr[i];
		}


		System.out.println(sum);

	}
}
