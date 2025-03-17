import java.util.*;
public class secondMax{
	public static int secondmax(int[] array){
		int first = -999999;
		int second = -999999;
		for(int i = 0; i < array.length; i++){
			if(array[i] > first){
				second = first;
				first = array[i];
				}
			else if(array[i] > second && array[i] != first){
				second = array[i];
			}
		}
		return second;
	}
	public static void main(String[] args){
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(secondmax(array));
		}
	}
