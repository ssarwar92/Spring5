package com.gs.spring5.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

  @Autowired
  private   SortAlgorithms   sortAlgorithms;

  public int binarySearch(int[] numbers,int givenNumber)
  {
    //sort the array
    sortAlgorithms.sort(numbers);
    System.out.println(sortAlgorithms);
    //search the given number
    //return the index
    return 3;
  }

}
