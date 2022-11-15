package com.sda.rares.advanced.recap.ex1.model;

public enum CustomerState {
    NEW("New",false),
    ACTIVE("Active",true),
    CLOSED("Closed",false),
    BANNED("Banned",false);

    private final String displayName;

    private final boolean isShoppingAllowed;

    CustomerState(String displayName, boolean isShoppingAllowed) {
        this.displayName = displayName;
        this.isShoppingAllowed = isShoppingAllowed;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
