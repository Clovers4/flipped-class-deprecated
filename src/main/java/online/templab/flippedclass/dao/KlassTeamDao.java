package online.templab.flippedclass.dao;

import java.util.List;

import online.templab.flippedclass.domain.KlassTeam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 班级-队伍关系 DAO 接口类
 * <br/>
 * 提供这些CRUD的方法是为了利用测试类，更加方便地插入一些数据，而不用进入到数据库去添加记录。
 *
 * @author F.J
 */

@Mapper
@Component
public interface KlassTeamDao {

    /**
     * 插入一条记录。
     * 若要获取id，直接调用record.getId();即可。
     *
     * @param record
     * @return 插入的行数，成功则为 1。
     */
    int insert(KlassTeam record);

    /**
     * 删除一条记录。
     *
     * @param id
     * @return 删除的行数。只可能为0或1。
     */
    int deleteById(Integer id);

    /**
     * 更新一条记录。
     *
     * @param record 一条被修改，但未被持久化的班级-队伍关系实体类
     * @return 更新的行数，只可能为0或1.
     */
    int updateById(KlassTeam record);

    /**
     * 查找一条记录。
     *
     * @param id
     * @return 一个班级-队伍关系实体类，或者NULL
     */
    KlassTeam getById(Integer id);

    /**
     * 查询所有记录。
     *
     * @return 一个List，包含班级-队伍关系表中的所有记录
     */
    List<KlassTeam> listAll();

}