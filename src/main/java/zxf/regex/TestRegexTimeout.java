package zxf.regex;

public class TestRegexTimeout {
    private static String failedString = "abcbccbcccbccccbcccccbccccccbcccccccbccccccccbbcbbccbbcccbbccccbbcccccbbccccccbbcccccccbbccccccccbbbcbbbccbbbcccbbbccccbbbcccccbbbccccccbbbcccccccbbbcccccccc";
    private static String successString = failedString + "d";
    private static String normalPattern = "a(b*c+)*+d";
    private static String timeoutPattern = "a(b*c+)*d";

    public static void main(String[] args) {
        TestRegex.timing("success-normal",()-> TestRegex.match(successString, normalPattern));
        TestRegex.timing("success-timeout",()-> TestRegex.match(successString, timeoutPattern));

        TestRegex.timing("failed-normal",()-> TestRegex.match(failedString, normalPattern));
        //Will timeout on Java8
        TestRegex.timing("failed-timeout",()-> TestRegex.match(failedString, timeoutPattern));
    }
}
