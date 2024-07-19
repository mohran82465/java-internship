import java.sql.*;
import java.util.Scanner;

public class Main {
    static String url = "jdbc:mysql://localhost:3306/gdsc";
    static String username = "root";
    static String password = "mohran";


    public static int addEmployee (String firstName , String lastName ,String sex , int age , String address,String phoneNumber, int vactionBalace ,String title ) throws SQLException {

        String query = "INSERT INTO Employee (first_name,last_name,sex,age,address,phone_number,vaction_balance,title ) values (?,?,?,?,?,?,?,?)";
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement stat =con.prepareStatement(query);
        stat.setString(1,firstName);
        stat.setString(2,lastName);
        stat.setString(3,sex);
        stat.setInt(4,age);
        stat.setString(5,address);
        stat.setString(6,phoneNumber);
        stat.setInt(7,vactionBalace);
        stat.setString(8,title);


        return stat.executeUpdate();
    }

    public static void AddFiveEmployees()
    {
        int cnt = 0 ;
        while(cnt<5)
        {
            Scanner scanner = new Scanner(System.in);
            Employee employee = new Employee();
            System.out.println("Enter the employee first Name");
            employee.setFirstName(scanner.next());
            System.out.println("Enter the employee last Name");
            employee.setLastName(scanner.next());
            System.out.println("Enter the employee sex");
            employee.setSex(scanner.next());
            System.out.println("Enter the employee age");
            employee.setAge(scanner.nextInt());
            System.out.println("Enter the employee address");
            employee.setAddress(scanner.next());
            System.out.println("Enter the employee phone number");
            employee.setPhoneNumber(scanner.next());
            System.out.println("Enter the employee number of vacation ");
            employee.setVactionBalace(scanner.nextInt());
            System.out.println("Enter the employee  title");
            employee.setTitle(scanner.next());
            System.out.println("the employee add successfully");
            System.out.println("*********************************");
            try {
                addEmployee(employee.getFirstName(),employee.getLastName(),employee.getSex(),employee.getAge(),employee.getAddress(),employee.getPhoneNumber(),employee.getVactionBalace(),employee.getTitle());
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            cnt++;
        }
    }
    public static void printEmployees() throws SQLException {
        String query = "SELECT * FROM Employee";
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement stat = con.prepareStatement(query);
        ResultSet rs = stat.executeQuery();
        Employee employee= null;
        while (rs.next()) {

                int empId = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String sex = rs.getString("sex");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                String phoneNumber = rs.getString("phone_number");
                int vacationBalance = rs.getInt("vaction_balance");
                String title = rs.getString("title");

                employee = new Employee(empId, firstName, lastName, sex, age, address, phoneNumber, vacationBalance, title);
                System.out.println(employee);
            }


    }

    public static void main(String[] args) throws SQLException {
//        AddFiveEmployees();

        printEmployees();
        System.out.println("=======================================================");
        modifyTheOlderEmployees();
        System.out.println("=======================================================");
        printEmployees();
    }

    public static void modifyTheOlderEmployees() throws SQLException {
        String query = "UPDATE Employee SET vaction_balance = 45 WHERE age > 45 AND (title = 'mr' OR title = 'mrs')";
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement stat = con.prepareStatement(query);
        stat.executeUpdate();
    }
}