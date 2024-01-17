package com.mustafa.repository;

import com.mustafa.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Long> {
}
