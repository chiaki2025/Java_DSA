import java.util.*;
public class userInput{
	public void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
			}
		}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		userInput arrayUtil = new userInput();
		int[] array = new int[5];
		for(int i = 0; i < 5; i++){
			array[i] = scanner.nextInt();
		}
		scanner.close();
		arrayUtil.printArray(array);
	}
}
