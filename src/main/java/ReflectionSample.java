import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReflectionSample {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        try {
            Class<?> myClass = Class.forName("StdCourse");
            Object stdCourse = myClass.newInstance();
            Method getCourses = myClass.getMethod("getCoursesOfStudent", String.class);
            System.out.println("Enter the student name: ");
            String stdName = reader.next();
            getCourses.invoke(stdCourse, stdName);
            Method getAll = myClass.getMethod("getAll");
            getAll.invoke(stdCourse);
        }  catch (InstantiationException | InvocationTargetException
                | NoSuchMethodException | IllegalAccessException
                | ClassNotFoundException ex) {
            System.out.println("Oops! " + ex);
        } finally {
            reader.close();
        }
    }
}
