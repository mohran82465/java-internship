public class Employee {
    private int id ;
    private String firstName;
    private String lastName;
    private String sex ;
    private int age ;
    private String address;
    private int vactionBalace ;
    private String phoneNumber;
    private String title;


    public Employee() {
    }

    public Employee(String firstName, String lastName, String sex, int age, String address,String phoneNumber, int vactionBalace, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.phoneNumber= phoneNumber;
        this.vactionBalace = vactionBalace;
        this.title = title;
    }

    public Employee(int id, String firstName, String lastName, String sex, int age, String address,String phoneNumber, int vactionBalace, String title) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.phoneNumber= phoneNumber;
        this.vactionBalace = vactionBalace;
        this.title = title;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getVactionBalace() {
        return vactionBalace;
    }

    public void setVactionBalace(int vactionBalace) {
        this.vactionBalace = vactionBalace;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", vactionBalace=" + vactionBalace +
                ", title='" + title + '\'' +
                '}';
    }
}
