package com.holddie.design.behavior.chainOfResponsibility.concrete;


import com.holddie.design.behavior.chainOfResponsibility.entity.Leave;

/**
 * 团队Leader
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/3 17:02
 */
public class TeamLeader extends AbstractLeader {

    private static final int MAX_LEAVES_CAN_APPROVE = 10;

    @Override
    public void approve(Leave leave) {

        if (leave.getNumberOfDays() < MAX_LEAVES_CAN_APPROVE) {
            String output = String.format(
                    "LeaveId: %d, Days: %d, Approver: %s",
                    leave.getLeaveId(),
                    leave.getNumberOfDays(),
                    "TeamLeader");
            System.out.println(output);
        } else {
            if (nextHandler != null) {
                nextHandler.approve(leave);
            }
        }
    }
}
