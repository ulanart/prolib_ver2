package lv.Models;

public class Article 
{
	private int article_id;
	private String article_short;
	private String article_full;
	
	public Article(){}
	public Article(String article_s, String article_f)
	{
		this.article_short = article_s;
		this.article_full = article_f;
	}
	public int getArticle_id() {
		return article_id;
	}
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	public String getArticle_short() {
		return article_short;
	}
	public void setArticle_short(String article_short) {
		this.article_short = article_short;
	}
	public String getArticle_full() {
		return article_full;
	}
	public void setArticle_full(String article_full) {
		this.article_full = article_full;
	}
	
}
