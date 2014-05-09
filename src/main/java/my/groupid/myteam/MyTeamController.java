package my.groupid.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyTeamController {

	@RequestMapping(value = "myteam")
	public String myteam() {
        return "myteam/myteam";
    }
}
