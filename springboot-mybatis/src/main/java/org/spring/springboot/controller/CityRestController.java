package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    /**
     * spring之@RequestParam @RequestBody @PathVariable详解：request数据到handler method 参数数据的绑定所用到的注解及使用情形
     * 1.@PathVariable：处理request uri使用;
     * 2.@RequestParam：用来处理Content-Type为application/x-www-form-urlencoded编码的内容，提交方式为get，post
     * 3.@RequestBody：用来处理Content-Type为application/json,application/xml编码的内容
     */

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/city/findOneCity", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityname", required = true) String cityName) {
        //@RequestParam注解作用：表名表单中传递的参数，去掉该注解的话表单中传递的参数得与接受参数名称一致
        return cityService.findCityByName(cityName);
    }

    @RequestMapping(value = "/city/addCityInfo", method = RequestMethod.POST)
    public Integer addCityInfo(@RequestBody City city) {
        return cityService.addCityInfo(city);
    }

    @RequestMapping(value = "/city/findCityByProvinceId", method = RequestMethod.GET)
    public List<City> findCityByProvinceId(@RequestParam(value = "provinceId", required = true) Integer provinceId) {
        return cityService.findCityByProvinceId(provinceId);
    }

}
