package lv.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
@Entity
@Table(name = "Article")
public class Article 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int article_id;
	
	@Column(name = "Article_short", nullable=false)
	private String article_short;
	
	@Column(name = "Article_Full" , nullable=false)
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
