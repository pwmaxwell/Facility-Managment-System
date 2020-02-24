import java.util.Date;

public class UsageTimeStamp extends TimeStamp{
    UsageTimeStamp(Date start, Date end, String desc){
        startTime = start;
        endTime = end;
        description = desc;
    }
}
