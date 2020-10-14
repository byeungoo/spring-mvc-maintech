package hoon.me;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping(value = "/events")
    public String events(Model model){
        model.addAttribute("events", eventService.getEvents());
        return "events";
    }

}
