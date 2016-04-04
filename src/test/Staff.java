package test;

import java.util.HashSet;

public class Staff {
	private int staffId;
	private int staffName;
	private int directSupervisor;
	
	private HashSet<Integer> waitingReplyOfSupervisors;
	private HashSet<Integer> waitingDescendents;
	
	/**
	 * Constructor
	 * @param staffId
	 * @param staffName
	 * @param directSupervisor
	 */
	public Staff(int staffId, int staffName, int directSupervisor){
		waitingDescendents = new HashSet<>();
		waitingReplyOfSupervisors = new HashSet<>();
	}
	
	//
	// Getters and setters
	//
	public int getStaffId() {
		return staffId;
	}

	public int getStaffName() {
		return staffName;
	}

	public int getDirectSupervisor() {
		return directSupervisor;
	}

	//
	// All the functions
	//
	
	/**
	 * 自己想请假
	 */
	public void askForLeave(){
		
	}
	
	/**
	 * 收到上级的回复
	 * @param staffId       上司的staffid
	 * @param replyStatus   回复，true -> 批准， false -> 拒绝
	 */
	public void receiveApproval(int staffId, boolean replyStatus){
		
	}
	
	/**
	 * 收到下级的请假
	 * @param staffId  下级员工的id
	 */
	public void receiveLeaveRequest(int staffId){
		
	}
	
	/**
	 * 作为上司时使用，给GUI程序调用，用于批准某个下级的请假请求
	 * @param staffId    下级员工的id
	 * @param replyStatus   批准/不批准
	 */
	public void approve(int staffId, boolean replyStatus){
		
	}
	
	
	
	//
	// You may need more functions to work with your gui applications
	//
	
	// eg.
	
	private void notifyAllSupervisors(){
		
	}
}




