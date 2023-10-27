import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        String skip;
        ArrayList<Student> students = new ArrayList<Student>();
        int buff = 2000; // время задержки появления меню, в мили секундах
        Timer timer = new Timer();
        String c; // переменная которая отвечает за выбор
        while(true) {
            // делаем таймер, что бы сообщение выскакивали не сразу
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("");
                    System.out.println("1.Добавить студента");
                    System.out.println("2.Просмотреть список студентов");
                    System.out.println("3.Сохранить данные в файл");
                    System.out.println("4.Загрузить данные из файла");
                    System.out.println("5.Выход");
                    System.out.println("Выберите действие (1/2/3/4/5):");

                }
            }, buff);
            c = scanner.nextLine();

            switch (c) {
                //Добавление нового студента
                case ("1"):
                    System.out.println("Введите имя:");
                    String name = scanner.nextLine();
                    System.out.println("Введите фамилию:");
                    String sname = scanner.nextLine();
                    System.out.println("Введите возраст:");
                    int age = scanner.nextInt();
                    System.out.println("Введите срредняя оценка:");
                    int grade = scanner.nextInt();
                    skip = scanner.nextLine();
                    students.add(new Student(name, sname, age, grade));

                    break;
                case ("2"):
                    //вывод всех имеющихся студентов
                    System.out.println("Список нынешних студентов");
                    for (var i : students)
                    {
                        i.Display();
                    }
                    break;
                case ("3"):
                    //выгрузка имеющихся у нас студентов в файл
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", false));
                        for (var j : students) {
                            writer.write(j.getName() + "," + j.getSname() + "," + j.getAge() + "," + j.getGrade());
                            writer.newLine();
                        }
                        writer.close();
                    } catch (IOException e) {
                        System.err.println("Ошибка записи в файл: " + e.getMessage());
                    }
                    break;
                case ("4"):
                    //Запись студентов в файл
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader("people.txt"));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] parts = line.split(",");
                            if (parts.length == 4) {
                                String Name = parts[0];
                                String Sname = parts[1];
                                int Age = Integer.parseInt(parts[2]);
                                int Grade = Integer.parseInt(parts[3]);
                                students.add(new Student(Name, Sname, Age, Grade));

                            } else {
                                System.err.println("Ошибка чтения строки данных: " + line);
                            }

                        }
                        reader.close();
                    } catch (IOException e) {
                        System.err.println("Ошибка чтения файла: " + e.getMessage());
                    }
                    break;
                case ("5"):
                    //выход из программы
                    System.exit(0);
                default:
                    System.err.println("Не верно веденно значение, повторите попытку!");
                    break;
            }
        }
    }
}
