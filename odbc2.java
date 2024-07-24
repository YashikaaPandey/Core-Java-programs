import java.sql.*;
public class Insert_prepared
{
 public static void main(String arg[])
{
try
{
 class.forName("oracle.jdbc.driver.OracleDriver");
 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
PreparedStatement st=con.prepareStatement("insert into emp3 values(?,?)");
st.setString(1,"yuvansh");
st.setInt(2,501);
int i=st.executeUpdate();
System.out.println(i+"record inserted");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}