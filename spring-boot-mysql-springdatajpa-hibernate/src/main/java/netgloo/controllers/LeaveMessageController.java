package netgloo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import netgloo.models.LeaveMessage;
import netgloo.models.LeaveMessageDao;

@Controller
public class LeaveMessageController {
	@Autowired
	private LeaveMessageDao leaveMessageDao;

	@RequestMapping(value="/leaveMessages", method=RequestMethod.POST)
	public String greeting(LeaveMessage leaveMessage) {
		leaveMessageDao.save(leaveMessage);

		return "redirect:/";
	}
}
