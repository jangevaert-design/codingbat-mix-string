public class mixString {
  public String mixString(String a, String b) {
    int lena = a.length();
    int lenb = b.length();
    int max = Math.max(lena, lenb);
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < max; i++) {
      if (i <= lena - 1) {
        result.append(a.charAt(i));
      }
      if (i <= lenb - 1) {
        result.append(b.charAt(i));
      }

    }

    return result.toString();
  }
}
