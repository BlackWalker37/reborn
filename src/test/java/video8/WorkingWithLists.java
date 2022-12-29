package video8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithLists() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastName("Valera Thetester");
        valera.setEmail("valerka@gmail.com");
        valera.setPhone("+37129885656");

        Student liga = new Student("Liga", "Ivanova", "liga@gmail.com", "+37129885131");
        Student dima = new Student("Dima", "Bars", "dima@gmail.com", "+37129885656");
        Student artis = new Student("Artis", "Greatest", null, "112");

        List<Student> students = new ArrayList<>();
        students.add(valera);
        students.add(liga);
        students.add(dima);
        students.add(artis);

        //-----------------------------------FOR--------------------------------------
        for (int i = 0;i < students.size(); i++) {
            System.out.println(students.get(i).getFirstName());
        }

        //---------------------------------FOREACH-------------------------------------
        for (Student s : students) {
//            System.out.println(s.getFirstName() + " " + s.getLastName());
            System.out.println(s.getFullName());
        }

        //---------------------------FOREACH with IF----------------------------------------
        System.out.println("Printing students with phone nr starting with +371");
        for (Student s : students) {
            if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFullName());
            }
        }
    }
}
