package consumerexample;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> con=str->System.out.println(str);
        con.accept("Bharath");
    }
}
