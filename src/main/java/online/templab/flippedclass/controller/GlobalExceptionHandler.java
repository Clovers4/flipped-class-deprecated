package online.templab.flippedclass.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 错误处理器
 * <br/>
 * 处理所有未捕捉的异常，转发到错误显示页面
 *
 * @author W.K
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 这是一个默认的处理方案，TODO: 之后可能新增一些对应具体原因的转发页面，如：404页面
     * 当出现问题时，转发到错误显示页面，显示具体原因，以及出现问题的访问url
     *
     * @param request
     * @param e
     * @return error页面的名称
     */
    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(Model model, HttpServletRequest request, Exception e) {
        model.addAttribute("exception", e);
        model.addAttribute("url", request.getRequestURL());
        return "error";
    }
}