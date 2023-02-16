import java.util.Scanner ;
public class reverseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the height of the triangle: ");
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		for(int i = 0 ; i<=h ;i++) {
			for(int k =0 ; k<i ; k++) {
				printBlank();
				}
			for(int s=2*(h-i) ;s>=0 ;s--) {
				printStar();
			}
			
			System.out.println();
			}
			
	}
	public static void printStar() 
	{
		System.out.print("*");
	}
	public static  void printBlank(){
		System.out.print(" ");
	
	
	}

	}
	
