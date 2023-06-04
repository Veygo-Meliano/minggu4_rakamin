package com.miniProject.aeonService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.miniProject.aeonService.model.Karyawan;
import com.miniProject.aeonService.service.IKaryawanService;

@RestController
public class KaryawanController {
	
	@Autowired
	private IKaryawanService karyawanService;
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
//	}
	
	@RequestMapping(value = "/v1/karyawan/list", method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam Long id, ModelMap model) {
		model.put("karyawan", karyawanService.getAllKaryawan());
        return "karyawan";
    }
	
	@RequestMapping(value = "/v1/karyawan", method = RequestMethod.GET)
    public String showAddTodoPage(ModelMap model) {
        model.addAttribute("karyawan", new Karyawan());
        return "karyawan-tambah";
    }

//    @RequestMapping(value = "/v1/karyawanHapus", method = RequestMethod.GET)
//    public String deleteKarywan(@RequestParam long id) {
//        karyawanService.deleteKaryawan(id);
//        // service.deleteTodo(id);
//        return "redirect:/list-todos";
//    }
	
}
