package online.templab.flippedclass.service;


import online.templab.flippedclass.domain.Student;

/**
 * @author W.K
 */
public interface StudentService {

    /**
     * 登录，成功则返回Student实体类；失败则返回null。
     *
     * @param account
     * @param password
     * @return
     */
    Student login(String account, String password);

}
