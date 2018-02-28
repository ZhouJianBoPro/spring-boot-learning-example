package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;

import java.util.List;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityDao {

    /**
     * 方法名要与mapper中的映射对应
     */
    City findByName(String cityName);

    Integer insert(City city);

    List<City> findByProvinceId(Integer provinceId);
}
