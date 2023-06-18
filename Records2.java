package Map;

import java.sql.*;

import java.util.*;

public class Records2  
{
	public static List<Map<Integer, String>> record2() throws ClassNotFoundException, SQLException 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		List<Map<Integer,String>> list1 = Record1.list();
		try 
		{
			System.out.println(list1);
			Connection con = DBconnect.getconnection();
			PreparedStatement statement = con.prepareStatement("INSERT INTO STUDENT VALUES (?, ?)");
			{

				    System.out.println("enter ID: ");
	                statement.setInt(1, sc.nextInt());
	                System.out.println("enter NAME: ");
	                statement.setString(2, sc.next());
	                statement.executeUpdate();
	                System.out.println("successful...");
			}
			
			ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT");
			{
					 
			Map<Integer,String> map=new HashMap<>();
			while(rs.next())
			{
		
				map.put(rs.getInt(1), rs.getString(2));
			}
			
			list1.add(map);
			
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return Record1.list();
	

	}
}


		
	

		



