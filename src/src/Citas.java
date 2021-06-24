public class Citas {

    public Citas(String apptID, String apptDate, String apptTime, String apptRsn) {
        ApptID = apptID;
        ApptDate = apptDate;
        ApptTime = apptTime;
        ApptRsn = apptRsn;
    }

    private String ApptID;
    private String ApptDate;
    private String ApptTime;
    private String ApptRsn;

    public Citas() {

    }

    public String getApptID() { return ApptID; }
    public String getApptDate() { return ApptDate; }
    public String getApptTime() { return ApptTime; }
    public String getApptRsn() { return ApptRsn; }

    public void setApptDate(String apptDate) { ApptDate = apptDate; }
    public void setApptTime(String apptTime) { ApptTime = apptTime; }
    public void setApptRsn(String apptRsn) { ApptRsn = apptRsn; }
    public void setApptID(String apptID) { ApptID = apptID; }


}
