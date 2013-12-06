package lv.DAO;

import java.sql.SQLException;
import java.util.Collection;

import lv.Models.User;

public interface UserDAO 
{
	public void addUser(User user) throws SQLException;
	public void editUser(User user_id, User user) throws SQLException;
	public void delete (User user) throws SQLException;
	public Collection getAllUsers() throws SQLException;
}
