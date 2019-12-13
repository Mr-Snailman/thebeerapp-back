package com.snailman.thebeerapp.models;

import java.time.LocalTime;
import java.util.List;
import lombok.Data;

@Data
public class Hop {
  private String name;
  private List<String> flavors;
  private double alphaAcids;
  private double betaAcids;
  private double weight;
  private LocalTime boilTime;
}

