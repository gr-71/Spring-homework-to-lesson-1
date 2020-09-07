package rga.homework.one;

public class WeaponImplementation implements Weapon {
    private Bullet bullet;

    public WeaponImplementation() {
    }

    public WeaponImplementation(Bullet bullet) {
        this.bullet = bullet;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    @Override
    public void breaking() {
    }

    @Override
    public boolean isBroken() {
        return false;
    }

    public void doFire(){
        System.out.println("Click!");
        bullet.loading();
    }
}
