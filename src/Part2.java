
import java.util.Scanner;

/**
 *
 * @author Nguyen Hai Linh SE170530
 */
public class Part2 {

    public static void main(String[] args) {
        boolean check = true;
        do {
            try {
                String s;
                // khai bao chuoi de kiem tra dau nhap la SE va 3 chu so xxx 
                // su dung quy tat cua bieu thuc chinh quy bat dau la ^ va ket thuc la $
                String pattern = "^SE\\d{3}$"; // SE(.*)matches      // bieu thuc chinh quy.
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter s: ");
                s = sc.nextLine();
                  // Kiem tra xem co nhap dung hay khong. neu nhap dung thi cau lenh se duoc 
                  // bo qua.
                  // con neu nhap sai thi dua vao exception
                if (!s.matches(pattern)) {
                    throw new Exception();
                }
                  // sau khi nhap dung se in ra chuoi s
                System.out.println("The String is " + s);
                // gan check = false de ket thuc vong lap
                check = false;

            } catch (Exception e) {
                // neu nhap sai se in ra thong bao loi
                System.out.println("The String is invalid ");
                // gan check = true de tiep tuc vong lap
                check = true;
            }
        } while (check == true); // vong lap se ket thuc khi check = false
    }

}
