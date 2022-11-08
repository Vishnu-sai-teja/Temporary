public class Admin_Edit extends dataAdmin{
    String LibName;
    String newLibName;
    String newDepartment;

    public Admin_Edit(String libName, String newLibName, String newDepartment) {
        this.LibName = libName;
        this.newLibName = newLibName;
        this.newDepartment = newDepartment;
    }

    public String getLibName() {
        return LibName;
    }

    public void setLibName(String libName) {
        LibName = libName;
    }

    public String getNewLibName() {
        return newLibName;
    }

    public void setNewLibName(String newLibName) {
        this.newLibName = newLibName;
    }

    public String getNewDepartment() {
        return newDepartment;
    }

    public void setNewDepartment(String newDepartment) {
        this.newDepartment = newDepartment;
    }
}
