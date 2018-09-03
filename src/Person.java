import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

    private String cpr;
    private String name;
    private static int counter;

    public Person() {
    }

    public Person(String cpr, String name) {
        this.cpr = cpr;
        this.name = name;
    }
    public Person(Person person){
        this.cpr = person.getCpr();
        this.name = person.getName();
    }

    public int getAge(){

        if(cpr != "") {
            //Convert cpr into a dateOfBirth
            String newCpr = cpr.substring(0, 6);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyy");
            LocalDate dateOfBirth = LocalDate.parse(newCpr, formatter);

            LocalDate currentDate = LocalDate.now();

            //Assume dateOfBirth is before currentDate and is not 100+ years ago
            if (dateOfBirth.getYear() > currentDate.getYear()) {
                dateOfBirth = dateOfBirth.plusYears(-100);
            }

            return Period.between(dateOfBirth, currentDate).getYears();

        }
        return 0;
    }

    public String toString(){
        return cpr + ", " + name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }
}
