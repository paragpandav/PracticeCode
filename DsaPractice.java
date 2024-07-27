import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DsaPractice
{
  public static void main(String[] args) 
  {
    List<Integer> mylist=Arrays.asList(10,8,4,6,2,7,9,1,17,28,10,8,4,6,2,7,9,1,17,28);
    String input = "Java Hungry Blog Alive is Awesome";

    //Q1 Given a list of integers, find out all the even numbers exist in the list using Stream functions?
    // mylist.stream().filter(n->n%2==0).forEach(System.out::println);

    //Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    //mylist.stream().filter(n->(n/10==1 ||n==1 )).forEach(System.out::println);

    //Q3 How to find duplicate elements in a given integers list in java using Stream functions?
    //mylist.stream().filter(i->mylist.stream().filter(x->x.equals(i)).count()>1).distinct().collect(Collectors.toList()).forEach(System.out::println);

    //Q3.1 How to find duplicate elements and their count in a given integers list in java using Stream functions?
    // Map<Integer, Long> countMap = mylist.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
    // System.out.println(countMap);

    //Q4 Given the list of integers, find the first element of the list using Stream functions?
    //System.out.println(mylist.stream().findFirst().get());

    //Q5 Given a list of integers, find the total number of elements present in the list using Stream functions?
    //System.out.println(mylist.stream().count());

    //Q6 Given a list of integers, find the maximum value element present in it using Stream functions?
    //System.out.println(mylist.stream().max(Integer::compare));

    //Q7 Given a String, find the first non-repeated character in it using Stream functions?
    
    //Q9 Given a list of integers, sort all the values present in it using Stream functions?
    //mylist.stream().sorted().forEach(System.out::println);

    //Q10 Given a list of integers, sort all the values present in it in descending order using Stream functions?
    mylist.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

  }
}