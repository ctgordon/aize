package com.aize.b_collections.persistence.dao;

import com.aize.b_collections.persistence.model.TypeC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCRepository extends JpaRepository<TypeC, Long> {
}
