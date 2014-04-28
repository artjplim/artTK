package my.groupid.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeKeepingAppController {

	@RequestMapping(value = "timekeepingapp")
	public String timekeepingapp() {
        return "timekeepingapp/timekeepingapp";
    }
}
