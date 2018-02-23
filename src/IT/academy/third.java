package IT.academy;

public class third {
    public static void main(String[] args) {
        int minLength = 1;
        int maxLength = 10;
        int lengthA = minLength + (int) (Math.random() * maxLength);
        int lengthB = minLength + (int) (Math.random() * maxLength);
        int Radius = minLength + (int) (Math.random() * maxLength);
        double diagonalHalf = Math.sqrt(Math.pow(lengthA, 2) + Math.pow(lengthB, 2)) / 2;
        System.out.println("Высота отверстия =  " + lengthA);
        System.out.println("Ширина отверстия =  " + lengthB);
        System.out.println("Диагональ отверстия  =  " + diagonalHalf * 2);
        System.out.println("Радиус картонки  =  " + Radius);
        if (Radius >= diagonalHalf) {
            System.out.println("Данный круг сможет закрыть отверстие");
        } else {
            System.out.println("Данный круг не сможет закрыть отверстие");
        }
    }
}
