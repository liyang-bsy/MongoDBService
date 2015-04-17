package test.net.vicp.lylab.mongodb.service;

import test.net.vicp.lylab.model.TestModel;
import test.net.vicp.lylab.mongodb.dao.TestModelDao;
import net.vicp.lylab.mongodb.MongoDBService;

public class TestModelService extends MongoDBService<TestModel> {
	public TestModelService() {
		super(TestModel.class);
	}
	TestModelDao dao;
	@Override
	public TestModelDao getDao() {
		if(this.dao == null)
			this.dao = new TestModelDao();
		return dao;
	}
}
