package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("duckBean")
public class Duck5 {

    @Autowired
    private Egg6 egg;                 // я добавила

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
