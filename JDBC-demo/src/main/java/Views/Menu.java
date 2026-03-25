package Views;

import java.util.Scanner;

public class Menu {

    // Menu chua ham Main (Main function)
    // Noi khoi dong chuong trinh phan mem (program)

    public static void main(String[] args) {
        // Chuc nang nguoi dung chon tren Menu
        int selectedMenu = 0;
        // Tiep tuc thuc hien chuc nang hien tai
        int isContinue;
        // Quet du lieu nguoi dung nhap vao
        Scanner scn = new Scanner(System.in);
        // do-while = vong lap Menu
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Sắp xếp theo mã sinh viên Tăng dần");
            System.out.println("7. Sắp xếp theo mã sinh viên Giảm dần");

            System.out.println("0. Thoát");
            System.out.print("Hãy chọn chức năng [0-5]: ");
            // nguoi dung chon
            selectedMenu = scn.nextInt();
            // dung chuong trinh khi nguoi dung chon 0
            if (selectedMenu == 0) {
                break;
            }
            isContinue = 1;
            // while = vong lap tiep tuc chuc nang hien tai
            while (isContinue == 1) {
                switch (selectedMenu) {
                    case 1 -> StudentView.showAllStudentList();
                    case 2 -> StudentView.insert();
                    case 3 -> StudentView.update();
                    case 4 -> StudentView.delete();
                    case 5 -> StudentView.searchByCode();
                    case 6 -> StudentView.showAllStudentSortByCode(false);
                    case 7 -> StudentView.showAllStudentSortByCode(true);
                }
                System.out.println();
                System.out.println("Tiếp tục chức năng " + selectedMenu + "? [1: Có | Khác: Không]: ");
                // nguoi dung chon
                isContinue = scn.nextInt();
            }

        } while (true);

    }
}
