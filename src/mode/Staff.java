package mode;

import java.util.HashSet;

//import java.util.HashSet;


/**
 * Staff contains all the information and abilities of a staff.
 * @author Jianuo
 *
 */

public class Staff {
	
	private int staffID;
	private String staffName;
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
	public Staff(int staffID, String staffName, Staff supervisor){
		
			
	}
	
	//
	// getters and setters
	//
	
	public int getStaffID() {
		return staffID;
	}
	
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	
	public String getStaffName() {
		return staffName;
	}
	
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
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
	 * a staff ask for leave
	 * @param staffID 
	 * @param staffName 
	 */
	// public void askForLeave(){
		
	// }
	public void askForLeave(int staffID, String staffName){
		LeaveApplication leaveApplication = new LeaveApplication(staffID, staffName, startDate, endDate);
		staffID = this.staffID;
		staffName = this.staffName;
		startDate = 
		
		
	}
	
	/**
	 * receive 
	 * @param directSupervisor 
	 * @param replyStatus
	 */
	public void receiveApproval(int staffID, boolean replyStatus){
		
	}
	
	/**
	 * receive 
	 * @param staffName  
	 */
	public void receiveLeaveRequest(int staffID, LeaveApplication leaveApplication){
		
	}
	
	/**
	 * 作为上司时使用，给GUI程序调用，用于批准某个下级的请假请求
	 * @param staffId    下级员工的id
	 * @param replyStatus   批准/不批准
	 */
	public void approve(int staffId, boolean replyStatus){
		
	}

}
