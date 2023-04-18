using System;

namespace ConsoleApp1
{
    public class Human
    {
        public Human(string fio, int age)
        {
            this.Fio = fio;
            this.Age = age;
        }
        public string Fio { get; set; }
        public int Age { get; set; }

        public virtual void Display()
        {
            Console.WriteLine($"Фио: {Fio} Возраст: {Age}");
        }
    }

        class Student : Human
        {
            public Student(string spec, int kurs, int group, string fio, int age) : base(fio, age)
            {
                this.Spec = spec;
                this.Kurs = kurs;
                this.Group = group;
            }
            public string Spec { get; set; }
            public int Kurs { get; set; }
            public int Group { get; set; }

            public override void Display()
            {
                Console.WriteLine($"специальность: {Spec} Курс: {Kurs} Группа: {Group} ");
            }
        }
    
    class Program
    {
        static void Main(string[] agrs)
        {
            Human a = new Human("Daniil", 18);
            Student b = new Student("ИСИП" , 3 ,520, "Daniil",18);
            a.Display();
            b.Display();

        }
    }
}
