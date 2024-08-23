public class q2 {

	public static void main(String[] args){
		
		int arr[] = new int[10];
		int even = 0;
		int odd =0;
		for(int i = 0 ; i < 10 ; i ++){
			arr[i] = Integer.parseInt(args[i]);
			if(arr[i] % 2 == 0 ){
				System.out.println( arr[i] +" is Even");	
				even += 1;
			}else{
				System.out.println( arr[i] +" is Odd");
				odd += 1;
			}			
		}	
		System.out.println("Even : " + even + "   Odd : "+  odd);
		
	
	}

}
