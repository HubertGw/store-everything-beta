package com.capybara.storeeverythinggamma.controller;

import com.capybara.storeeverythinggamma.model.Category;
import com.capybara.storeeverythinggamma.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public String getCategories(Model model) {
        model.addAttribute("categories", categoryService.getCategories());
        return "categories";
    }

    @GetMapping("/onecategory")
    @ResponseBody
    public Optional<Category> getCategoryById(Integer id, Model model) {
        return categoryService.getCategoryById(id);
    }

    @RequestMapping(value="/saveCategory", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
    public String updateCategory(Category category){
        categoryService.updateCategory(category);
        return "redirect:/categories";
    }

    @RequestMapping(value="addNewCategory", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
    public String addCategory(Category category) {
        categoryService.addCategory(category);
        return "redirect:/categories";
    }

    @RequestMapping(value="deleteCategory", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
    public String deleteCategory(Integer id) {
        categoryService.deleteCategory(id);
        return "redirect:/categories";
    }
}
