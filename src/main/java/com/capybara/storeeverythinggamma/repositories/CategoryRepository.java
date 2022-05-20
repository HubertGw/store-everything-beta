package com.capybara.storeeverythinggamma.repositories;

import com.capybara.storeeverythinggamma.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
