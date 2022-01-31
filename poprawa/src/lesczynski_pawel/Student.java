package lesczynski_pawel;

import java.time.LocalDate;

public class Student implements Cloneable,Comparable<Student> {
    private String nazwa;
    private LocalDate dataUrodzin;
    private Double ocena;

    public Student(String nazwa, LocalDate dataUrodzin, Double ocena){
        this.nazwa=nazwa;
        this.dataUrodzin=dataUrodzin;
        this.ocena=ocena;
    }

    public String getNazwa() {
        return nazwa;
    }



    public LocalDate getDataUrodzin() {
        return dataUrodzin;
    }

    public Double getOcena() {
        return ocena;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nazwa='" + nazwa + '\'' +
                ", dataUrodzin=" + dataUrodzin +
                ", ocena=" + ocena +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = 0;
        if (this.dataUrodzin.isBefore(o.dataUrodzin)){
            result+=1000;
        }else if (o.dataUrodzin.isBefore(this.dataUrodzin)){
            result-=1000;
        }
        int var1=this.nazwa.compareTo(o.nazwa);
        if(var1>0){
            result+=100;
        }else if (var1<0){
            result-=100;
        }
        if(this.ocena>o.ocena){
            result+=10;
        }else if(o.ocena>this.ocena){
            result-=10;
        }
        return result;
    }
}
