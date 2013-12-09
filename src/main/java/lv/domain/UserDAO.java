package lv.domain;

import java.sql.SQLException;
import java.util.Collection;

public interface UserDAO 
{
	public void addUser(User user) throws SQLException;
	public void editUser(User user_id, User user) throws SQLException;
	public void delete (User user) throws SQLException;
	public Collection getAllUsers() throws SQLException;
}
