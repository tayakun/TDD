package money;

public class Pair {

	private String from;
	private String to;

	Pair(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public boolean equals(Object object) {
		Pair pair = (Pair) object;
		return from.contentEquals(pair.from) && to.contentEquals(pair.to);
	}

	public int hashCode() {
		return 0;
	}
}
