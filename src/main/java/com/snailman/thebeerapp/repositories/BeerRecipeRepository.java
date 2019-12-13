package com.snailman.thebeerapp.repositories;

import com.snailman.thebeerapp.models.BeerRecipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRecipeRepository extends MongoRepository<BeerRecipe, String> {
}

