package com.lin.common.job.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobConfigRepository extends JpaRepository<JobConfig, Long> {
}