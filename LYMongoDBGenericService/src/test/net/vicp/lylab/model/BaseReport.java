package test.net.vicp.lylab.model;

import net.vicp.lylab.core.BaseObject;
import net.vicp.lylab.core.CloneableBaseObject;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity(value = "BaseReport" ,noClassnameStored = true)
public class BaseReport extends CloneableBaseObject implements Cloneable{
	protected String DatePattern = "yyyy-MM-dd hh:mm:ss";
	
	@Id
	protected ObjectId baseReportId;
	
	BaseObject reportDoc;
	
	public BaseReport()
	{
		reportDoc = null;
	}
	
	public ObjectId getBaseReportId() {
		return baseReportId;
	}

	public void setBaseReportId(ObjectId baseReportId) {
		this.baseReportId = baseReportId;
	}

	public BaseObject getReportDoc() {
		return reportDoc;
	}

	public void setReportDoc(BaseObject reportDoc) {
		this.reportDoc = reportDoc;
	}

}
