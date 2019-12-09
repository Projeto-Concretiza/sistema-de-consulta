package com.concretiza.projeto.api;


import com.concretiza.projeto.model.Packages.Package;
import com.concretiza.projeto.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class PackageResource {

    @Autowired
    PackageRepository packageRepository;

    @GetMapping("/packages/{category}")
    public List<Package> recomendaditon(@PathVariable(value = "category") String category){
        return packageRepository.findPackageByCategoryContaining(category);
    }


}
