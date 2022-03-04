package kr.or.connect.jdbcexam;

import java.util.ArrayList;
import java.util.List;

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
    	List<Role> l = dao.getRoles();
    	for(int i = 0; i < l.size(); i++) {
    		System.out.println(l.get(i));
    	}
    
    }
}
