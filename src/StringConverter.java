public class StringConverter {
	public static String res(long idx, String res) {
		if (idx >= 62) {
			long loop = (idx / 62) - 1;
			idx -= (loop + 1) * 62;
			res += res(loop, res);
		}
		if (idx >= 36) {
			idx += 6;
		}
		if(idx >= 10){
			idx += 7;
		}
		return res += (char) (idx + 48);
	}
}
