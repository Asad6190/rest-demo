package com.emp.restdemo.controller;


import com.emp.restdemo.entity.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class VendorController {

    CloudVendor cloudVendor;


    @GetMapping("{vendorId}")
    public CloudVendor cloudVendorDetails(String vendorId) {
        return cloudVendor;
//        new CloudVendor("C1", "Vendor 1", "Address 1", "xxxx");
    }


    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud vendor updated Successfully";
    }

   @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable String vendorId) {
        this.cloudVendor = null;
        return "Cloud vendor deleted successfully";
   }


}
