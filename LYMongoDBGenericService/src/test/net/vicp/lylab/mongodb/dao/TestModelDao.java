package test.net.vicp.lylab.mongodb.dao;

import net.vicp.lylab.mongodb.MongoDBDao;
import test.net.vicp.lylab.model.TestModel;


/**
 * GeneralLogDao for GeneralLogService
 * @author		liyang
 * @version		1.0.0
 */
public class TestModelDao extends MongoDBDao<TestModel> {
	public TestModelDao() {
		super(TestModel.class);
	}
}
