package cn.servlet;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller("testServlet")
@RequestMapping("/testSer")
public class TestServlet {
    @RequestMapping(value = "/hehe",method = RequestMethod.GET)
    public ModelAndView hehe(@RequestParam(value = "username",required = false) String username){
//        try {
//            username = new String(username.getBytes("ISO-8859-1"),"UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hehe","呵呵呵呵");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
