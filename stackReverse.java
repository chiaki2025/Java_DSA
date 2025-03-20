import java.util.*;
public class stackReverse{
	private ListNode top;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data = data;
			this.next = null;
			}
		}
	public boolean isEmpty(){
		if(top == null){
			return true;
			}
		else{
			return false;
			}
		}
	public void push(int data){
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		}
	public int pop(){
		int result = top.data;
		top = top.next;
		return result;
		}
	public static void main(String[] args){
		stackReverse sll = new stackReverse();
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		for(int i = 0; i < array.length; i++){
			array[i] = scanner.nextInt();
			}
		scanner.close();
		for(int i = 0; i < array.length; i++){
			sll.push(array[i]);
			}
		while(!sll.isEmpty()){
			for(int i = 0; i < array.length; i++){
				int reverse = sll.pop();
				System.out.print(reverse + " ");
				}
			}
		}
}
		
