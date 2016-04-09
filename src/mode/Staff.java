package mode;

import view.AskForLeaveFrame;

import javax.swing.JOptionPane;

//import java.util.HashSet;


/**
 * Staff contains all the information and abilities of a staff.
 * @author Jianuo
 *
 */

public class Staff {
	
	public String staffID;
	//private String staffName;
	//private int directSupervisor;
		
	//private HashSet<Integer> waitingReplyOfSupervisors;
	//private HashSet<Integer> waitingDescendents;
	
	public Staff supervisor;
    public AskForLeaveFrame frame;
	
	/**
	 * Constructor for a new staff.
	 * @param staffID is the ID number of the staff.
	 * @param staffName is the name of the staff.
	 * @param supervisor is the supervisor of the staff.
	 */
	
	public Staff(String staffID, Staff supervisor){
		this.staffID = staffID;
        this.supervisor = supervisor;
	}

    public void setFrame(AskForLeaveFrame frame){
        this.frame = frame;
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
	public boolean askForLeave(LeaveApplication leaveApplication){
		return supervisor.receiveLeaveRequest(leaveApplication);
	}
	

	
	/**
	 * 作为上级时使用，收到staffID下级的leaveApplication 
	 * @param staffID 申请外出的下级
	 * @param leaveApplication staffID下级的外出申请
	 */
	public boolean receiveLeaveRequest(LeaveApplication leaveApplication){
        int dialogButton = JOptionPane.YES_NO_OPTION;
        String message = leaveApplication.staffId + " asks leave from " + leaveApplication.startDate + " to " + leaveApplication.endDate;
        int dialogResult = JOptionPane.showConfirmDialog (frame, message,"Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION) {
            if(supervisor != null)
                return askForLeave(leaveApplication);
            else
                return true;
        }
        else{
            return false;
        }
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
		if(replyStatus) {
			//此处希望呼叫到staff的LeaveApplicationWindow,而且这个dialog总感觉应该写在LeaveApplicationWindow里面
//			JOptionPane.showMessageDialog(LeaveApplicationWindow(staffID),"Your application has been approved.");
		} else {
//			JOptionPane.showMessageDialog(LeaveApplicationWindow(staffID),"Your application has been rejected by "
//		+ supervisor.getStaffID() + " .");
		} 
		
	}
	
	//
	// You may need more functions to work with your gui applications
	//
	
	// eg.
	
	private void notifyAllSupervisors(){
		
	}

}
