//Есть интерфейсы CanFly (летать), CanSwim (плавать), CanRun (бегать).
//        Добавь эти интерфейсы классам Duck (утка), Penguin (пингвин), Toad (жаба)
//
//        Требования:
//        •  Класс Solution должен содержать интерфейс CanFly с методом void fly().
//        •  Класс Solution должен содержать интерфейс CanSwim с методом void swim().
//        •  Класс Solution должен содержать интерфейс CanRun с методом void run().
//        •  Класс Solution должен содержать классы Duck, Penguin, Toad.
//        •  Объект класса Duck должен уметь летать (поддерживать интерфейс Fly),
//        бегать (поддерживать интерфейс Run) и плавать (поддерживать интерфейс Swim).
//        •  Объект класса Penguin должен уметь бегать (поддерживать интерфейс Run) и плавать (поддерживать интерфейс Swim).//       •  Объект класса Toad должен уметь только плавать (поддерживать интерфейс Swim).
public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Penguin penguin1 = new Penguin();
        Toad toad1 = new Toad();
        duck1.fly();
        duck1.run();
        duck1.swim();

        penguin1.run();
        penguin1.swim();

        toad1.swim();
    }

}
