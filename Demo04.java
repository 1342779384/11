package jdbcTemplate;

import Utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo04 {
        @Test
    public void test03()throws Exception{

        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql="insert into product varlues(null,?,?)";

        Object[]obj={"小米8",2699};


        int i = jdbcTemplate.update(sql, "小米8", 2699);

        if (i>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }


    }
}
