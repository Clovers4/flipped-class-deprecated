package online.templab.flippedclass.service;

import online.templab.flippedclass.domain.Teacher;

/**
 * 老师 业务
 *
 * @author W.K
 */
public interface TeacherService {

    /**
     * 登录，成功则返回Teacher实体类；失败则返回null。
     *
     * @param account
     * @param password
     * @return
     */
    Teacher login(String account, String password);

}
