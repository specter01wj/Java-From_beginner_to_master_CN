import java.sql.*;

public class InsertStu {
	
	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;
	
	public Connection getConnection() {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:jtds:sqlserver://localhost:1433/db_jdbc", "sa",
					"");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		InsertStu c = new InsertStu();
		con = c.getConnection();
		try {
			sql = con.prepareStatement("insert into tb_stu values(?,?,?)");
			sql.setString(1, "李某");
			sql.setString(2, "女");
			sql.setString(3, "1999-10-20");
			sql.executeUpdate();
			System.out.println("数据插入成功。");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}