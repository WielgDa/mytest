package com.stock.dao.api.template;

public interface IAbstractHibernateDAO<T,O> {
	
	T get(O o);
	
	void save(T t);

}
