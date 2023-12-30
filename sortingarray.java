public class sortingarray {

	public static void main(String[] args) {
		int[] array = {10,20,5,65,30,31,69,17,58};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[i]) {
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		System.out.println("Third largest: "+array[array.length-3]);
		System.out.println("Second smallest: "+array[1]);
}
}
