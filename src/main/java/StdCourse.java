import java.util.*;

public class StdCourse {

    private static final Map<String, List<String>> STUDENT_COURSE;

    static {
        final Map<String, List<String>> stdCourse = new HashMap<>();
        stdCourse.put("student1", Arrays.asList("course1","course2","course3"));
        stdCourse.put("student2",  Arrays.asList("course2","course3","course4"));
        stdCourse.put("student3",  Arrays.asList("course1","course4"));
        stdCourse.put("student4",  Arrays.asList("course2","course3"));
        STUDENT_COURSE = Collections.unmodifiableMap(stdCourse);
    }

    public void getAll(){
        System.out.println("----------------------");
        for (String student : STUDENT_COURSE.keySet()){
            System.out.println("*" + student + ":");
            for (String course : STUDENT_COURSE.get(student)){
                System.out.println("-" + course);
            }
            System.out.println("----------------------");
        }
    }

    public void getCoursesOfStudent(String stdName) {
        List<String> courses = STUDENT_COURSE.get(stdName);
        System.out.println("the list of " + stdName + " courses is:");
        for (String course : courses){
            System.out.println(course);
        }
    }

}
