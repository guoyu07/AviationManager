package com.lushapp.common.orm.interceptor;

import java.io.Serializable;

/**
 * orm 插入拦截器
 * 
 * @author maurice
 *
 * @param <E> 持久化对象类型
 * @param <P> 持久化上下文，如SessionFactory等对象,或封装的orm操作类，如：BasicHibernateDao
 */
public interface OrmInsertInterceptor<E,P> {
	
	/**
	 * 当持久化框架执行更新之前，会触发该方法，当该方法返回false时，将中断更新
	 * 
	 * @param entity 持久化对象
	 * @param persistentContex 持久化上下文
	 * @param id 主键id值
	 * 
	 * @return boolean
	 */
	public boolean onInsert(E entity, P persistentContext);
	
	/**
	 * 当持久化框架执行更新之后，会触发该方法
	 * 
	 * @param id 保存或更新的对象id
	 * @param entity 持久化对象
	 * @param persistentContex 持久化上下文
	 * @param id 主键id值
	 * 
	 */
	public void onPostInsert(E entity, P persistentContext, Serializable id);
	
}
