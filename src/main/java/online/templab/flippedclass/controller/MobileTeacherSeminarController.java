package online.templab.flippedclass.controller;

import com.alibaba.fastjson.JSONArray;
import online.templab.flippedclass.domain.Seminar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/teacher/seminar")
public class MobileTeacherSeminarController {

    @RequestMapping(value = "/chooseCourse", method = GET)
    //得到当前老师用户的所有课程信息（id和名字）
    public String enterSeminar(Model model) {
        String[] courseName = {"OOAD", "J2EE"};
        String[] courseId = {"1", "2"};
        model.addAttribute("courseNames", courseName);
        model.addAttribute("courseIds", courseId);
        return "mobile/teacher/seminar/chooseCourse";
    }

    @RequestMapping(value = "", method = GET)
    public String seminarInfoPage(Model model) {
        //班级名-字符串
        String test_class = "2016 - (3)";
        model.addAttribute("klass", test_class);

        //讨论课对象
        Seminar test_seminer = new Seminar();
        test_seminer.setState(2);
        test_seminer.setIntro("This is the intro");
        test_seminer.setTopic("Use case");
        model.addAttribute("seminar", test_seminer);

        //课程名-字符串
        String test_course = "OOAD";
        model.addAttribute("course", test_course);
        return "/mobile/teacher/seminar/viewSeminar";
    }

    @RequestMapping(value = "/report", method = GET)
    public String report(Model model) {
        //书面报告名称-字符串数组
        String[] test_presentation = new String[6];
        for (int i = 0; i < 6; ++i) {
            test_presentation[i] = new String();
            test_presentation[i] = "1-" + i + "业务流程.dox";
        }
        test_presentation[3] = "";
        model.addAttribute("reports", test_presentation);

        //课程名-字符串
        String test_course;
        test_course = "OOAD";
        model.addAttribute("course", test_course);
        return "/mobile/teacher/seminar/reportGrade";
    }

    @RequestMapping(value = "/report/grade", method = POST)
    @ResponseBody
    public Map<String, Object> grade(@RequestBody String reports) {

        //要判断是否是空值(-1代表空值),空值就不能存入数据库里

        Map<String, Object> resultMap = new HashMap<String, Object>();
        List<String> scores = JSONArray.parseArray(reports, String.class);
        for (String score
                : scores) {
            System.out.println(score);
        }
        System.out.println(reports);
        return resultMap;
    }

    @RequestMapping(value = "/report/download", method = POST)
    @ResponseBody
    public Map<String, Object> download(@RequestParam(value = "report_id") Integer report_id) {
        Map<String, Object> resultMap = new HashMap<String, Object>();

        //根据传回来的id判断下载哪一个文档
        System.out.println(report_id);
        return resultMap;
    }
}
