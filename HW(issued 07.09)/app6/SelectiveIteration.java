public class SelectiveIteration{
	public static void main(String[] args){
		int value=1100;
		int iterator=0;
		
		while(iterator<value){
			if(iterator % 3==0 || (iterator+5) %7==0 || iterator%10==0 || iterator==0){iterator++;continue;}
			else{
				System.out.println(iterator);
				iterator++;
			}		
		}
	}
}