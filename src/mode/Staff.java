package mode;

//import java.util.HashSet;


/**
 * Staff contains all the information and abilities of a staff.
 * @author Jianuo
 *
 */

public class Staff {
	
	private String staffID;
	//private String staffName;
	//private int directSupervisor;
		
	//private HashSet<Integer> waitingReplyOfSupervisors;
	//private HashSet<Integer> waitingDescendents;
	
	private Staff supervisor;
	
	/**
	 * Constructor for a new staff.
	 * @param staffID is the ID number of the staff.
	 * @param staffName is the name of the staff.
	 * @param supervisor is the supervisor of the staff.
	 */
	
	// public Staff(int staffId, int staffName, int directSupervisor){
	// 	waitingDescendents = new HashSet<>();
	//	waitingReplyOfSupervisors = new HashSet<>();
	// }
	public Staff(String staffID, //String staffName,
			Staff supervisor){
		
			
	}
	
	//
	// getters and setters
	//
	
	public String getStaffID() {
		return staffID;
	}
	
	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}
	
	//public String getStaffName() {
	//	return staffName;
	//}
	
	//public void setStaffName(String staffName) {
	//	this.staffName = staffName;
	//}
	
	public Staff getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Staff supervisor) {
		this.supervisor = supervisor;
	}
	
	// 
	//all the functions
	//
	
	/**
	 * 作为下级时使用，申请外出
	 * @param staffID 申请外出的下级的ID
	 * @param startDate 申请外出的开始日期
	 * @param endDate 申请外出的结束日期 
	 */
	// public void askForLeave(){
		
	// }
	public void askForLeave(String staffID, //String staffName, 
			String startDate, String endDate){
		LeaveApplication leaveApplication = new LeaveApplication(staffID, //staffName, 
				startDate, endDate);
		
	}
	

	
	/**
	 * 作为上级时使用，收到staffID下级的leaveApplication 
	 * @param staffID 申请外出的下级
	 * @param leaveApplication staffID下级的外出申请
	 */
	public void receiveLeaveRequest(String staffID, LeaveApplication leaveApplication){
		
	}
	
	/**
	 * 作为上司时使用，给GUI程序调用，用于批准某个下级的请假请求
	 * @param staffId    下级员工的id
	 * @param replyStatus   批准/不批准
	 */
	public void approve(String staffId, boolean replyStatus){
		
	}
	
	/**
	 * 作为下级时使用 
	 * @param staffID 批准／不批准 的上级的staffID 
	 * @param replyStatus 回复：true--->批准, false--->不批准
	 */
	public void receiveApproval(String staffID, boolean replyStatus){
		
	}
	
	//
	// You may need more functions to work with your gui applications
	//
	
	// eg.
	
	private void notifyAllSupervisors(){
		
	}

}
