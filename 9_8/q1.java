//import java.utils.Scanner;

public class q1{
	public static void main(String[] args){
		int arr[] = new int[3];
		for(int i = 0 ; i < 3;i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		int largest = (arr[0] > arr[1]) ?  (arr[0] > arr[2]) ?  arr[0] : arr[2]  : (arr[1] > arr[2]) ?  arr[1] : arr[2];
		//int largest = 0;
		System.out.println(largest);
	}
}
