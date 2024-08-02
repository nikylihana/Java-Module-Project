import java.util.ArrayList;
import java.util.Scanner;

public class Race {
    ArrayList<Car> car = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void start() {
        for (int i = 1; i <= 3; i++) {
            String mark;
            while (true) {
                System.out.println("Укажите название машины №" + i);
                mark = scanner.next();
                if (!mark.isEmpty()) {
                    break;
                } else {
                    System.out.println("Название не подходит, попробуем другое");
                }
            }
            int speed;
            while (true) {
                System.out.println("Укажите скорость машины №" + i);
                speed = scanner.nextInt();
                if ((speed > 0) && (speed <= 250)) {
                    break;
                } else {
                    System.out.println("Скорость не входит в диапазон от 0 до 250, попробуйте снова");
                }
            }
            car.add(new Car(mark, speed));
            System.out.println(mark + " Машина №" + i + " едет со скоростью - " + speed);
        }
    }
    public void finish() {
        int firstCarDistance = car.get(0).speed *24;
        int secondCarDistance = car.get(1).speed *24;
        int thirdCarDistance = car.get(2).speed *24;
        if (firstCarDistance > secondCarDistance && firstCarDistance > thirdCarDistance){
            System.out.println(car.get(0).mark + " проехала - " + firstCarDistance + " км за 24 часа и Выйграла гонку!");
        } else if (secondCarDistance > firstCarDistance && secondCarDistance > thirdCarDistance){
            System.out.println(car.get(1).mark + " проехала - " + secondCarDistance + " км за 24 часа и Выйграла гонку!");
        } else if(thirdCarDistance > firstCarDistance && thirdCarDistance > secondCarDistance){
            System.out.println(car.get(2).mark + " проехала - " + thirdCarDistance + " км за 24 часа и Выйграла гонку!");
        } else{
            System.out.println("В этот раз на гонке нет одного победителя...");
        }

    }

}