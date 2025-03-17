import java.util.*;
public class removeOdd{
	public static int[] remove(int[] array){
		int n = array.length;
		int count = 0;
		for(int i = 0; i < n; i++){
			if(array[i] % 2 == 0){
				count++;
			}
		}
		int[] newArray = new int[count];
		int index = 0;
		for(int i = 0; i < count; i++){
			if(array[i] % 2 == 0){
				newArray[index] = array[i];
				index++;
			}
		}
		return newArray;
	}

	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
			}
		}

	public static void main(String[] args){
		int[] array = {12, 224, 220, 223, 107, 67, 85};
		int[] newArray = remove(array);
		printArray(newArray);
	}
}
