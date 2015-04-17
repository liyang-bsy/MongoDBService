package test.net.vicp.lylab.mongodb.dao;

import test.net.vicp.lylab.model.BaseReport;
import net.vicp.lylab.mongodb.MongoDBDao;

/**
 * BaseReportDao for BaseReportService
 * @author		liyang
 * @version		1.0.0
 */
public class BaseReportDao extends MongoDBDao<BaseReport> {
	public BaseReportDao() {
		super(BaseReport.class);
	}
}
