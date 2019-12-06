package it.unisa.C9Tutorial.sites.controller;

import it.unisa.C9Tutorial.sites.domain.Site;
import it.unisa.C9Tutorial.sites.services.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class SiteController {

    @Autowired
    private SiteService service;

    @GetMapping("/sites")
    public String getAllSites(Model model){
        List<Site> allSites = service.findAllSites();
        model.addAttribute("sites",allSites);
        return "sites/sites-list";
    }
    @GetMapping("/sites/{id}")
    public String getSiteDetail(@PathVariable(name = "id") Long siteId, Model model){
        Optional<Site> site = service.getSiteDetail(siteId);
        model.addAttribute("site",site);
        return "sites/site-detail";
    }

}
