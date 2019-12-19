package com.snailman.thebeerapp.controllers;

import com.snailman.thebeerapp.models.BeerRecipe;
import com.snailman.thebeerapp.repositories.BeerRecipeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @GetMapping("/{id}")
  public ResponseEntity<BeerRecipe> getOne(@PathVariable("id") String id) {
    Assert.hasText(id, "ID must not be empty!");
    return ResponseEntity.of(this.beerRecipeRepository.findById(id));
  }

  @PostMapping
  public ResponseEntity<BeerRecipe> create(@RequestBody BeerRecipe beerRecipe) {
    Assert.notNull(beerRecipe, "Recipe must not be null!");
    return ResponseEntity.ok(this.beerRecipeRepository.insert(beerRecipe));
  }

  @PutMapping("/{id}")
  public ResponseEntity<BeerRecipe> update(@PathVariable("id") String id, @RequestBody BeerRecipe beerRecipe) {
    Assert.notNull(beerRecipe, "Recipe must not be null!");
    Assert.hasText(id, "ID must not be empty!");
    beerRecipe.setId(id);
    return ResponseEntity.ok(this.beerRecipeRepository.save(beerRecipe));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable("id") String id) {
    Assert.hasText(id, "ID must not be empty!");
    this.beerRecipeRepository.deleteById(id);
    return ResponseEntity.ok().build();
  }
}

