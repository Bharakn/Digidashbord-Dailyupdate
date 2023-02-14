package supplierexample;

import java.util.function.Supplier;

public class SupplierExample1 {
    public static void main(String[] args) {
        Supplier<String> s=()->"Hello world";
        System.out.println(s.get());
    }
}
