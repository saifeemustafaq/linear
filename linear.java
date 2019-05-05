import java.util.*;
public class LinearSearch { 
	public static void main(String[] args) 
	{ 
	   int n, sum = 0, index = 0;
       Scanner s = new Scanner(System.in);
       System.out.print("Enter no. of elements:");
       n = s.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter all the elements:");
       for(int i = 0; i < n; i++)
       {
        arr[i] = s.nextInt();
       } 
       
       System.out.println("element to search:");
		   int x = s.nextInt(); 
       for (int i = 0; i < n; i++) { 
			  if (arr[i] == x)
			  {
				  index = i;
				  System.out.println("Element found at position " + index);
			  }
			  else
			  {
			    index = -1;
			    System.out.println("Element is not present in the array");
			  }
		} 
		/* 
		if (index == -1) 
			System.out.println("Element is not present in the array"); 
		else
			System.out.println("Element found at position " + index); */
	} 
} 
