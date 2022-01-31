package lesczynski_pawel;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Pawel", LocalDate.of(1998,01,10),3.0);
        Student student2 = new Student("Jan", LocalDate.of(1998,01,10),4.0);
        Student student3 = new Student("Paulina", LocalDate.of(1997,02,10),5.0);
        Student student4 = new Student("Anna", LocalDate.of(2000,04,13),5.0);
        Student student5 = new Student("Piotr", LocalDate.of(1998,01,10),4.5);
        Student student6 = new Student("Piotr", LocalDate.of(2006,05,12),3.0);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        students.sort(Student::compareTo);
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i).getNazwa());
        }
        System.out.println(KwotaStypendium());
    }

    public static double KwotaStypendium(){
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Pawel", LocalDate.of(1998,01,10),3.0);
        Student student2 = new Student("Jan", LocalDate.of(1998,01,10),4.0);
        Student student3 = new Student("Paulina", LocalDate.of(1997,02,10),5.0);
        Student student4 = new Student("Anna", LocalDate.of(2000,04,13),5.0);
        Student student5 = new Student("Piotr", LocalDate.of(1998,01,10),4.5);
        Student student6 = new Student("Piotr", LocalDate.of(2006,05,12),3.0);
        int yearOfBirth=0;
        double ocena=0;
        for (int i=0;i<students.size();i++){
            yearOfBirth=students.get(i).getDataUrodzin().getYear();
            if (yearOfBirth>2005){
                ocena=students.get(i).getOcena();
                if (ocena==5){
                    return Stypendium.kwotaStypendium;
                }

            }
        }
        return 0;
    }
}
