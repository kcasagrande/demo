import org.jetbrains.annotations.NotNull;

public class App {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        System.out.println(toRoman(input));
    }

    public static String toRoman(int input) {
        return String.format((input > 1)?"II":"I");
    }
}
