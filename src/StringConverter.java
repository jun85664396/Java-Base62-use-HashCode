public class StringConverter {
	public static String shortURL(long idx, String res) {
		if (idx >= 52) {
			long loop = (idx / 52) - 1;
			idx -= (loop + 1) * 52;
			res += shortURL(loop, res);
		}
		if (idx >= 26) {
			idx += 6;
		}
		return res += (char) (idx + 65);
	}
}
