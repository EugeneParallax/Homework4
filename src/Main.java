public class Main {
    public static void main(String[] args) {

        System.out.println("=== Task 1 ===");
            byte age = 19;                  //Expected input value

            System.out.print("Если возраст человека равен "+ age +", то ");

            if (age >= 18) {
                System.out.println("он совершеннолетний");

            } else {
                System.out.println("он не достиг совершеннолетия, нужно немного подождать");
            }

        System.out.println("=== Task 2 ===");
            float airTemp = 5.0f;           //Expected input value

            if (airTemp < 5.0f) {
                System.out.println("На улице "+ airTemp +" градусов, нужно надеть шапку");
            } else {
                System.out.println("На улице "+ airTemp +" градусов, можно идти без шапки");
            }

        System.out.println("=== Task 3 ===");
            float currentSpeed = 49.4f;     //Expected input value
            float speedLimit = 60.0f;

            System.out.print("Если скорость "+ currentSpeed +" км/ч, то ");

            if (currentSpeed > speedLimit) {
                System.out.println("придется заплатить штраф");

            } else {
                System.out.println("можно ездить спокойно");
        }

        System.out.println("=== Task 4 ===");
            byte inputAge = 7;

            System.out.print("Если возраст человека равен " + inputAge + " лет, то ему нужно ");

            if          (inputAge >= 2 && inputAge < 7) {
                System.out.println("ходить в детский сад");

            } else if   (inputAge >= 7 && inputAge < 17) {
                System.out.println("ходить в школу");

            } else if   (inputAge >= 17 && inputAge < 24) {
                System.out.println("учиться в университете");

            } else if   (inputAge >= 24) {
                System.out.println("ходить на работу");
            }

        System.out.println("=== Task 5 ===");
            byte visitorAge = 12;

            System.out.print("Если возраст ребенка равен " + visitorAge + " лет, то ему ");

            if          (visitorAge < 5) {
                System.out.println("нельзя кататься на аттракционе");

            } else if   (visitorAge >= 5 && visitorAge < 14) {
                System.out.println("можно кататься на аттракционе в сопровождении взрослого");

            } else if   (visitorAge >= 14) {
                System.out.println("можно кататься на аттракционе без сопровождения взрослого");
            }

        System.out.println("=== Task 6 ===");
            short capacityTotal = 102;
            short capacitySeated = 60;
            short capacityStanding = (short) (capacityTotal - capacitySeated);
            short occupancyCurrent = 46;     // Expected input value

            if          (occupancyCurrent < capacitySeated) {
                System.out.println("В вагоне имеется " + (capacitySeated - occupancyCurrent) + " сидячих и " + capacityStanding + " стоячих местa");

            } else if   (occupancyCurrent >= capacitySeated && occupancyCurrent < capacityTotal) {
                System.out.println("В вагоне имеется только" + (capacityTotal - occupancyCurrent) + " стоячих местa");

            } else {
                System.out.println("В вагоне не осталось свободных мест");
            }


        System.out.println("=== Task 7 ===");
            int one = 4;                    // Expected input value
            int two = 7;                    // Expected input value
            int three = 5;                  // Expected input value

            if          (one > two && one > three) {
                System.out.println("Первое число является наибольшим из трех");

            } else if   (two > one && two > three) {
                System.out.println("Второе число является наибольшим из трех");

            } else {
                System.out.println("Третье число является наибольшим из трех");
            }
    }
}