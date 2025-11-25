package java_learning.house.person;

import java_learning.house.HousePark;

public class YeSam extends HousePark {
    public static void main(String[] args) {
        YeSam ys = new YeSam();
        System.out.println(ys.lastname);
        
        HousePark housePark = new HousePark();
        System.out.println(housePark.info);
    }
}
