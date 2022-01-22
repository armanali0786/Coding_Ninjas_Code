import java.util.Scanner;
public class FirstIndexofElement {
    public static void main(String args[]) {
		
		// Write code here
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int [] array = new int[size];
    for (int i = 0; i < array.length; i++){
        array[i] = scanner.nextInt();
    }
    int value = scanner.nextInt();
    int index = -1;
    for(int i = 0; i < array.length; i++){
        if (array[i] == value) 
        {
            index = i; break;
        }
    }
    System.out.println(index);
	}
}
