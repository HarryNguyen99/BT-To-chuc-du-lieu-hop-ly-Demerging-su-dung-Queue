import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Queue male = new Queue();
        Queue female = new Queue();

        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Hiếu","Nam", new int[]{1,1,1991}));
        employee.add(new Employee("Hoa","Nữ",new int[]{2,2,1992}));
        employee.add(new Employee("Dũng","Nam",new int[]{3,3,1993}));
        employee.add(new Employee("Phượng","Nữ",new int[]{4,4,1994}));
        employee.add(new Employee("Hùng","Nam",new int[]{5,5,1995}));
        employee.add(new Employee("Mai","Nữ",new int[]{6,6,1996}));

        for (Employee value : employee) {
            if (value.getGender().equals("Nam")) {
                male.enQueue(value);
            } else {
                female.enQueue(value);
            }
        }

        System.out.println("Nam: ");
        while (male.getTail() != null){
            System.out.print(male.deQueue());
        }

        System.out.println("Nữ: ");
        while (female.getTail() != null){
            System.out.print(female.deQueue());
        }
    }
}
