package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseView1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");

        return mav;
    }

    @RequestMapping("/response-view-v2")
    public String responseView2(Model model) {
       model.addAttribute("data", "hello!");
        return "response/hello";        //@Controller 이면서 String을 반환한다? => String이 view 논리적 이름이 된다.
    }

    @RequestMapping("/response/hello")
    public void responseView3(Model model) {        //권장하지 않음
        model.addAttribute("data", "hello!");
    }
}
