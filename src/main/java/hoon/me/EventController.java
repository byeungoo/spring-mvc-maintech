package hoon.me;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public String events(Model model){
        System.out.println("이벤트 컨트롤러");
        return "events";
    }

}
