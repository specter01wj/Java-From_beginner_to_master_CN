import java.sql.*;

public class DeleteStu {
	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;
	public Connection getConnection() {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:jtds:sqlserver://localhost:1433/"
							+ "db_jdbc", "sa", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		DeleteStu c = new DeleteStu();
		con = c.getConnection();
		try {
			sql = con.prepareStatement("delete from tb_stu where birthday < ?");
			sql.setString(1, "2000-09-01");
			sql.executeUpdate();
			System.out.println("数据删除完毕");
		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		
	}
}
