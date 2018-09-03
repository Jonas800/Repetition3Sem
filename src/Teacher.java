import java.util.ArrayList;

public class Teacher extends Person{

    private String title;
    private ArrayList<String> courses;

    public Teacher(){};
    public Teacher(Person person, String title, ArrayList<String> courses){
        super(person);
        this.title = title;
        this.courses = courses;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString(){
        String s = super.toString() + ", " + title + ", <";
        for(String course : courses){
            s += course + ", ";
        }
        s = s.substring(0,s.length()-2);
        s += ">";
        return s;
    }
}
