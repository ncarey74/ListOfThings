import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorld {

    public static void main(String args[]) throws IOException {
        System.out.println("Hello, World");

        ObjectMapper mapper = new ObjectMapper();
        MyValue m = new MyValue();
        m.name = "Alice";
        m.age = 26;
        mapper.writeValue(new File("C:\\Users\\Carey\\Desktop\\data.json"), m);

        List<String> names = new ArrayList<String>();
        names.add("Bob");
        names.add("Cindy");
        mapper.writeValue(new File("C:\\Users\\Carey\\Desktop\\data1.json"), names);

        Map<String, Integer> info = new HashMap<String, Integer>();
        info.put("Sally", 30);
        info.put("John", 31);
        mapper.writeValue(new File("C:\\Users\\Carey\\Desktop\\data2.json"), info);
    }
}
