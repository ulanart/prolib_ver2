package lv.DAO;

import java.sql.SQLException;
import java.util.Collection;

import lv.Models.Article;

public interface ArticleDAO
{
	public void addArticle(Article article) throws SQLException;
	public void editArticle(Article article_id, Article article) throws SQLException;
	public void deleteArticle (Article article) throws SQLException;
	public Collection getAllArticles() throws SQLException;
}
