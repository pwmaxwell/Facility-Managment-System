import java.util.*;
/*
interface TimeStamp {
	String description = "";
	Date startTime = new Date();
	Date endTime = new Date();
	double costUSD = 0;
}
*/
public abstract class TimeStamp {
	private String description = "";
	private Date startTime;
	private Date endTime;

	public boolean doWeOverlap(TimeStamp query) {
		if(startTime.before(query) && !endTime.before(query)){
			return true;
		}
		return false;
	}

	String getDescription(){
		return  description;
	}

	
}
