package lv.DAO;

import java.sql.SQLException;
import java.util.Collection;

import lv.Models.Video;

public interface VideoDAO 
{
	public void addVideo(Video video) throws SQLException;
	public void editVideo(Video video) throws SQLException;
	public void delete(Video video) throws SQLException;
	public Collection getAllVideo(Video video) throws SQLException;
}
