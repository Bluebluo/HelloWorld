package com.hlo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlo.bean.CourseSection;
import com.hlo.bean.CourseSectionExample;
import com.hlo.bean.CourseSectionExample.Criteria;
import com.hlo.bean.Msg;
import com.hlo.service.SectionManager;

@Controller
public class SectionController {

	
	@Autowired
	SectionManager sectionManager;
	
	@RequestMapping("/sections")
	@ResponseBody
	public Msg getSections() {
		CourseSectionExample sectionExample = new CourseSectionExample();
		Criteria section = sectionExample.createCriteria();
		section.andCourseIdEqualTo(1);
		List<CourseSection> sections = sectionManager.getSomeSections(sectionExample);
		return Msg.success().add("sections", sections);
	}
	
	@RequestMapping("/playVideo")
	public String playVideo(@RequestParam(value="section")String section,Model model) {
		CourseSection section1 = sectionManager.getOneSection(Integer.parseInt(section));
		model.addAttribute("section",section1);
		return "playVideo";
	}
	
	@RequestMapping(value="/moreData/{id}",method=RequestMethod.GET)
	public String moreData(@PathVariable()Integer id) {
		
		return "moreData";
	}
}
