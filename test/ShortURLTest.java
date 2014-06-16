import java.util.Scanner;

public class ShortURLTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long idx;
		String res;
		while (true) {
			idx = sc.nextLong();
			res = "";
			if (idx == -1) {
				break;
			}
			System.out.println(res(idx, res));
		}
	}
	public static String res(long idx, String res) {
		if (idx >= 52) {
			long loop = (idx / 52) - 1;
			idx -= (loop + 1) * 52;
			res += res(loop, res);
		}
		if (idx >= 26) {
			idx += 6;
		}
		return res += (char) (idx + 65);
	}
}
