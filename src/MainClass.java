import java.util.List;

public class MainClass extends Thread{

    public  static void main(String arg[]){

        Runnable run=()->{
            RunnableImplUsingLambdaExpression obj=new RunnableImplUsingLambdaExpression()   ;
            obj.table5();
        };
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        t1.start();
        t2.start();

        ComparatorImplUsingLambdaExpression sort=new ComparatorImplUsingLambdaExpression();
       List<Student>  sorted= sort.sort();
        System.out.println(sorted);
    }


}
/*
No Need to create this boiler plate, we can implement using lambda expression
class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("Child Thread");
    }
}
*/
