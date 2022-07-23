package com.optimagrowth.license.repository;

import com.optimagrowth.license.model.Organization;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableRedisRepositories
public interface OrganizationRedisRepository extends CrudRepository<Organization,String> {
}
