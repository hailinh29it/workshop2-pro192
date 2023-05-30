
import java.util.Scanner;


/**
 *
 * @author Nguyen Hai Linh SE170530
 */
public class Part2_2 {

    public static void main(String[] args) {
        Part2_2 p2 = new Part2_2();
        boolean check = true;
        do {
            try {
                // gan gia tri vao chuoi s
                String s = p2.inputString();
                System.out.println("the string is : " + s);
                check = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                check = true;
            }
        } while (check);

    }
// tao ham input  ham voi kieu tra ve la string
    public String inputString() throws Exception {
        String s = "";
        String pattern = "^SE\\d{3}$"; // su dung bieu thuc chinh quy
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String s: ");
        s = sc.nextLine();
            // neu sai se dua vao exception
        if ( ! s.matches(pattern)) {
            throw new Exception();
        }
        // nhap dung tra ve chuoi s
        return s;
    }
}
