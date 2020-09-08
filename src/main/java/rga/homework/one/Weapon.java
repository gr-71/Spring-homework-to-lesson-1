package rga.homework.one;

public interface Weapon {
    void doFire();
    Bullet getBullet();
    void setBullet(Bullet bullet);
    void breaking();
    boolean isBroken();
}
