package rga.homework.one;

import org.springframework.stereotype.Component;

@Component("regularBullet")
public class RegularBullet implements Bullet {
    @Override
    public void loading() {
        System.out.println("Load a regular bullet");
    }
}
