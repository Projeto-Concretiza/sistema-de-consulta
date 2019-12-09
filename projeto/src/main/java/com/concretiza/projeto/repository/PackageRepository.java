package com.concretiza.projeto.repository;

import com.concretiza.projeto.model.Packages.Package;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PackageRepository extends JpaRepository<Package, Long> {

    List<Package> findPackageByCategoryContaining(String category);

}
