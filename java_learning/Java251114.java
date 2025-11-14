package java_learning;

class Calculator {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }
}

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class Java251114 {
    int sum(int a, int b) {
        return a + b;
    }

    public static void main2(String[] args) {
        // 형변환
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);

        int num2 = 123;
        String n2 = "" + num2;
        System.out.println(n2);

        String n3 = Integer.toString(num2);
        String n4 = String.valueOf(num2);
        System.out.println(n3 + n4);

        int n5 = 123;
        double d1 = n5;
        System.out.println(d1);

        double d2 = 123.456;
        int n6 = (int) d2;
        System.out.println(n6);

        String num3 = "123.456";

        double n7 = Double.parseDouble(num3);
        System.out.println(n7);
        System.out.println((int) n7);

        n7 = (int) n7;
        System.out.println(n7);

        final int n8 = 123;
        // n8 = 234; final은 재할당 불가

        // for 기본 구조
        String[] numbers = { "one", "two", "three" };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        // for each
        String[] numbers2 = { "one", "two", "three" };
        for (String number : numbers2) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        System.out.println("test");
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        System.out.println(cal1.add(3));
        System.out.println(cal2.add(4));

        System.out.println(cal1.add(3));
        System.out.println(cal2.add(7));

        Animal cat = new Animal();
        System.out.println(cat.name);
        cat.setName("또비");
        System.out.println(cat.name);

        Animal dog = new Animal();
        dog.setName("똘이");
        System.out.println(dog.name);
        System.out.println(cat.name);


        int a = 3;
        int b = 4;
        Java251114 java251114 = new Java251114();
        int c = java251114.sum(a, b);
        System.out.println(c);
    }
}
