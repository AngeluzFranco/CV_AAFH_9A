package utez.edu.mx.cvaafh9a.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user2")
@CrossOrigin
public class User2Controller {
    public String getUser2(){
        return "Saludo desde user 2";
    }
}
