public class RecursiveQuestion {

	// Q1
	public static int convert(String s) {
		if (s.length() == 1) {return (s.charAt(0) - '0');}
		int temp = s.charAt(0) - '0'; 
		temp = (int) (temp * Math.pow(10, s.length() - 1)); 
		return (int) temp + convert(s.substring(1));
	}

	// Q2
	public static int Ackermann(int x, int y) {
		if (x == 0) { return 2 * y; } 
		else if (y == 0) { return 0; }
		else if (y == 1) { return 2; }
		else { return Ackermann(x-1, Ackermann(x, y-1)); }
	}

	// Q3
	public static void towerOfHanoi(int n, String start, String target, String spare) {
		if (n == 0) { return; }
		towerOfHanoi(n-1, start, spare, target);
		System.out.println("Move disk " + n + " from " + start + " to " + target);
		towerOfHanoi(n-1, spare, target, start);
	}

	// Q4
	public static void permutation (int[] array, int prefixLen) {
		if (prefixLen == array.length - 1) {
			for (int i = 0; i < array.length; i++)
			{
				System.out.print(array[i]+" ");
			}System.out.println("");
		}
		else {
			for (int i = prefixLen; i < array.length; i++) {
				int temp = array[prefixLen];
				array[prefixLen] = array[i];
				array[i] = temp;
				permutation(array, prefixLen+1);
				temp = array[prefixLen];
				array[prefixLen] = array[i];
				array[i] = temp;
			}
		}
	}

	// Q5
	public static double sumover(int n) {
		if (n == 0) { return 0; } 
		else if (n == 1) { return n; } 
		else { return 1.0 / n + sumover(n-1); }
	}

	// Q6
	public static double pow(double x, int n) {
		if (x == 0 && n <= 0) { throw new IllegalArgumentException("x is zero and n = " + n); }
		else if (x == 0) { return 0; } 
		else if (n == 0) { return 1; } 
		else if (n % 2 == 0) { return pow(x, n / 2) * pow(x, n / 2); } 
		else if (n > 0) { return x * pow(x, (n - 1) / 2) * pow(x, (n - 1) / 2); } 
		else { return 1 / pow(x, -n); }
	}

	public static void main(String[] args) {
		System.out.println("--------------Convert Method -----------------");
		System.out.println(convert("287321"));
		System.out.println(convert("5766"));
		System.out.println("--------------Ackermann Method -----------------");
		System.out.println(Ackermann(3, 3));
		System.out.println(Ackermann(1, 2));
		System.out.println(Ackermann(2, 1));
		System.out.println("--------------Towers of Hanoi Method -----------------");
		RecursiveQuestion.towerOfHanoi(3, "A", "B", "C");
		System.out.println("Done!!!");
		RecursiveQuestion.towerOfHanoi(4, "A", "B", "C");
		System.out.println("Done!!!");
		System.out.println("--------------Sumover Method -----------------");
		System.out.println(sumover(5));
		System.out.println(sumover(7));
		System.out.println("--------------Permutation Method -----------------");
		int[] array1 = {1};
		RecursiveQuestion.permutation(array1, 0);
		int[] array2 = {1,2};
		RecursiveQuestion.permutation(array2, 0);
		int[] array3 = {1,2,3,4,5};
		RecursiveQuestion.permutation(array3, 0);
		//int[] array4 = {1,2,3,4,5,6,7,8,9,10};
		//RecursiveQuestion.permutation(array4, 0);
		System.out.println("--------------Pow Method -----------------");
		System.out.println(pow(5, 2));
		System.out.println(pow(10, 3));
	}
}
