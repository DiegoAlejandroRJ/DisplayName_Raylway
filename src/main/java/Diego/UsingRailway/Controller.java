package Diego.UsingRailway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/name")
    public String displayName(){
        return "Diego Alejandro Ramírez Jaimes";
    }
}
