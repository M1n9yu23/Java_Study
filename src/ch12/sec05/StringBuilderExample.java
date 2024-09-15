package ch12.sec05;

public class StringBuilderExample {

  public static void main(String[] args) {
    String data = new StringBuilder()
        .append("DEF")
        .insert(0, "ABC")
        .delete(3,4)
        .toString();
    System.out.println(data);

    StringBuilder data2 = new StringBuilder();
    data2.append("DEF");
    data2.insert(0,"ABC");
    data2.delete(3,4);
    String strdata = data2.toString();
    System.out.println(strdata);
  }

}
