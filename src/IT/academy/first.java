package IT.academy;

public class first {
    public static void main(String[] args) {
        String str = "Утром Митя с папой пошли в лес. Они собирали грибы и ягоды. Грибы клали в лукошко. Его нёс папа. Ягоды клали в пакет. Его нёс Митя. Домой вернулись к обеду.";
        int length = str.length();
        System.out.println("Количество символов в данной строке " + length);
        int  lengthHalf = length / 2;
        String str1 = str.substring(0,  lengthHalf);
        String str2 = str.substring( lengthHalf);
        System.out.println("Первая часть строки -> " + str1);
        System.out.println("Вторая часть строки -> " + str2);
    }
}
