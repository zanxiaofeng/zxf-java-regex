package zxf.regex;

public class TestRegexMode {
    private static String testString = "abcbccbcccbccccbcccccbbcbbccbbcccbbccccbbcccccbbbcbbbccbbbcccd";
    private static String greedyPattern = "a(b*c+)*(bbbccc)d";
    private static String reluctantPattern = "a(b*c+)*?(bbbccc)d";
    private static String possessivePattern = "a(b*c+)*+(bbbccc)d";

    public static void main(String[] args) {
        TestRegex.timing("greedy",()-> TestRegex.match(testString, greedyPattern));
        TestRegex.timing("reluctant",()-> TestRegex.match(testString, reluctantPattern));
        TestRegex.timing("possessive",()-> TestRegex.match(testString, possessivePattern));
    }
}
