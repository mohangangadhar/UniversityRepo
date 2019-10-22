package com.uni.countries.resource;

import com.uni.countries.model.Country;
import com.uni.countries.process.CountryListProcess;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryListResource {

    CountryListProcess countryListProcess = new CountryListProcess();


    @RequestMapping(value="/countries", method= RequestMethod.GET, produces="application/json")
    public List<Country> getCountries() {
        return countryListProcess.getAllCountry();
    }

    @RequestMapping(value="/countries/{countryId}", method= RequestMethod.GET, produces="application/json")
    public Country getCountry(@PathVariable("countryId") Long countryId) {
        return countryListProcess.getCountry(countryId);
    }

}
