package assignment;
import java.util.Scanner;
public class Problem4{
public static void main(String[] args) {
	
Scanner scan= new Scanner(System.in);

System.out.println("Enter the length of array");
int arr[]= new int [scan.nextInt()];

System.out.println("Enter the array elements");
for(int i=0;i<=arr.length-1;i++) {
 arr[i]=scan.nextInt();
}
System.out.print("{");
for(int i=1;i<=9;i++) {
	int k=0;
	for(int j=0;j<=arr.length-1;j++) 
		{
		
	if(arr[j]%i==0) {
		
		k++;
	}
	
	
}
System.out.print(i+":"+k+",");

}	
System.out.println("}");
}
}
