import java.util.*;
public class q3 {

	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of ELments ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0 ; i < n; i ++){
			arr[i] = sc.nextInt();
		
		}
		for(int i = 0; i < n;i++){
			for(int j = 0 ; j < n-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}		
		}
		int count = 0;
		for(int i = 0; i <  n+1; i ++){
			
			if(arr[i+1] == arr[i]){
				count ++:
			}
		}
		
		
	
	}

}
