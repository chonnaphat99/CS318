
/**
 * Write a description of class HW02 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HW02
{
    public static void main(String [] args) {
        String x = "cS318 i lOvE jaVa";
        String[] words = x.split(" ");
        String result = "";
        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first letter of the word and add the rest of the word
                result += word.substring(0,1).toUpperCase();
                result += word.substring(1).toLowerCase();
                result += " ";
            }
        }
        
        System.out.println(result.trim());
    }
}
