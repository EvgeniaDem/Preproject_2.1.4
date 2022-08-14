package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("rabbitBean")               // bean id - добавила я
public class Rabbit4 {

    private final Duck5 duck;                    // это я добавила

    @Autowired
    public Rabbit4(Duck5 duck) {                  // добавила конструктор
        this.duck = duck;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }
}
