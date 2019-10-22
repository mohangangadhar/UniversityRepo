package com.uni.countries.process;

import com.uni.countries.model.Country;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryListProcess {

    private static Map<Long, Country> countries = new HashMap<>();

    public CountryListProcess() {

        Country c1 = new Country(1, "USA");

        Country c2 = new Country(2, "INDIA");

        countries.put((long) 1, c1);
        countries.put((long) 2, c2);

    }

    public Country getCountry(Long id) {

        return countries.get(id);
    }

    public List<Country> getAllCountry() {

        return new ArrayList<Country>(countries.values());
    }

}
