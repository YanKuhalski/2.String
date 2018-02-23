package IT.academy;

import java.util.Random;

public class second {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        if (number % 10 == 7) {
            System.out.println("Число " + number + " заканчивается на 7");
        } else {
            System.out.println("Число " + number + " не заканчивается на 7");
        }
    }
}
