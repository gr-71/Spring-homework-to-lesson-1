package rga.homework.one;

import org.springframework.stereotype.Component;

@Component("bullet")
public class ExplosiveBullet implements Bullet {
    @Override
    public void loading() {
        System.out.println("Load an explosive bullet");
    }
}
