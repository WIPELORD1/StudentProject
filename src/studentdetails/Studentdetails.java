package studentdetails;

/**
 * store and print student details
 *
 * @author Aarsh Gupta
 */
public class Studentdetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       //store and print 3 student details
        Student[] list = new Student[3];
        Student s1=new Student();//object s1 created
        Student s2=new Student();
        Student s3=new Student();
        s1.setName("aarsh");
        s1.setSid(123);
        s2.setName("laalu");
        s2.setSid(124);
        s3.setName("jalal");
        s3.setSid(125);
       //store object in array - array of objects
       list[0]=s1;
       list[1]=s2;
       list[2]=s3;
       for(int i=0;i<=2;i++){
           System.out.println(list[i].getName()+" "+list[i].getSid());
       }
    }

}
