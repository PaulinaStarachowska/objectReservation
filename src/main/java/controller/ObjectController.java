package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ObjectService;

@Controller
@RequestMapping("/object")
public class ObjectController {
    private final ObjectService objectService;

    public ObjectController(ObjectService objectService) {
        this.objectService = objectService;
    }

    @GetMapping("/{objectId}")
    public ModelAndView objectPage(@PathVariable Integer objectId) {
        ModelAndView modelAndView = new ModelAndView("object_page");
        modelAndView.addObject("object", objectService.getById(objectId));
        return modelAndView;
    }

    @GetMapping("/addObject")
    public String addObject(Model model) {
        model.addAttribute("object", new Object());
        return "object_form";

    }

    @PostMapping("/addObject")
    public String addObject(@ModelAttribute Object object) {
        objectService.save(object);
        return "redirect:/object/all";

    }

    @GetMapping("/delete")
    public String deleteObject(Model model) {
        model.addAttribute("id", new String());
        return "/object_remove";
    }

    @PostMapping("/delete")
    public String deletedObject(@RequestParam("id") Integer id) {
        objectService.delete(id);
        return "redirect:/object/all";
    }

    @GetMapping("/all")
    public ModelAndView objectList() {
        ModelAndView modelAndView = new ModelAndView("object-list");
        modelAndView.addObject("object", objectService.getAllDto());
        return modelAndView;
    }

    @GetMapping("/object/{objectId}")
    public ModelAndView objectDetails(@PathVariable Integer objectId) {
        ModelAndView modelAndView = new ModelAndView("object-details");
        modelAndView.addObject("object", objectService.getById(objectId));
        return modelAndView;
    }
}



