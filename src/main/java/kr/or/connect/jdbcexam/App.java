package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	RoleDao dao = new RoleDao();
    	Role role = dao.getRole(100);
    	System.out.println(role);
    	/////////
    	int roleId = 500;
    	String description = "CTO";
    	
    	Role role2 = new Role(roleId, description);
    	
    	RoleDao dao2 = new RoleDao();
    	int insertCount = dao2.addRole(role2);
    	
    	System.out.println(insertCount);
    }
}
