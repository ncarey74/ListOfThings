import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class HelloWorld {

    public static void main(String args[]) throws IOException {
        System.out.println("Hello, World");

        ObjectMapper mapper = new ObjectMapper();
        MyValue m = new MyValue();
        m.name = "Alice";
        m.age = 26;

        mapper.writeValue(new File("C:\\Users\\Carey\\Desktop\\data.json"), m);
    }
}
