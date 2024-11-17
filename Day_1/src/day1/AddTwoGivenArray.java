package day1;

import java.util.ArrayList;
import java.util.List;

public class AddTwoGivenArray {
	public static void main(String[] args) {
		 int[] array1 = {1, 2, 3};
	     int[] array2 = {4, 5, 6, 7, 8};
	     
	     //Approach 1
	     int arr1=array1.length;
	     int arr2=array2.length;
	     int[] addArray = new int[array1.length+array2.length];
	     System.arraycopy(array1, 0, addArray,0, arr1);
	     System.arraycopy(array2, 0, addArray,arr1,arr2);
	     
	     for (int i = 0; i < addArray.length; i++) {
			System.out.print(addArray[i]+" ");
		}
	    System.out.println();
	     
	    //Approach 2
	    for (int i = 0; i < array1.length; i++) {
			addArray[i]=array1[i];
		} 
	    for (int i = 0; i < array2.length; i++) {
			addArray[arr1+i]=array2[i];
		}
	    for (int i = 0; i < addArray.length; i++) {
			System.out.print(addArray[i]+" ");
		}
	    System.out.println();
	    
	    //Approach 3 using collection
	    List<Integer> list=new ArrayList<Integer>();
	    for (int i = 0; i < array1.length; i++) {
			list.add(array1[i]);
		}
	    for (int i = 0; i < array2.length; i++) {
	    	list.add(array2[i]);
	    }
	    System.out.println(list);
	    
	}
}

