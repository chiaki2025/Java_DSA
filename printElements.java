import java.util.*;
public class printElements{

	public void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
			}
		}

	public static void main(String[] args){
		printElements arrayUtil = new printElements();
		int[] array = {1, 2, 3, 4, 5};
		arrayUtil.printArray(array);
		}
}
