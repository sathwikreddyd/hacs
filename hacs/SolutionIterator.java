package hacs;

import java.util.Iterator;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class SolutionIterator implements Iterator<Solution>
{
  SolutionList solutionlist;

  ///  CurrentSolutionNumber: point to the location before the first element
  int CurrentSolutionNumber=-1;

  public SolutionIterator(SolutionList thesolutionlist)
  {
    solutionlist=thesolutionlist;
    MoveToHead();
  }

  public void MoveToHead()
  {
  ///  CurrentSolutionNumber: point to the location before the first element
    CurrentSolutionNumber=-1;
  }

  /**@todo: Implement this java.util.Iterator method*/
  public boolean hasNext()
  {
    return CurrentSolutionNumber < solutionlist.size() - 1;
//    throw new java.lang.UnsupportedOperationException("Method hasNext() not yet implemented.");
  }

  /**@todo: Implement this java.util.Iterator method*/
  public Solution next()
  {
    if (hasNext())
    {
      CurrentSolutionNumber ++;
      return solutionlist.get(CurrentSolutionNumber);
    }
    else
    {
      return null;
    }
    //    throw new java.lang.UnsupportedOperationException("Method next() not yet implemented.");
  }

  /// get the next Solution that fits the Username;
  public Object next(String UserName)
  {
    Solution theSolution;
    theSolution= next();
    while(theSolution!=null)
    {
      if(UserName.compareTo(theSolution.theAuthor)==0)
      {
        return theSolution;
      }
      theSolution= next();
    }
    return null;
  }

  /**@todo: Implement this java.util.Iterator method*/
  public void remove()
  {
    solutionlist.remove(CurrentSolutionNumber);
//    throw new java.lang.UnsupportedOperationException("Method remove() not yet implemented.");
  }


}