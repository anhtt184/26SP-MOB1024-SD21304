# 26SP-MOB1024-SD21304
# Java kết nối với SQL Server Database
# Sử dụng JDBC

# Các tham số hệ thống liên quan tới SQL Server cần thiết lập lại:
## JDBC-demo > src > main > java > Repositories > JDBC.java
databaseName, acc, pwd

# Luồng chạy chương trình
## 1. Bắt đầu từ hàm "main" 
### JDBC-demo > src > main > java > Views > Menu.java
Từ hàm main sẽ gọi vào View - tương ứng với chức năng mà người dùng chọn qua giao diện console
Ví dụ trong trường hợp này là "StudentView"

## 2. Kế tiếp là StudentView
### JDBC-demo > src > main > java > Views > StudentView.java

## 3. Tiếp đến là StudentRepo
### JDBC-demo > src > main > java > Repositories > StudentRepo.java

## 4. Tiếp theo là SQL Server Database - thông qua JDBC để khởi tạo kết nối
### JDBC-demo > src > main > java > Repositories > JDBC.java

# Dữ liệu từ SQL Server ở dạng Bảng (Table)
## Thông qua JDBC sẽ được hiểu là dạng mảng 2 chiều
# Dữ liệu dùng để xử lý bằng Java là Object (Student)
## JDBC-demo > src > main > java > Entities > Student.java
