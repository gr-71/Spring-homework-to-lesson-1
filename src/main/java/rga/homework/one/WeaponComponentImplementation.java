package rga.homework.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("weaponComponent")
@Scope("prototype")
public class WeaponComponentImplementation implements Weapon {

    private Bullet bullet;
    @Value("false")
    private boolean broken;

    public void doFire() {
        if (broken) {
            System.out.println("Something wrong with your weapon! You have to find out what happened!");
            return;
        }
        System.out.println("Click!");
        bullet.loading();
    }

    public Bullet getBullet() {
        return bullet;
    }

    @Autowired  // (required = false)
    @Qualifier("regularBullet")
    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    @Override
    public void breaking() {
        this.broken = true;
    }

    @Override
    public boolean isBroken() {
        return broken;
    }
}
