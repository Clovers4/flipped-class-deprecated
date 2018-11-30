package online.templab.flippedclass.dao;

import java.util.List;

import online.templab.flippedclass.domain.Presentation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 展示 DAO 接口类
 * <br/>
 * 提供这些CRUD的方法是为了利用测试类，更加方便地插入一些数据，而不用进入到数据库去添加记录。
 *
 * @author F.J
 */

@Mapper
@Component
public interface PresentationDao {

    /**
     * 插入一条记录。
     * 若要获取id，直接调用record.getId();即可。
     *
     * @param record
     * @return 插入的行数，成功则为 1。
     */
    int insert(Presentation record);

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
     * @param record 一条被修改，但未被持久化的展示实体类
     * @return 更新的行数，只可能为0或1.
     */
    int updateById(Presentation record);

    /**
     * 查找一条记录。
     *
     * @param id
     * @return 一个展示实体类，或者NULL
     */
    Presentation getById(Integer id);

    /**
     * 查询所有记录。
     *
     * @return 一个List，包含展示表中的所有记录
     */
    List<Presentation> listAll();

}