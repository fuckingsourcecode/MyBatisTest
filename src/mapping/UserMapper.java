package mapping;

import data.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by whistle on 16-10-28.
 */
public interface UserMapper {

    @Insert("insert into user (name, age) values(#{name}, #{age})")
    public int add(User user);

    @Delete("delete from user where id = #{id}")
    public int deleteById(int id);

    @Update("update user set name = #{name}, age = #{age} where id = #{id}")
    public int updateById(User user);

    @Select("select * from user where id = #{id}")
    public User getById(int id);

    @Select("select * from user")
    public List<User> getAll();
}
