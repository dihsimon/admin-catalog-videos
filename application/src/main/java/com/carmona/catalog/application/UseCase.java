package com.carmona.catalog.application;

import com.carmona.catalog.domain.Category;

public class UseCase {
    public Category execute(){
        return new Category();
    }
}