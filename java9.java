import java.util.*;

public class java9 {
    private String name;
    private int course;

    public java9(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<java9> students, int course) {
        Iterator<java9> iter = students.iterator();

        while (iter.hasNext()) {
            java9 student = iter.next();

            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<java9> students = new ArrayList<>();

        students.add(new java9("Rostik Daskaliuk", 1));
        students.add(new java9("Vasya Ktoto", 2));
        students.add(new java9("Gybka Bob", 3));
        students.add(new java9("Sqidvard Tentakls", 1));
        students.add(new java9("Gomer Simpson", 2));
        students.add(new java9("Arnold Shwarzniger", 3));
        students.add(new java9("EREN YEGER", 1));
        students.add(new java9("Mikasa Ackerman", 1));
        students.add(new java9("Erwin Smith", 3));
        students.add(new java9("Naruto Uzumaki", 1));

        int course = 1;
        System.out.println("Y4eniki " + course + ":");
        printStudents(students, course);
    }
}