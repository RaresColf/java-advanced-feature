package com.sda.rares.advanced.recap.ex1.repository;

import com.sda.rares.advanced.recap.ex1.model.Sellable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SellableRepositoryImpl<T extends Sellable> implements SellableRepository<T>{

    private Map<String , T> sellableByName = new HashMap<>();


    @Override
    public void add(T sellable) {
        sellableByName.put(sellable.getName(), sellable);
    }

    @Override
    public List<T> search(double price) {
        return sellableByName.values()
                .stream()
                .filter(sellable ->sellable.getPrice() == price)
                .collect(Collectors.toList());

    }

    @Override
    public void remove(String name) {
        sellableByName.remove(name);

    }

    @Override
    public Optional<T> get(String name) {
        return Optional.ofNullable(sellableByName.get(name)); // imbrac rez din map in optional
    }
}
