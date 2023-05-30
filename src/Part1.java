
import java.util.Scanner;

/**
 *
 * @author Nguyen Hai Linh SE170530
 */
public class Part1 {

    public static void main(String[] args) {
        // khai bai check de kiem tra xem co the ket thuc vong lap duoc hay khong
        boolean check = true;
        // vong lap do while
        do {
            // su dung try catch
            try {
                int num; // khai bao bien va nhap
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number: ");
                num = sc.nextInt();
                // dieu kien neu nhap be hon 1 thi dua no vao exception bang throw new excep...
                if (num < 1) {
                    throw new Exception();
                }
                // neu nhap lon hon hoac bang 1 thi in ra num
                System.out.println("The number is : " + num);
                // va check khi nay se la false de ket thuc vong lap
                check = false;
            } catch (Exception e) {
                // thong bao exception neu co
                System.out.println("The number is invalid ");
                // check gan true de tiep tuc lenh nhap num
                check = true;
            }
        } while (check == true); // vong lap se dung neu check la fasle
    }
}
