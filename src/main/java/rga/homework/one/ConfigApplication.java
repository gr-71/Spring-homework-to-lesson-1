package rga.homework.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("rga.homework.one")
public class ConfigApplication {
    @Bean(name = "weapon")
    public Weapon weapon (Bullet bullet){
        return new WeaponImplementation(bullet);
    }
}
