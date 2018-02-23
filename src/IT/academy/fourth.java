package IT.academy;

import java.util.Random;

public class fourth {
    public static void main(String[] args) {
        Random random = new Random();
        int moneyAmount = random.nextInt(1000);
        int tenRanK = moneyAmount % 10;
        int hundRanK = moneyAmount % 100;
        System.out.printf(moneyAmount + " Рубл");
        if ((tenRanK == 0) || (tenRanK > 4) && (tenRanK < 10) || (hundRanK > 10) && (hundRanK < 15))
            System.out.printf("ей ");
        else if (tenRanK == 1) System.out.printf("ь ");
        else if ((tenRanK > 1) && (tenRanK < 5)) System.out.printf("я ");
    }
}
