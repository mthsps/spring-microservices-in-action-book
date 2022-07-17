package com.optimagrowth.license.repository;

import com.optimagrowth.license.model.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenseRepository extends CrudRepository<License, String> {

    public List<License> findByOrganizationId(String organizationID);

    public License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);
}
