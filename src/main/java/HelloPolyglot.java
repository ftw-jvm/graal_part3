import org.graalvm.polyglot.*;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class HelloPolyglot {

    public static void main(String[] args) {
        Context polyglotContext = Context.newBuilder().
                allowAllAccess(true).build();

        Value result = polyglotContext.eval("js",
                "({ "                   +
                        "id   : 42, "       +
                        "text : '42', "     +
                        "arr  : [1,42,3] "  +
                        "})");
        assert result.hasMembers();

        int id = result.getMember("id").asInt();
        assert id == 42;

        String text = result.getMember("text").asString();
        assert text.equals("42");

        Value array = result.getMember("arr");
        assert array.hasArrayElements();
        assert array.getArraySize() == 3;
        assert array.getArrayElement(1).asInt() == 42;

//        Value array = polyglotContext.eval("js", "[1,2,42,4]");
//        int result = array.getArrayElement(2).asInt();
//        System.out.println(result);
        System.out.println("JS array: " + array);
    }

}