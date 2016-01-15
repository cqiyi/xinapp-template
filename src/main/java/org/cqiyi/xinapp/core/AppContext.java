package org.cqiyi.xinapp.core;

import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppContext {
	final static Logger logger = LoggerFactory.getLogger(AppContext.class);

	public static void initDataSource() {
		logger.info("DataSource initialize ...");
		Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/test", "root", "qqwQQW");
		logger.info("DataSource initialized successfull.");
	}
}
