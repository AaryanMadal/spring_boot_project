package com.new_project.practice_spring_boot.service.impl;

import com.new_project.practice_spring_boot.exception.CloudVendorNotFoundException;
import com.new_project.practice_spring_boot.model.CloudVendor;
import com.new_project.practice_spring_boot.repository.CloudVendorRepository;
import com.new_project.practice_spring_boot.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository){
        this.cloudVendorRepository=cloudVendorRepository;
    }
    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        this.cloudVendorRepository.save(cloudVendor);
        return "Successfully saved";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        this.cloudVendorRepository.save(cloudVendor);
        return "Successfully updated";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        this.cloudVendorRepository.deleteById(cloudVendorId);
        return "Successfully deleted";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        if(this.cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested vendor not exist");
        return this.cloudVendorRepository.findById(cloudVendorId).get();

    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return this.cloudVendorRepository.findAll();
    }
}
