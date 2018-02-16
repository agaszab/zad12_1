import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        TreeSet<Integer> liczby = new TreeSet<>();
        Random rand = new Random();

        int suma=0;

        for (int i = 0; i < 50; i++) {
            liczby.add(rand.nextInt(1000)); // autoboxing
        }

       for (int liczba:liczby) {
           suma+=liczba;
        }
        double srednia=suma/50;

        for (int liczba:liczby) {
            if (liczba>srednia) System.out.print (liczba+" ");
        }
        System.out.println();
        System.out.println("Najmniejsza liczba ze zbioru: "+liczby.first());
        System.out.println("Największa liczba ze zbioru: "+liczby.last());
        System.out.println("Średnia: "+srednia);
    }
}
