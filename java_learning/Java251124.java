package java_learning;


class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name+ " zzz");
    }
}


class HouseDog extends Dog {
    HouseDog() {
    }

    HouseDog(String name) {
        this.setName(name);
    }
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }

    // super keyword
    void sleepTogether() {
        super.sleep();
        System.out.println("and " + this.name + " zzz in house");
    }
}

class Tiger extends Animal implements Predator, Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements BarkablePredator{
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}

abstract class Predator extends Animal {
    abstract String getFood();

    void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}

interface Barkable {
    void bark();
}

interface BarkablePredator extends Predator, Barkable {
}

class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

public class Java251124 {
    public static void main(String[] args) {
        // 상속
        Dog dog = new Dog();
        dog.setName("hana");
        System.out.println(dog.name);
        dog.sleep();

        // 자녀객체는 부모 객체의 자료형으로 사용할 수 있다
        Animal dog2 = new Dog();
        dog2.setName("dool");
        System.out.println(dog2.name);
        // 하지만 부모 객체의 프로퍼티와 매서드만 사용할 수 있다.
        // dog2.sleep();

        // 부모 객체를 자녀 객체의 자료형으로 사용할 수는 없다.
        // 자녀 객체는 부모객체이기도 하지만, 반대는 아니니까.
        // Dog dog3 = new Animal(); // type mismatch

        // All classes made in java inherit from the Objact class
        Object dog4 = new Dog();

        // method overriding
        // it means that the Child class provides its own implementation of a method defined in the parent class.
        HouseDog houseDog = new HouseDog();
        houseDog.setName("mark");
        houseDog.sleep();

        // method overloading
        // it means defining mutiple methods with the same name as long as their parameters are different.
        houseDog.sleep(4);

        // super keyword
        houseDog.sleepTogether();

        // 생성자
        // return자료형도 정의하지 않고, 메서드명이 클래스명과 같은 메서드를 생성자라고 함
        HouseDog dog5 = new HouseDog();
        System.out.println(dog5.name);

        HouseDog dog6 = new HouseDog("cool");
        System.out.println(dog6.name);

        // interface
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);

        // polymorphism
        // it is the ablility of a single object to take on mutiple forms or types in object-oriented programming.
        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);

        // 추상클래스 하다가 끝났다~
    }
}
