package com.gs.spring5.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

  /*@Autowired
  private   SortAlgorithms   bubbleShortAlgorithm;*/

  @Autowired
  @Qualifier("quick")
  private   SortAlgorithms algorithms;

  public int binarySearch(int[] numbers,int givenNumber)
  {
    //sort the array
    algorithms.sort(numbers);
    System.out.println(algorithms);
    //search the given number
    //return the index
    return 3;
  }

}
