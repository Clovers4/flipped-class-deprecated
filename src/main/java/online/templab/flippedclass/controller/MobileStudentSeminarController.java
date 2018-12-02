package online.templab.flippedclass.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import online.templab.flippedclass.domain.Course;
//import com.j2ee.demo.service.CourseService;
import online.templab.flippedclass.domain.Seminar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/student/seminar")
public class MobileStudentSeminarController {

    @RequestMapping(value="/chooseCourse",method=GET)
    public String chooseCourse(Model model) {
        String[] courseName={"OOAD","J2EE"};
        String[] courseId={"1","2"};
        model.addAttribute("courseNames", courseName);
        model.addAttribute("courseIds", courseId);
        return "mobile/student/seminar/chooseCourse";
    }

    @RequestMapping(value="",method=GET)
    public String seminarInfoPage(Model model) throws ParseException {

        //讨论课-对象
        Seminar test_seminer = new Seminar();
        test_seminer.setState((byte)0);
        test_seminer.setIntro("This is the intro");
        test_seminer.setTopic("Use case");
        SimpleDateFormat test_date = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date dtBeg = test_date.parse("2008.01.23 22:45:56");
        test_seminer.setSignUpStartTime(dtBeg);
        SimpleDateFormat test_date2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date dtBeg2 = test_date2.parse("2003.01.23 22:45:56");
        test_seminer.setSignUpEndTime(dtBeg2);
        model.addAttribute("seminar",test_seminer);

        //课程名-字符串
        String test_course = "OOAD";
        model.addAttribute("course",test_course);
        return "/mobile/student/seminar/seminar";
    }

    @RequestMapping(value="/signSeat",method=GET)
    public String signSeat(Model model){

        //已报名的队伍名称-字符串数组
        String []team_name = new String[6];
        for(int i = 0 ; i < 6 ;++i){
            team_name[i] = new String();
            team_name[i] = "1-" + i;
        }
        team_name[3] = "";
        model.addAttribute("teams",team_name);

        //课程名-字符串
        String test_course = "OOAD";
        model.addAttribute("course",test_course);
        return "/mobile/student/seminar/seminarSignSeat";
    }

    @RequestMapping(value="/seminarPresentation",method=GET)
    public String seminarPresentation(Model model){

        //已报名的队伍名称-字符串数组
        String []team_name = new String[6];
        for(int i = 0 ; i < 6 ;++i){
            team_name[i] = new String();
            team_name[i] = "1-" + i;
        }
        team_name[3] = "";
        model.addAttribute("teams",team_name);

        //正在展示的序号-Integer
        Integer present_team = 2;
        model.addAttribute("present_team", present_team);

        //课程名-字符串
        String test_course = "OOAD";
        model.addAttribute("course",test_course);

        //讨论课名称-字符串
        String seminar_name = new String();
        seminar_name = "业务流程分析";
        model.addAttribute("seminar_name",seminar_name);

        return "/mobile/student/seminar/seminarPresentation";
    }

    @RequestMapping(value="/seminarInfo",method=GET)
    public String seminarInfo(Model model){

        //已报名的队伍名称-字符串数组
        String []team_name = new String[6];
        for(int i = 0 ; i < 6 ;++i){
            team_name[i] = new String();
            team_name[i] = "1-" + i;
        }
        team_name[3] = "";
        model.addAttribute("teams",team_name);

        //课程名-字符串
        String test_course = "OOAD";
        model.addAttribute("course",test_course);
        return "/mobile/student/seminar/viewSeminarInfo";
    }

    @RequestMapping(value="/seminarPresentation/askQuestion",method=POST)
    @ResponseBody
    public Map<String, Object> askQuestion(String report_id) {
        Map<String, Object> resultMap =  new HashMap<String,Object>();

        //记录下这个提问的学生

        return resultMap;
    }

    @RequestMapping(value="/signSeat/chooseSeat",method=POST)
    @ResponseBody
    public Map<String, Object> download(@RequestParam(value = "seat_id") Integer seat_id) {
        Map<String, Object> resultMap =  new HashMap<String,Object>();
        System.out.println(seat_id);

        //返回报名的组名
        resultMap.put("team_name", "1-10");
        resultMap.put("state",true);//如果查到这个组已经报名，则返回false
        return resultMap;
    }

}
