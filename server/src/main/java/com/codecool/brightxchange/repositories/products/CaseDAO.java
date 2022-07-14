package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.products.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseDAO extends JpaRepository<Case, Long> {
}