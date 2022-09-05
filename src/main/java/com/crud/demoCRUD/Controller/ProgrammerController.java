package com.crud.demoCRUD.Controller;

import com.crud.demoCRUD.Model.Programmer;
import com.crud.demoCRUD.Service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProgrammerController {

    private final ProgrammerService programmerService;

    @Autowired
    public ProgrammerController(ProgrammerService programmerService) {
        this.programmerService = programmerService;
    }

    @GetMapping("/PROGRAMMERS")
    public String findAll(Model model){
        List<Programmer> programmers = programmerService.findAll();
        model.addAttribute("programmers", programmers);
        return "programmer-list";
    }

    @GetMapping("/programmer-create")
    public String createProgrammerForm(Programmer programmer){
        return "programmer-create";
    }

    @PostMapping("/programmer-create")
    public String createProgrammer(Programmer programmer){
        programmerService.saveProgrammer(programmer);
        return "redirect:/PROGRAMMERS";
    }

    @GetMapping("programmer-delete/{id}")
    public String deleteProgrammer(@PathVariable("id") Long id){
        programmerService.deleteById(id);
        return "redirect:/PROGRAMMERS";
    }

    @GetMapping("/prgrammer-update/{id}")
    public String updateProgrammerForm(@PathVariable("id") Long id, Model model){
        Programmer programmer = programmerService.findById(id);
        model.addAttribute("programmer", programmer);
        return "programmer-update";
    }

    @PostMapping("/programmer-update")
    public String updateProgrammer(Programmer programmer){
        programmerService.saveProgrammer(programmer);
        return "redirect:/PROGRAMMERS";
    }
}
