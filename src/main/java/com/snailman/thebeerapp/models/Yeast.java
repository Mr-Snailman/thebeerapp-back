package com.snailman.thebeerapp.models;

import java.time.Instant;
import lombok.Data;

@Data
public class Yeast {
  private String name;
  private double attenuation;
  private long cellCount;
  private int generation;
  private Instant bestByDate;
}

