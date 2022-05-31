package zxf.regex;

import java.util.function.Supplier;

public class TestRegex {
    public static void timing(String taskId, Supplier<Boolean> supplier) {
        Long start = System.currentTimeMillis();
        System.out.println("Start taskId: " + taskId);
        Boolean result = supplier.get();
        Long used = (System.currentTimeMillis() - start);
        System.out.println("End   taskId: " + taskId + ", result: " + result + ", time: " + used);
    }

    public static Boolean match(String testString, String pattern) {
        return testString.matches(pattern);
    }
}
