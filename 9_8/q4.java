import java.util.*;
class H{

	static int counter = 0;
	H(){
		counter ++;
		
	}
	static void printCount(){
		System.out.println("Count is " + counter);
	}


}



public class q4 {

	public static void main(String[] args){
	
		H obj1 = new H();
		H obj2 = new H();
		H.printCount();	
		
		
	
	}

}
