import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 17;
        if (age>=18) {
            System.out.println("Человеку уже есть 18 лет");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        // Задача 2
        int temperature = 7;
        if (temperature<5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        // Задача 3
        int speed = 65;
        boolean overSpeed = speed >60;
        if (overSpeed) {
            System.out.println("Если скорость " + speed + ",то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }

        // Задача 4
        int humanAge = 15;
        boolean preschoolAge = humanAge>=2 && humanAge <=6;
        boolean schoolAge = humanAge>=7 && humanAge <=17;
        boolean studentAge = humanAge>=18 && humanAge <=24;
        boolean jobAge = humanAge>24;
        if (preschoolAge) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в садик.");
        }
        if (schoolAge) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу.");
        }
        if (studentAge) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в университет.");
        }
        if (jobAge) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить на работу.");
        }

        // Задача 5
        int childAge = 10;
        boolean cannotRide = childAge<5;
        boolean canRideWithAdult = childAge>=5 && childAge<14;
        boolean canRide = childAge>=14;
        if (cannotRide) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        }
        if (canRideWithAdult) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (canRide) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        // Задача 6
        int wagonCapacity = 102;
        int seats = 60;
        int peopleNumber = 70;
        if (peopleNumber < wagonCapacity) {
            if   (peopleNumber < seats){
                System.out.println("В вагоне осталось "+ (wagonCapacity -peopleNumber) + " мест, сидячих мест осталось "+  (seats-peopleNumber));
            }
            else  {
                System.out.println("В вагоне осталось "+ (wagonCapacity -peopleNumber) + " мест, сидячих мест нет.");
            }
        }
        else  {
            System.out.println("Мест в вагоне не осталось.");
        }

        // Задача 7
        int one = 100;
        int two = 6500;
        int three = 10100;
        if (one>two) {
            if (one>three){
                System.out.println("One - большее число");
            }
            else {
                System.out.println("Three - большее число");
            }
        }
        else {
            if (two > three) {
                System.out.println("Two - большее число");
            }
            else System.out.println("Three - большее число");
        }
    }
}