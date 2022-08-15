import org.graalvm.polyglot.*;

public class HelloPolyglot {

    public static void main(String[] args) {
        Context polyglot = Context.newBuilder().
                allowAllAccess(true).build();
        Value array = polyglot.eval("ruby", "[1,2,42,4]");
        int result = array.getArrayElement(2).asInt();
        System.out.println(result);
    }

}