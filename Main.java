import ru.geekbrains.animals.Cat;
import ru.geekbrains.animals.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dog's results: ");

        Dog dogRick = new Dog("Rick");
        dogRick.run(150);
        dogRick.swim(5);
        dogRick.run(1000);
        dogRick.swim(150);


        System.out.println("\n\nCat's results: ");
        Cat catMashka = new Cat("Mashka");
        catMashka.swim(5);
        catMashka.run(15);

        Cat catBarsik = new Cat("Barsik");
        catBarsik.run(20);
        catBarsik.run(500);
    }
}
