package test.net.vicp.lylab.mongodb.service;

import java.sql.SQLException;

import net.vicp.lylab.mongodb.MongoDBConfig;
import net.vicp.lylab.mongodb.MongoDBService;
import test.net.vicp.lylab.model.BaseReport;
import test.net.vicp.lylab.mongodb.dao.BaseReportDao;

public class BaseReportService extends MongoDBService<BaseReport> {
	public BaseReportService() {
		super(BaseReport.class);
	}
	BaseReportDao dao;
	@Override
	public BaseReportDao getDao() {
		if(this.dao == null)
			this.dao = new BaseReportDao();
		return dao;
	}
	
	public static void main(String[] argv) throws SQLException
	{
		MongoDBConfig.setDatabase(".");
		MongoDBConfig.setPassword(".");
		MongoDBConfig.setPort(27017);
		MongoDBConfig.setServer(".");
		MongoDBConfig.setUser(".");
		BaseReportService s = new BaseReportService();
		System.out.println(s.queryForList(new String[] {}, new Object[] {}).size());
	}
}
