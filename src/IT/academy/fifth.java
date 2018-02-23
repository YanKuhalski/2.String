package IT.academy;

public class fifth {
    public static void main(String[] args) {
        String str1 = new String("? my name ## is Yan! ####? from Belarus! ? ##from Belarus  again!###");
        String str2 = str1.replace("?", "Hello").replace("#", "");
        System.out.println(str2);
    }
}
