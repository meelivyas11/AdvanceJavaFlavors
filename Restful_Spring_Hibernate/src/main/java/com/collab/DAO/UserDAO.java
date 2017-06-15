package com.collab.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.collab.Domains.User;
import com.collab.Util.HibernateFactory;

@Repository
public class UserDAO extends CommonDAO{

	public UserDAO() {
        super();
    }

    /**
     * Insert a new User into the database.
     * @param event
     */
    public void create(User u) throws RuntimeException {
        super.saveOrUpdate(u);
    }


    /**
     * Delete a detached User from the database.
     * @param event
     */
    public void delete(User u) throws RuntimeException {
        super.delete(u);
    }

    /**
     * Find an User by its primary key.
     * @param id
     * @return
     */
    public User find(Long id) throws RuntimeException {
        return (User) super.find(User.class, id);
    }
    
    /**
     * Find an User by username and password.
     * @param id
     * @return
     */
    public User find(String username, String password) throws RuntimeException {
    	User u = null;
        try {
            startOperation();
            Criteria criteria =	getSession().createCriteria(User.class);
            criteria.add(Restrictions.eq("userName", username));
            criteria.add(Restrictions.eq("password", password));
            List<User> users = criteria.list();
            if(users.size()>0)
            	u = users.get(0);
            getTransaction().commit();
       
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(getSession());
        }
        return u;
    }

    /**
     * Updates the state of a detached User.
     *
     * @param event
     */
    public void update(User u) throws RuntimeException {
        super.saveOrUpdate(u);
    }

    /**
     * Finds all Events in the database.
     * @return
     */
	@SuppressWarnings("unchecked")
	public List<User> findAll() throws RuntimeException{
        return (List<User>) super.findAll(User.class);
    }
	
	
}
