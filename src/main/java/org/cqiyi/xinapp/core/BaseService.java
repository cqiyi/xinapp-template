package org.cqiyi.xinapp.core;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseService<M> {
	final static Logger logger = LoggerFactory.getLogger(BaseService.class);

	static {
		AppContext.initDataSource();
	}

	public abstract boolean insert(M model);

	public abstract boolean update(M model);

	public abstract boolean delete(M model);

	public abstract M get(String id);

	public abstract List<M> getAll();

}
