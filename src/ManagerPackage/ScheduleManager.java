package src.ManagerPackage;
import src.TimeStamps.*;
import src.FacilityPackage.*;
import java.util.*;

public class ScheduleManager {
    private Map<String, List<TimeStamp>> facilityDirectory;
    private Date currentDate = new Date();
    private UsageManager useMan;
    private MaintenanceManager mainMan;
    private FacilityTracker tracker;
    public Date getDate(){
        return currentDate;
    }

    public ScheduleManager(Map<String, List<TimeStamp>> facilityDirectory, UsageManager useMan, MaintenanceManager mainMan, FacilityTracker tracker) {
        this.facilityDirectory = facilityDirectory;
        this.useMan = useMan;
        this.mainMan = mainMan;
        this.tracker = tracker;
    }

    public List<TimeStamp> getSchedule(String facName){
        return facilityDirectory.get(facName);
    }

    public boolean isInUseDuringInterval(String facName, TimeStamp checkTime){
        List<TimeStamp> querySchedule = getSchedule(facName);
        for(TimeStamp queryTime : querySchedule){
            if(checkTime.doWeOverlap(checkTime)){
                return true;
            }
        }
        return false;
    }
    public void vacateTime(TimeStamp clearingTime, String facName) { // removes an event from futureSchedule if the event is during clearingTime
        List<TimeStamp> schedule = getSchedule(facName);
        for (int i = 0; i < schedule.size(); i++) {
            if (clearingTime.getStartTime().compareTo(schedule.get(i).getStartTime()) >= 0) {
                if (schedule.get(i).getEndTime().compareTo(clearingTime.getEndTime()) <= 0) {
                    schedule.remove(i);
                }
            }
        }
    }

    public void updateManagers(){
        useMan.update(currentDate);
        mainMan.update(currentDate);
    }
    
    public void updateFacilities(Facilities newFac){
        facilityDirectory.put(newFac.getName(), new LinkedList<TimeStamp>());
    }
}
