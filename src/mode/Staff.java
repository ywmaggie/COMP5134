package mode;

/**
 * This is the class for staff
 * @author Jianuo
 *
 */

public class Staff {
	
	private String staffName;
	private String directSupervisor;
	
	/**
	 * Constructor
	 * @param staffname is the staff's name
	 * @param directSupervisor is the name of that staff's supervisor
	 */
	public Staff(String staffName, String directSupervisor){
			
	}
	
	public String getStaffname() {
		return staffName;
	}
	
	public String getDirectSupervisor() {
		return directSupervisor;
	}
	
	
	// 
	//all the functions
	//
	
	/**
	 * a staff ask for leave
	 */
	public void askForLeave(){
		LeaveApplication leaveApplication = new LeaveApplication();
		
		
	}
	
	/**
	 * receive 
	 * @param directSupervisor 
	 * @param replyStatus
	 */
	public void receiveApproval(String directSupervisor, boolean replyStatus){
		
	}
	
	/**
	 * receive 
	 * @param staffName  
	 */
	public void receiveLeaveRequest(String staffName){
		
	}
	
	/**
	 * 作为上司时使用，给GUI程序调用，用于批准某个下级的请假请求
	 * @param staffId    下级员工的id
	 * @param replyStatus   批准/不批准
	 */
	public void approve(int staffId, boolean replyStatus){
		
	}

}
