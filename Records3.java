package Map;

import java.sql.SQLException;
import java.util.*;

public class Records3
{
	public static void main(String[] args)
	{
		
		list3();		  
    }
	
	public static void list3()
	{
		try {
			Record1.list();
			Records2.record2();
			List<Map<Integer, String>> list1;
			list1 = Record1.list();
			
			for (Map<Integer, String> record :list1 ) 
			{
	            for (Map.Entry<Integer, String> entry : record.entrySet()) 
	            {
	               System.out.println(entry.getKey() + ": " + entry.getValue());
	            }
	           System.out.println();
		    } 
		    }
			catch (ClassNotFoundException | SQLException e) 
		    {
			e.printStackTrace();
		    }
		    
		
	}
}
	