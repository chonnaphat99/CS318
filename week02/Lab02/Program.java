public class Program
{
    public static void main(String [] args) {
        String orginal = "x dE faEdf CS318@bu.ac.th";
        String id = "1660712345";
        String[] words = orginal.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String word : words) {
            sb.append("\n\t");
            sb.append(word);
            sb.append("\n\t");
        }
        
        //System.out.println(sb.toString());
        
        String year = id.substring(1, 3);
        String school = id.substring(3, 5);
        String name = "";
        System.out.println("Year " + year);
        System.out.println("School " + school);
        if (school.equals("07")) {
            name = "Science";
        }
        
        System.out.println("x " + name);
    }
}
