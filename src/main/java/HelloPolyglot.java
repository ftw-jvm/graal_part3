import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class HelloPolyglot {

    public static void main(String[] args) {
        Context polyglotContext = Context.newBuilder().
                allowAllAccess(true).build();

        Value result = polyglotContext.eval("js",
                """
                        ({
                        id   : 2,
                        text : 'Sii Get Digital',
                        array  : ['Robert C. Martin','Bruce Eckel','Vlad Mihalcea', 'Jarosław Pałka'] 
                        })
                        """);
        assert result.hasMembers();

        int id = result.getMember("id").asInt();
        assert id == 2;

        String text = result.getMember("text").asString();
        assert text.equals("Sii Get Digital");

        Value array = result.getMember("array");
        assert array.hasArrayElements();
        assert array.getArraySize() == 4;
        assert array.getArrayElement(1).asString().equals("Robert C. Martin");

        System.out.println("Conference number: " + id);
        System.out.println("Conference name: " + text);
        System.out.println("Star speakers: " + array);
    }

}