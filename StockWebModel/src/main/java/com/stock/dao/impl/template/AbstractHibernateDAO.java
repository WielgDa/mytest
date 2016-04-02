package com.stock.dao.impl.template;

import java.io.Serializable;
import java.util.List;

import javassist.bytecode.SignatureAttribute.ClassType;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.stock.dao.api.template.IAbstractHibernateDAO;

public abstract class AbstractHibernateDAO {
	
	private final Class entityClass;
	
	@Autowired
    private SessionFactory sessionFactory;

    public AbstractHibernateDAO(Class entityClass) {

        Assert.notNull(entityClass, 
                "entityClass must not be null");

        this.entityClass = entityClass;
    }

    protected Criteria criteria() {
        return currentSession().createCriteria(entityClass);
    }

    protected Query query(String hql) {
        return currentSession().createQuery(hql);
    }

    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    protected List all() {
        return criteria().list();
    }

    public Object get(Serializable id) {
        return currentSession().get(entityClass, id);
    }

    public Class getEntityClass() {
        return entityClass;
    }	
	

}
