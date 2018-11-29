package online.templab.flippedclass.dao;

import java.util.List;
import online.templab.flippedclass.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 用户 DAO 接口类
 *
 * @author W.K
 */

@Mapper
@Component
public interface UserDao {

    /**
     * 插入一条记录。新插入行的主键（primary key）会直接更新到record中。
     * 若要获取id，直接调用record.getId();即可。
     *
     * @param record
     * @return 插入的行数，成功则为 1。
     */
    int insert(User record);

    /**
     * 删除一条记录。通过主键id来删除匹配到的记录。
     *
     * @param id
     * @return 删除的行数。只可能为0或1。
     */
    int deleteById(Integer id);

    /**
     * 更新一条记录。使用主键id匹配唯一一条记录，进行更新。
     *
     * @param record 一条被修改，但未被持久化的用户实体类
     * @return 更新的行数，只可能为0或1.
     */
    int updateById(User record);

    /**
     * 查找一条记录。通过主键id精确匹配，返回匹配到的一条记录。
     *
     * @param id
     * @return 一个用户实体类，或者NULL
     */
    User getById(Integer id);


    /**
     * 查找一条记录。通过账号精确匹配，返回匹配到的一条记录。
     *
     * @param account
     * @return 一个管理员实体类，或者NULL
     */
    User getByAccount(String account);

    /**
     * 查询所有记录。
     *
     * @return 一个List，包含管理员表中的所有记录
     */
    List<User> listAll();

}