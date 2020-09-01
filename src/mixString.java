public class mixString {
  public String mixString(String a, String b) {
    int lena = a.length();
    int lenb = b.length();
    int max = Math.max(lena, lenb);
    String result = "";

    for (int i = 0; i < max; i++) {
      if (i <= lena - 1) {
        result += a.substring(i, i + 1);
      }
      if (i <= lenb - 1) {
        result += b.substring(i, i + 1);
      }

    }

    return result;
  }
}
