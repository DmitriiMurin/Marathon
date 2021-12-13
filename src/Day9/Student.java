package Day9;

public class Student extends Human{
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This student named " + name);
    }
    //    String groupName;
//    public String getGroupName() {
//        return groupName;
//    }
//
//    public Student(String name, String groupName) {
//        super(name);
//        this.groupName = groupName;
//    }
//
//    public void printInfo(){
//        System.out.println("This human named " + name);
//        System.out.println("This student named " + name);
//    }
}
