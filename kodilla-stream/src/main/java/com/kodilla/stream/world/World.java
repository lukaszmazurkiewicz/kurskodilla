package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    List<Continent> continents = new ArrayList<>();

    public List<Continent> continents() {

        continents.add(new Continent("Europe"));
        continents.add(new Continent("Africa"));
        continents.add(new Continent("Asia"));

        continents.get(0).addCountryToContinent(new Country("Italy", new BigDecimal("111111111")));
        continents.get(0).addCountryToContinent(new Country("Poland", new BigDecimal("222222222")));
        continents.get(0).addCountryToContinent(new Country("Germany", new BigDecimal("333333333")));

        continents.get(1).addCountryToContinent((new Country("Nigeria", new BigDecimal("111111111"))));
        continents.get(1).addCountryToContinent((new Country("Egypt", new BigDecimal("222222222"))));
        continents.get(1).addCountryToContinent((new Country("Morocco", new BigDecimal("333333333"))));

        continents.get(2).addCountryToContinent((new Country("China", new BigDecimal("111111111"))));
        continents.get(2).addCountryToContinent((new Country("Japan", new BigDecimal("222222222"))));
        continents.get(2).addCountryToContinent((new Country("India", new BigDecimal("333333333"))));

        return continents;
    }

    public BigDecimal getPeopleQuantity() {
         BigDecimal totalQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

         return totalQuantity;
    }
}
