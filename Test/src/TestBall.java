public class TestBall
{

        public static void main(String[] args)
        {
            // Создаем несколько объектов мяча
            Ball ball1 = new Ball("красный", 12.0);
            Ball ball2 = new Ball("синий", 10.5);

            // Выводим информацию о мячах
            System.out.println(ball1);
            System.out.println(ball2);

            // Обновляем данные о мяче
            ball1.setDiameter(13.5);
            ball2.setColor("зеленый");

            // Выводим обновленную информацию о мячах
            System.out.println(ball1);
            System.out.println(ball2);
        }
}
