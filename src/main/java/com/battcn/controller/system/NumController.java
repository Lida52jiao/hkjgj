package com.battcn.controller.system;

import com.battcn.util.BigDecimalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.battcn.annotation.SystemLog;
import com.battcn.controller.BaseController;
import com.battcn.entity.AppName;
import com.battcn.entity.MerChantsRate;
import com.battcn.entity.Num;
import com.battcn.entity.NumExample;
import com.battcn.entity.UserEntity;
import com.battcn.service.system.AppNameService;
import com.battcn.service.system.EnjoyService;
import com.battcn.service.system.NumService;
import com.battcn.util.UserEntityUtil;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Num")
public class NumController extends BaseController {
	
	@Autowired
	private NumService numService; 
	@Autowired
	private EnjoyService enjoyService; 
	@Autowired
	private AppNameService appNameService;
	
	@RequestMapping("numList")
	@SystemLog(module = "商户管理", methods = "商户升级模式")
	public String numList(Model model) {
		model.addAttribute("res", findResByUser());
		//model.addAttribute("enjoy", enjoyService.getEnjoy());
		return "/system/num/list";
	}
	@RequestMapping("getNumList")
	@ResponseBody
	public PageInfo<Num> getNumList() {
		UserEntity k=UserEntityUtil.getUserFromSession();

		PageInfo<Num> page = numService.getList();
		return page;
	}

	@RequestMapping("editNum")
	public String editNum(Model model,Long id) {
		Num num = numService.getNum(id);
		model.addAttribute("num", num);
		return "/system/num/editNum";
	}

	@RequestMapping(value="alert",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String alert(Long id, double num, Long validtime, double visitor, double vip, double highvip, double channel, double agent, double area, double institution) {
		Num record = new Num();
		record.setId(id);
		record.setNum(BigDecimalUtil.round(BigDecimalUtil.mul(num,100D),0).longValue());
		record.setValidtime(validtime);
		record.setVisitor(BigDecimalUtil.round(BigDecimalUtil.mul(visitor,100D),0).longValue());
		record.setVip(BigDecimalUtil.round(BigDecimalUtil.mul(vip,100D),0).longValue());
		record.setHighvip(BigDecimalUtil.round(BigDecimalUtil.mul(highvip,100D),0).longValue());
		record.setChannel(BigDecimalUtil.round(BigDecimalUtil.mul(channel,100D),0).longValue());
		record.setAgent(BigDecimalUtil.round(BigDecimalUtil.mul(agent,100D),0).longValue());
		record.setArea(BigDecimalUtil.round(BigDecimalUtil.mul(area,100D),0).longValue());
		record.setInstitution(BigDecimalUtil.round(BigDecimalUtil.mul(institution,100D),0).longValue());
		Integer count = numService.editNum(record);
		if(count == 1){
			return "修改成功！！";
		}
		return "修改失败！！！";
	}
	@RequestMapping("numTList")
	@SystemLog(module = "商户管理", methods = "app使用费")
	public String numAppTList(Model model) {
		model.addAttribute("res", findResByUser());
		model.addAttribute("enjoy", enjoyService.getEnjoy());
		return "/system/num/appUseList";
	}
	@RequestMapping("getNumTList")
	@ResponseBody
	public PageInfo<Num> getNumAppTList() {
		UserEntity k=UserEntityUtil.getUserFromSession();
		NumExample example = new NumExample();
		example.or().andViptypeEqualTo("T");
		PageInfo<Num> page = numService.getList();
		return page;
	}

	@RequestMapping("editNumT")
	public String editNumApp(Model model,Long id) {
		model.addAttribute("num", numService.getNum(id));
		return "/system/num/appEditNum";
	}

	@RequestMapping(value="alertT",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String alertAppT(Num num) {
		Integer count = numService.editNum(num);
		if(count == 1){
			return "修改成功！！";
		}
		return "修改失败！！！";
	}
	
}
