public class Palindromo {
  private Stack s;
  private String word;
  // private char arr[];

  public Palindromo(String w) {
    s = new Stack(w.length());
    word = w;
    // arr = new char[w.length()];
  }

  public void PushWordCharIntoStack() {
    for (int i = 0; i < word.length(); i++)
      s.Push(word.charAt(i));
  }

  // public void PopArray() {
  //   for (int i = 0; i < word.length(); i++)
  //     arr[i] = s.Pop();
  // }

  public void FormatWord() {
    word = word.toLowerCase().replaceAll("\\s", "");
  }

  public Boolean IsPalindrome() {
    FormatWord();
    PushWordCharIntoStack();
    // PopArray();

    for (int i = 0; i < word.length(); i++)
      if (s.Pop() != word.charAt(i))
        return false;
    return true;
  }
}
