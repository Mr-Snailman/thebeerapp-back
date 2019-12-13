package com.snailman.thebeerapp.controllers;

import com.snailman.thebeerapp.models.BeerRecipe;
import com.snailman.thebeerapp.repositories.BeerRecipeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/recipes")
@RestController
public class BeerRecipeController {

  @Autowired
  private BeerRecipeRepository beerRecipeRepository;

  @GetMapping
  public ResponseEntity<List<BeerRecipe>> getAll() {
    return ResponseEntity.ok(this.beerRecipeRepository.findAll());
  }
}

