package com.gs.spring5.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickShortAlgorithm implements  SortAlgorithms
{
  public int[] sort(int[] numbers){
    return numbers ;
  }
}
