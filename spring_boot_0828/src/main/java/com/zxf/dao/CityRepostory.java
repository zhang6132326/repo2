package com.zxf.dao;

import com.zxf.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepostory  extends JpaRepository<City,Integer> {
}
