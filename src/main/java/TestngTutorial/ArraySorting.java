package TestngTutorial;

public class ArraySorting {
	public static void main(String [] args) {
		int arr[] = {3,5,2,8,9};
		int temp=0;
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]);
			
			}
		System.out.println(" ");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=i+1; j<=arr.length-1;j++)
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
				for (int i=0; i<=arr.length-1; i++) {
					System.out.print(arr[i]);
					}
				
			}
		}
	


