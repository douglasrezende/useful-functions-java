class Main {
  public static void main(String[] args) {
      String str1 = "Java is fun";

    // returns the length of str1
    int length = str1.length();


    System.out.println(str1.length());
  }
}

// Output: 11


class Main {
  public static void main(String[] args) {
    String str1 = "Java123is456fun";

    // regex for sequence of digits
    String regex = "\\d+";

    // replace all occurrences of numeric
    // digits by a space
    System.out.println(str1.replaceAll(regex, " "));


  }
}

// Output: Java is fun



class Main {
  public static void main(String[] args) {

    // a regex pattern for
    // four letter string that starts with 'J' and end with 'a'
    String regex = "^J..a$";

    System.out.println("Java".matches(regex));

  }
}

// Output: true


string.replaceFirst(String regex, String replacement)



class Main {
  public static void main(String[] args) {

    String str = "JavaScript";

    // checks if "JavaScript" starts with "Java"
    System.out.println(str.startsWith("Java"));

  }
}

// Output: true
