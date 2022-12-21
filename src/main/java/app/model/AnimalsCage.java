package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;
    private Timer timer = new Timer();

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());// Можно и так System.out.println(timer.getTime());
        //Геттер нужен для MainTest
        System.out.println("________________________");
    }
}
