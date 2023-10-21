import java.util.Scanner;

@FunctionalInterface
interface Check<T> {
    boolean compare(T x, T y);
}

public class Main {
    public static <T> int countIf(T[] arr, T key, Check<T> c) {
        int count = 0;
        for (T element : arr) {
            if (c.compare(element, key)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Double[] arr = { 1.5, 2.5, 3.5, 1.5, 4.5, 5.5, 1.5, 6.5, 7.5 };
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the key to search for: ");
        Double key = scanner.nextDouble();

        int cnt = countIf(arr, key, (x, y) -> x.equals(y));
        System.out.println("Count = " + cnt);
    }
}

