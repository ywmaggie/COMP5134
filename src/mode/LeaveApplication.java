package mode;

/**
 * This class contains the leave application information
 * @author Jianuo
 */

public class LeaveApplication {

	String staffId;
    String startDate;
    String endDate;

	/**
	 * 
	 * @param staffID
	 * @param staffName
	 * @param startDate
	 * @param endDate
	 */
	public LeaveApplication (String staffId,
			String startDate, String endDate) {
		this.staffId = staffId;
        this.startDate = startDate;
        this.endDate = endDate;
		
	}

}
