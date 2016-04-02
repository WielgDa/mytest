package com.stock.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stock.dao.api.template.ITestDAO;
import com.stock.dao.impl.template.AbstractHibernateDAO;
import com.stock.model.test.Test;

@Repository
@Transactional
public class TestDAO extends AbstractHibernateDAO implements ITestDAO{
	
	public TestDAO() {
		super(Test.class);
	}

}
