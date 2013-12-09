package lv.utils;

import lv.domain.Article;
import lv.domain.User;
import lv.domain.Video;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    	static 
    	{
    		Configuration configuration = new Configuration();
    		configuration.configure();
    		configuration.addAnnotatedClass(User.class);
    		configuration.addAnnotatedClass(Article.class);
    		configuration.addAnnotatedClass(Video.class);
    		sessionFactory = configuration.buildSessionFactory();
    	}
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }


}
