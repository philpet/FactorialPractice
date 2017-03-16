/**
 * Created by philpet on 3/14/17.
 */
public class FactorialPractice {

	public static int FactorialR(int n) throws IllegalArgumentException {
		if (n<0)
			throw new IllegalArgumentException("Positive or zero, please.");

		if (n<=1)
			return 1;
		return n * FactorialR(n-1);
	}

	public static int FactorialL(int n) {
		int result = 1;
		for (int i=1; i<=n; i++)
			result *= i;
		return result;
	}

	public static int addR(int n) {
		if (n==1)
			return 1;
		return n + addR(n-1);
	}

	public static int addL(int n) {
		int result = 0;
		for (int i=1; i<=n; i++)
			result += i;
		return result;
	}

	public static void main(String[] args) {
		int fR = FactorialR(10);
		int fL = FactorialL(10);
		System.out.printf("%1d\n", fR);
		System.out.printf("%1d\n", fL);

		try {
			System.out.printf("%1d\n", FactorialR(-100));
		}
		catch (Exception e) {
			System.out.printf("ERROR: %1s\n", e.getMessage());
		}

		fL = 10;
		System.out.printf("%1d", addR(fL));
	}
}
