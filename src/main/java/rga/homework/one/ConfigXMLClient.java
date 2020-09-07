package rga.homework.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigXMLClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Weapon weapon = context.getBean("weapon", Weapon.class);
        weapon.doFire();

        WeaponImplementation weaponImpl = context.getBean("weapon", WeaponImplementation.class);
        System.out.println(weapon == weaponImpl);

        Weapon weaponInnerBean = context.getBean("weaponInnerBean", Weapon.class);
        weaponInnerBean.doFire();

        Weapon weaponConstructor = context.getBean("weaponConstructor", Weapon.class);
        weaponConstructor.doFire();

    }
}
