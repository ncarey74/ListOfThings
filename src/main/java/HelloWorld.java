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

        List<ManyThings> allTheThings = new ArrayList<ManyThings>();
        ManyThings manyThings = new ManyThings();
        manyThings.alpha = "String";
        manyThings.beta = 10;
        allTheThings.add(manyThings);
        ManyThings someMoreThings = new ManyThings();
        someMoreThings.alpha = "Words";
        someMoreThings.beta = false;
        allTheThings.add(someMoreThings);
        mapper.writeValue(new File("C:\\Users\\Carey\\Desktop\\data3.json"), allTheThings);

        makeBiggerThing();
        makeEvenBiggerThing();
        makeColossalThing();
        makeGoodThing();
        makeBestThing();
    }

    private static void makeBiggerThing() throws IOException {
        BiggerThing thing = new BiggerThing();

        thing.alpha = "jumping rope";
        thing.beta = "soccer ball";
        thing.gamma = "football";
        thing.delta = "baseball";

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("C:\\Users\\Carey\\Desktop\\data4.json"), thing);
    }

    private static void makeEvenBiggerThing() throws IOException {
        BiggerThing thing = new BiggerThing();

        thing.alpha = "awesomeness.exe";

        List<String> arguments = new ArrayList<String>();
        arguments.add("-j");
        arguments.add("-r");
        thing.beta = arguments;

        thing.gamma = "team";
        thing.delta = 10;

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("C:\\Users\\Carey\\Desktop\\data5.json"), thing);
    }

    private static void makeColossalThing() throws IOException {
        List<BiggerThing> colossalThing = new ArrayList<BiggerThing>();
        colossalThing.add(giveMeTheThing(true, 1, 12, "hello!"));
        colossalThing.add(giveMeTheThing(true, 2, 22, "world!"));
        colossalThing.add(giveMeTheThing(false, 22, 567, "goodbye!"));

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("C:\\Users\\Carey\\Desktop\\data6.json"), colossalThing);
    }

    private static BiggerThing giveMeTheThing(Object alpha, Object bravo, Object gamma, Object delta) {
        BiggerThing thing = new BiggerThing();

        thing.alpha = alpha;
        thing.beta = bravo;
        thing.gamma = gamma;
        thing.delta = delta;

        return thing;
    }
    
    private static void makeGoodThing() throws IOException {
        List<BiggerThing> goodThing = new ArrayList<BiggerThing>();
        List<String> tinyThings = new ArrayList<String>();
        tinyThings.add("--recursive");
        tinyThings.add("--update");
        tinyThings.add("--216.3.128.12");
        goodThing.add(giveMeTheThing("Alice", 26, tinyThings, "12"));

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("C:\\Users\\Carey\\Desktop\\data7.json"), goodThing);
    }

    private static void makeBestThing() throws IOException {
        List<BiggerThing> bestThing = new ArrayList<BiggerThing>();
        List<String> tinyThings = new ArrayList<String>();
        tinyThings.add("--recursive");
        tinyThings.add("--update");
        tinyThings.add("--216.3.128.12");
        bestThing.add(giveMeTheThing("Alice", 26, tinyThings, "12"));

        List<String> someMore = new ArrayList<String>();
        someMore.add("--recursive");
        someMore.add("--help");
        someMore.add("--216.3.128.12");
        bestThing.add(giveMeTheThing("Bob", 25, someMore, "13"));

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("C:\\Users\\Carey\\Desktop\\data8.json"), bestThing);
    }
}
