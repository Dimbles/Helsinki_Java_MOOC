
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        System.out.println("===ALL==EMPLOYEES===");
        university.print();
        
        System.out.println("====PHD=====");
        university.print(Education.PHD);
        
        System.out.println("====HS====");
        university.print(Education.HS);

        System.out.println("==FIRED==HS=====");
        university.fire(Education.HS);
        university.print();
    }
}
