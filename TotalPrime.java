
    import java.util.Scanner;
class TotalPrime {	
	   public boolean checkPrime(int tocheck) {
       for (int i = 2; i <= tocheck / 2; i++) {
           if (tocheck % i == 0) return false;
       }
       return true;
   }
  public int totalPrime(int s, int e) {
 int counter = 0;
       for (int i = s; i <= e; i++) {
          if (checkPrime(i)) {
               counter++;
           }
       }
       return counter;
   }
}
class Solution {
	public static void main(String args[]) {
		
		TotalPrime obj = new TotalPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
		
			

