package app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import app.dao.StudentDAO;
import app.pojo.Student;

@Controller
public class HomeController {
	

	////////////////////////HOME///////////////////////////////////////////////////////
	@RequestMapping(value = "/")
	public ModelAndView home(ModelAndView model) throws IOException {

	    model.setViewName("home");

	    return model;
	}
	//////////////////////READ///////////////////////////////////////////////////////////
	
}
