import java.util.ArrayList;

public class RunThis {

    public static void main(String[] args){
        //Calc age
        Person person = new Person("1206915555", "jim");
        System.out.println("Age = " + person.getAge());

        ArrayList<String> courses = new ArrayList<String>();
        courses.add("CS101");
        courses.add("CS102");
        courses.add("TECH02");
        Teacher teacher = new Teacher(new Person("1206915555", "John"), "TeacherTitle", courses);
        //System.out.println(teacher.toString());
        ArrayList<String> courses2 = new ArrayList<String>();
        courses.add("SWD101");
        courses.add("SWD102");
        courses.add("C#117");
        Teacher teacher2 = new Teacher(new Person("2202675555", "Goro"), "TeacherTitle", courses);


        Student student = new Student(new Person("0712812345", "Benny"), 5, 4.0);
        Student student2 = new Student(new Person("2111952345", "Brian"), 5, 2.0);
        Student student3 = new Student(new Person("0212012345", "Kent"), 11, 3.5);

        //System.out.println(student.toString());


        /*ArrayList<Person> persons = new ArrayList<>();
        persons.add(teacher);
        persons.add(student);
        for(Person p : persons){
            System.out.println(p.toString());
        }*/

        Person[] persons2 = new Person[5];
        persons2[0] = teacher;
        persons2[1] = student;
        persons2[2] = student2;
        persons2[3] = student3;
        persons2[4] = teacher2;

        for(int i = 0; i < persons2.length; i++){
            System.out.println(persons2[i].toString());
        }

        if(student.compareStudent(student2)){
            System.out.println("Two students have the same student number");
        }
    }
}
