package cn.cdu.fang.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.cdu.fang.service.SpotService;
import cn.cdu.fang.service.UserService;
import cn.cdu.fang.vo.SignInVO;
import cn.cdu.fang.web.utill.SessionUtil;


@Controller
@RequestMapping("/admin/spot")
public class SpotsManager {
	
	@Autowired
	SpotService spotService;
	@Autowired
	SessionUtil sessionUtil;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String adminLogin(HttpServletRequest request,Model model){
		model.addAttribute("spotList", spotService.getEntities());
		return "admin/spotInfo";
	}
	

/**		
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String adminLogin(@ModelAttribute("signInVo") @Valid SignInVO signInVo,
			BindingResult result,
			Model model, HttpSession session){
		
		return "";
	}
	
	**/
}
