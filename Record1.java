package Map;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Record1 
{
		public static List<Map<Integer, String>> list() throws SQLException, ClassNotFoundException
	    {
		List<Map<Integer,String>> list = new ArrayList<>();
		 
			Map<Integer,String> map=new HashMap<>();
			
			try
			{
				
				Connection con = DBconnect.getconnection();
				Statement pstmt = con.createStatement();
				
				ResultSet rs = pstmt.executeQuery("SELECT * FROM STUDENT");
				{
		
				while(rs.next())
				{
			
					map.put(rs.getInt(1), rs.getString(2));
				}
				
				list.add(map);
				
				}
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			return list;
			
			

	}
}
