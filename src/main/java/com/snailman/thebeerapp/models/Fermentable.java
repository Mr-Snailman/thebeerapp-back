package com.snailman.thebeerapp.models;

import lombok.Data;

@Data
public class Fermentable {
  private String name;
  private int pointsPerGravity;
  private double weight;
  private double efficiency;
}

