public class Palindrome {

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.checkPalindrome("mom");
	}

	public void checkPalindrome(String s) {

		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		if (s.equals(reverse)) {
			System.out.println("String is a plaindrome");
		}
	}

}
