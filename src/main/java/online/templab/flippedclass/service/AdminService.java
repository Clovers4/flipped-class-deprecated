package online.templab.flippedclass.service;


import online.templab.flippedclass.domain.Admin;

import java.util.List;

/**
 * 管理员 业务逻辑 接口类
 * <br/>
 * 不对外开放新增，删除，修改等操作。<br/>
 * 仅提供了一个测试用的查询所有管理员的接口。<br/>
 * 原则上，这个接口不应该在测试以外的环境下被调用。<br/>
 * 这里是为了提供一个供学习使用，能够快速看到效果而编写了该接口。
 *
 * @author W.K
 */
public interface AdminService {

    /**
     * 查询所有记录。
     *
     * @return 一个List，包含管理员表中的所有记录
     */
    List<Admin> listAll();
}
