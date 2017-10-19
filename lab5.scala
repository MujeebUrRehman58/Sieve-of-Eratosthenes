

object lab5 {
  def main(args: Array[String]){
    print("enter the number to find all the prime numbers till that number: ")
    val listSize = scala.io.StdIn.readInt();
    val _list = List.range(2, listSize+1)
    
    //println("Printing all numbers till "+listSize+".\n"+_list)
    val finalList = primeNums(_list,0)
    //println("final list containing Prime Numbers is:\n"+finalList)
    //unit_test_primeNums()
    println("done..!")
     val listSi = scala.io.StdIn.readInt();
  }
  def primeNums(_list :List[Int], num :Int) :List[Int]={
      val _newList = List.range(_list(num)*2, _list.last+1,_list(num))
      //println("New list: "+_newList)
      val filteredList = _list filterNot (_newList contains)
      //println("Filtered list: "+filteredList)
      if(!(_newList.isEmpty))
        primeNums(filteredList,num+1)
      else
        return filteredList
  }
  def unit_test_primeNums():Boolean ={
    println("Running unit test for n=20.")
    val test_list = List(2, 3, 5, 7, 11, 13, 17, 19)
    val _list = List.range(2, 21)
    if(test_list == primeNums(_list,0)) {
      println("test Passed") 
      true
      }
    else{
      println("tets failed")
      false
    } 
  }
}