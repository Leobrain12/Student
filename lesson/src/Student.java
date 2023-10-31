import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class Student
{
    //объявляем переменные
    private String name,sname;
    private int age,grade;

    //Делаем конструктор
    public Student(String Name, String Sname, int Age, int Grade)
    {
        this.name = Name;
        this.sname = Sname;
        this.age = Age;
        this.grade = Grade;
    }

    //Делаем геттеры
    public String getName() {
        return name;
    }

    public String getSname() {
        return sname;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }
    //Делаем метод для вывода студента на экран
    public void Display()
    {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + sname);
        System.out.println("Возраст: " + age);
        System.out.println("Средний балл: " + grade);
        System.out.println("---------------");
    }
}
