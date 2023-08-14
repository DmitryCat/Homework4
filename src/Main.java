public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 10;
        if (age >= 18) {
            System.out.println("Ты достиг совершеннолетия");
        } else {
            System.out.println("Ты не достиг совершеннолетия, нужно подождать");
        }
// Задание 2
        int c = 5;
        if (c < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        // Задание 3
        int speed = 55;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        //Задание 4
        int age1 = -1000;
        boolean sleep = age1 < 2;
        boolean kindergarten = age1 >= 2 && age1 <= 6;
        boolean school = age1 > 7 && age1 <= 18;
        boolean university = age1 > 18 && age1 <= 24;
        boolean job = age1 > 24 && age1 <= 60;
        boolean old = age1 > 60;
        if (sleep) {
            System.out.println("Если возраст человека " + age1 + ", то ему пора спать");
        }
        if (kindergarten) {
            System.out.println("Если возраст человека " + age1 + ", то ему пора в детский сад");
        }
        if (school) {
            System.out.println("Если возраст человека " + age1 + ", то ему пора в школу");
        }
        if (university) {
            System.out.println("Если возраст человека " + age1 + ", то ему пора в университет");
        }
        if (job) {
            System.out.println("Если возраст человека " + age1 + ", то ему пора на работу");
        }
        if (old) {
            System.out.println("Если возраст человека " + age1 + ", то ему можно отдохнуть");
        }
        //Задание 5
        int childe = 100;
        boolean a = childe < 5;
        boolean b = childe >= 5 && childe <= 14;
        boolean c1 = childe > 14;
        if (a) {
            System.out.println("Если ребенку " + childe + ", то он не может кататься на аттракционах");
        }
        if (b) {
            System.out.println("Если ребенку " + childe + ", то он может кататься на аттракционах в сопровождении взрослых");
        }
        if (c1) {
            System.out.println("Если ребенку " + childe + ", то он может кататься один");
        }
        //Задание 6
        int tikets = 100;
        if (tikets < 60) {
            System.out.println("Есть стоячие и сидячие места");
        } else if (tikets < 102) {
            System.out.println("Есть стоячие места");
            } else {
            System.out.println("Мест нет.");
                //Задание 7
                int one = 10000;
                int two = 1020;
                int three = 300;
                if (one > three && one > two) {
                    System.out.println("ONe Наибольшее");
                } else if (two > one && two > three) {
                    System.out.println("Two наибольшее");
                } else {
                    System.out.println("Three наибольшее");
                }
            }
        }
    }
