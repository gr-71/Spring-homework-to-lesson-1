package rga.homework.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigClient {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApplication.class);
        Weapon weaponComponent = context.getBean("weaponComponent", Weapon.class);
        weaponComponent.doFire();
        weaponComponent.breaking();
        weaponComponent.doFire();

        // In order to take a new weapon
        System.out.println("I'd like to have a new weapon!");
        Weapon weaponComponentNew = context.getBean("weaponComponent", Weapon.class);
        weaponComponentNew.doFire();

    }
}
