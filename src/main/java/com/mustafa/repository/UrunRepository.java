package com.mustafa.repository;

import com.mustafa.entity.Urun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UrunRepository extends JpaRepository<Urun, Long> {
}
