public class Admin_Add extends dataAdmin{
    String Name;
    String department;

    public Admin_Add(String name, String department) {
        this.Name = name;
        this.department = department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
