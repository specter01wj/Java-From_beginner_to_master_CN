public class Var_02 {	
	public static void main(String args[]){			
		for(int i=1;i<=7;i+=2){
			for(int kong=7;kong>i-1;kong--){
				System.out.print(" ");
			}
			for(int xing=1;xing<=i;xing++){
				System.out.print("* ");
			}
		       System.out.println();
		}
		for(int j=1;j<=5;j+=2){
				for(int kong1=1;kong1<j+3;kong1++){
					System.out.print(" ");
				}
				for(int xing1=5;xing1>=j;xing1--){
					System.out.print("* ");
				}
			System.out.println();
		}
    }
}