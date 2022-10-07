import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorImplUsingLambdaExpression {

    List<Student> obj=new ArrayList<>();

    public List<Student> sort(){
        obj.add(new Student(1,"Sumit",1000.00));
        obj.add(new Student(2,"Tumit",5000.00));
        obj.add(new Student(3,"Uumit",10000.00));
        obj.add(new Student(4,"Vumit",100.00));
        obj.add(new Student(5,"Mumit",1900.00));

 /*       Collections.sort(); -> It take two argument , list and other is Comparator objetct
                Sinec Comparator is a functional inerface, It has only one abstract method " compare()"
                So we can implement using lambda expression */

        Collections.sort(obj,(v1,v2)->{
          return  v1.getMarks()>v2.getMarks()? 1 :(v1.getMarks()==v2.getMarks()?0:-1);
        });
        return obj;
    }


}
