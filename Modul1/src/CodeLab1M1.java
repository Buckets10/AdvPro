import java.util.ArrayList;
import java.util.List;

public class CodeLab1M1 {
    public static void main(String[] args) {
        String[] names = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};
        List<String> longestNames = findLongestNames(names);
        System.out.println("The longest names are: " + String.join(",", longestNames));
    }

    public static List<String> findLongestNames(String[] array) {
        int maxLen = 0;
        for (String name : array) {
            if (name.length() > maxLen) {
                maxLen = name.length();
            }
        }

        List<String> result = new ArrayList<>();
        for (String name : array) {
            if (name.length() == maxLen) {
                result.add(name);
            }
        }
        return result;
    }
}