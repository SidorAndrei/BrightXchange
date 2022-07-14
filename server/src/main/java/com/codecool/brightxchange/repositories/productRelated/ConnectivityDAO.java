package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.Connectivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectivityDAO extends JpaRepository<Connectivity, Long> {
}