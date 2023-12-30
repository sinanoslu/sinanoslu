import java.util.Scanner;
public class uniquevalues {
	public static void main(String[]args) {

				Scanner input=new Scanner(System.in);
				System.out.println("Enter size of array: ");
				int size =input.nextInt();
				int[]arr=new int[size];
				for(int i=0;i<size;i++) {
				System.out.println("Enter "+(i+1)+" element of array: ");
					arr[i]=input.nextInt();
				}
				unique(arr);
			}
			public static void unique(int[]arr) {
			
			for (int i=0;i<arr.length;i++) {
				boolean x=true;
				for(int j=0;j<i;j++) {
					if (arr[i]==arr[j]) {
						x=false;
						break;
					}
				}
				if(x) {
					System.out.print(arr[i]+" ");
			   	}
			  }
	}

}