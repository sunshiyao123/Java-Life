import org.junit.Test;

import java.sql.*;

public class JDBCDemo {
    @Test
    public void test() {
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/jdbc", "root","a5289012");
            //3.执行sql
            String sql = "select * from user where userName = 'ww' and password = '123'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            //遍历结果集
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String useName = resultSet.getString("username");
                String password = resultSet.getString("password");
                System.out.println("id="+id+" username="+useName+" password="+password);
            }
            //4.释放资源
            connection.close();
            statement.close();
            resultSet.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void test2() {
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/jdbc", "root", "a5289012");
            //3.执行sql
            String sql = "delete from user where id = 3";
            Statement statement = connection.createStatement();
            int resultRows = statement.executeUpdate(sql, statement.RETURN_GENERATED_KEYS);
            System.out.println(resultRows);
            //4.释放资源
            connection.close();
            statement.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        @Test
        public void test3() {
            try {
                //1.加载驱动
                Class.forName("com.mysql.jdbc.Driver");
                //2.获取连接
                Connection connection = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/jdbc", "root","a5289012");
                //3.执行sql
                String sql = "insert into user(userName, password)"+"values ('lm','123')";
                Statement statement = connection.createStatement();
                int result = statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
                System.out.println(result);
                //4.释放资源
                connection.close();
                statement.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
    public void test4() {
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/jdbc", "root","a5289012");
            //3.执行sql
            String userName = "";

            //4.释放资源
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
