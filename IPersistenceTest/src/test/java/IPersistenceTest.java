import com.waiting.config.XMLConfigBuilder;
import com.waiting.config.XMLMapperBuilder;
import com.waiting.io.Resources;
import com.waiting.pojo.Configuration;
import com.waiting.sqlSession.SqlSession;
import com.waiting.sqlSession.SqlSessionFactory;
import com.waiting.sqlSession.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class IPersistenceTest {

    @Test
    public void test() throws Exception {
       /* InputStream resourceAsSteam = Resources.getResourceAsStream("sqlMapConfig.xml");
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder();
        Configuration configuration = xmlConfigBuilder.parseConfig(resourceAsSteam);*/
        InputStream resourceAsSteam = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsSteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<Object> objects = sqlSession.selectList("User.findAll");
        for (Object object : objects) {
            System.out.println(object);
        }
    }


    @Test
    public void test2() throws Exception {
        InputStream resourceAsSteam = Resources.getResourceAsStream("UserMapper.xml");

        Configuration configuration = new Configuration();

        XMLMapperBuilder xmlMapperBuilder = new XMLMapperBuilder(configuration);
        xmlMapperBuilder.parseConfig(resourceAsSteam);

        System.out.println(configuration);
    }


}