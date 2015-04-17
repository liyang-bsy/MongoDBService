package test.net.vicp.lylab.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import net.vicp.lylab.core.CloneableBaseObject;

/**
 * TestCase For MongoDBService
 * 
 * @author liyang
 * 
 * @since July 17th 2014
 * @version 0.9.9
 *
 */

@Entity(value = "GeneralLog" ,noClassnameStored = true)
public class TestModel extends CloneableBaseObject {
	
	@Id
	private ObjectId glId;
	private String dataA;
	private String dataB;

	public ObjectId getGlId() {
		return glId;
	}

	public void setGlId(ObjectId glId) {
		this.glId = glId;
	}

	public String getDataA() {
		return dataA;
	}

	public void setDataA(String dataA) {
		this.dataA = dataA;
	}

	public String getDataB() {
		return dataB;
	}

	public void setDataB(String dataB) {
		this.dataB = dataB;
	}

}