package zipper;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Zipper<Integer> numberZipper = new Zipper<>(
            List.of(1, 3, 5, 7),
            List.of(2, 4, 6, 8)
        );
        System.out.println(numberZipper.zip());

        Zipper<String> colorZipper = new Zipper<>(
            List.of("Red", "Green", "Blue"),
            List.of("White", "Black", "Orange", "Pink", "Fuschia")
        );
        System.out.println(colorZipper.zip());
    }
}
