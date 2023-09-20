
public class JavaHomeWork {
  public static void main(String[] args) {

    boolean TRUE = true;
    boolean FALSE = false;

    // таблицы истинности
    System.out.println(" ");
    System.out.println("Таблица истинности");
    System.out.println(" ");
    System.out.println("True AND False IS " + (TRUE && FALSE) + " Should be False");
    System.out.println("True AND True IS " + (TRUE && TRUE) + " Should be True");
    System.out.println("False AND False IS " + (FALSE && FALSE) + " Should be False");

    System.out.println("True OR False IS " + (TRUE || FALSE) + " Should be True");
    System.out.println("True OR True IS " + (TRUE || TRUE) + " Should be True");
    System.out.println("False OR False IS " + (FALSE || FALSE) + " Should be False");

    System.out.println("Not TRUE IS " + (!TRUE) + " Should be False");
    System.out.println("Not False IS " + (!FALSE) + " Should be True");

    //int
    System.out.println(" ");
    System.out.println("INTEGER");
    System.out.println(" ");
    int a = 2;
    int b = 12999;

    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a : b = " + (a / b));
    System.out.println("ostatok ot delenia a na b = " + (a % b));

    System.out.println(" ");
    System.out.println("SHORT");
    System.out.println(" ");
    short c = 1023;
    short g = 217;

    System.out.println("c + d = " + (c + g));
    System.out.println("c - d = " + (c - g));
    System.out.println("c : d = " + (c / g));
    System.out.println("ostatok ot delenia a na d = " + (c % g));

// комбинации
    byte e = 12;
    float d = 1.43f;
    double m = 1.985643;
    char l = 'a';

    System.out.println(" ");
    System.out.println("Комбинации");
    System.out.println(" ");

    System.out.println("Byte + Float = " + e + d);
    System.out.println("Byte * Float = " + e * d);
    System.out.println("Byte / Float = " + e / d);

    System.out.println("Double + Float = " + m + d);
    System.out.println("Double * Float = " + m * d);
    System.out.println("Double / Float = " + m / d);

    System.out.println("Float + Char = " + d + l);
    System.out.println("Float * Char = " + d * l);
    System.out.println("Float / Char = " + d / l);


  }
}