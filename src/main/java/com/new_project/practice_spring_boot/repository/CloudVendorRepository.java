package com.new_project.practice_spring_boot.repository;

import com.new_project.practice_spring_boot.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {

}
