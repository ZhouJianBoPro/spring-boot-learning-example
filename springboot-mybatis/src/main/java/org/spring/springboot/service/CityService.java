package org.spring.springboot.service;

import org.spring.springboot.domain.City;

import java.util.List;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);

    /**
     * 保存城市信息
     * @param city
     * @return Integer
     */
    Integer addCityInfo(City city);

    /**
     * 根据provinceId查询城市信息
     * @param provinceId
     * @return 城市列表
     */
    List<City> findCityByProvinceId(Integer provinceId);
}
