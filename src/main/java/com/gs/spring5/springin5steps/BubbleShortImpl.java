package com.gs.spring5.springin5steps;


import org.springframework.stereotype.Component;

@Component
public class BubbleShortImpl implements  SortAlgorithms{

  public int[] sort(int[] numbers){
    return numbers ;
  }
}
