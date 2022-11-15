package com.sda.rares.advanced.recap.ex1.repository;

import com.sda.rares.advanced.recap.ex1.model.Sellable;

import java.util.List;
import java.util.Optional;

public interface SellableRepository<T extends Sellable> {

    void add(T sellable);

    List<T> search(double price);

    void remove(String name);

    Optional<T> get(String name);



}
