package com.snailman.thebeerapp.models;

import lombok.Data;
import java.util.List;

@Data
public class BeerRecipe {
  private String id;
  private String name;
  private List<Fermentable> fermentables;
  private List<Fermentable> adjuncts;
  private List<Hop> hops;
  private List<Yeast> yeast;
  private List<String> extras;
  private List<String> method;
}

