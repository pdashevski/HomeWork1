import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    6. (Дополнительно) В переменную записываете количество программистов. В
    зависимости от количества программистов необходимо вывести правильно
    окончание. Например:
        2 программиста
        1 программист
        10 программистов
        и т.д.
 */

public class Task_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int count = Integer.parseInt(s);
        if (count == 1 || count == 21 || count == 31) {
            System.out.println(count + " программист");
        } else if (count > 1 && count <= 4 || count > 21 && count <= 24) {
            System.out.println(count + " программиста");
        } else if (count >= 5 && count <= 20 || count == 0 || count >= 25 && count <= 30) {
            System.out.println(count + " программистов");
        } else {
            System.out.println(count + " программиста");
        }
    }
}
