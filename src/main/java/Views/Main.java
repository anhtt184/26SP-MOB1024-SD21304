package Views;

import java.sql.SQLException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws SQLException {
        int selectedMenu = 0;
        int isContinue;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Hien thi DS Sinh Vien");
            System.out.println("2. Them Sinh Vien moi");
            System.out.println("3. Sua TT Sinh Vien");
            System.out.println("4. Xoa TT Sinh Vien");
            System.out.println("5. Tim kiem Sinh Vien");
            System.out.println("0. Thoat");

            System.out.print("Hay chon chuc nang [1-5]: ");
            selectedMenu = scn.nextInt();
            System.out.println();
            isContinue = 1;

            if (selectedMenu == 0) {
                break; // dung vong lap: do-while
//                return; // dung ham main();
            }

            while (isContinue == 1) {
                switch (selectedMenu) {
                    case 1 -> StudentView.showList();
                    case 2 -> StudentView.showList();
                    case 3 -> StudentView.showList();
                    case 4 -> StudentView.showList();
                    case 5 -> StudentView.showList();
                }
                System.out.print("Tiep tuc CN " + selectedMenu + " [1: Co | Khac: Khong]: ");
                isContinue = scn.nextInt();
            }
        }
        while (selectedMenu != 0);
    }
}
