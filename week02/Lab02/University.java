import javax.swing.*;

public class University
{
    public static void main(String[] args) {
        
        String studentID;
        studentID = JOptionPane.showInputDialog(null, "Student ID");
        
        
        // your code
        String set1 = studentID.substring(1, 3);
        String set2 = studentID.substring(3, 5);
        String set3 = studentID.substring(5);
        String set4 = studentID.substring(1, 3);
        String set5 = studentID.substring(3, 5);
        
        

        
        // output
        System.out.println("Student Id: " + studentID);
        System.out.println("Substring starting from index 1 to 2 : " + set1);
        System.out.println("Substring starting from index 3 to 4 : " + set2);
        System.out.println("Substring starting from index 5 : " + set3);
        System.out.println("Entrance Year : 25" + set4);
        
        if(set5.equals("01")) {
            System.out.println("01: Accounting / บัญชี");
        }
        else if(set5.equals("02")) {
            System.out.println("02: Business Administration / บริหารธุรกิจ");
        }
        else if(set5.equals("03")) {
            System.out.println("03: Communication Arts / นิเทศศาสตร์");
        }
        else if(set5.equals("04")) {
            System.out.println("04: Law / นิติศาสตร์");
        }
        else if(set5.equals("05")) {
            System.out.println("05: Humanuties & Tourism Management / มนุษศาสตร์และการจัดการการท่องเที่ยว");
        }
        else if(set5.equals("06")) {
            System.out.println("06: Economics & Investment / เศรษฐศาสตร์และการลงทุน");
        }
        else if(set5.equals("07")) {
            System.out.println("07: Information Technology & Innovation / เทคโนโลยีสารสนเทศและนวัตกรรม");
        }
        else if(set5.equals("08")) {
            System.out.println("08: Fine & Applied Arts / ศิลปกรรมศาสตร์");
        }
        else if(set5.equals("09")) {
            System.out.println("09: Engineering / วิศวกรรมศาสตร์");
        }
        else if(set5.equals("10")) {
            System.out.println("10: BU International College / วิทยาลัยนานาชาติ");
        }
        else if(set5.equals("11")) {
            System.out.println("11: Architecture / สถาปัตยกรรมศาสตร์");
        }
        else if(set5.equals("12")) {
            System.out.println("12: Entrepreneurship & Management / การสร้างเจ้าของธุรกิจและการบริหารจัดการ");
        }
        else if(set5.equals("13")) {
            System.out.println("13: Digital Media & Cinematic Arts / ดิจิทัลมีเดียและศิลปะภาพยนตร์");
        }
        else if(set5.equals("14")) {
            System.out.println("14: BU Chinese International / วิทยาลัยนานาชาติจีน");
        }
    }
}
