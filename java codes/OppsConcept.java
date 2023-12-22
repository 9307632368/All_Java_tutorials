class JrSchool{
    String schoolName;
    int year;
    int rollNo;
}

class School{
    String schoolName;
    int year;
    int rollNo;
}

class JrCollege{
     String clgName;
     int year;
     int rollNo;
}

class college{
    String clgname;
    int  rollNo;
    int year;
}
public class OppsConcept {
    public static void main(String args[]){
        JrSchool jrs=new JrSchool();
        jrs.schoolName="bhartiya vidyaneketan Ashta";
        jrs.rollNo=17;
        System.out.println(jrs.schoolName);
        System.out.println(jrs.rollNo);

        JrSchool jrs1=new JrSchool();
        jrs1.rollNo=4;
        System.out.println(jrs1.rollNo);

        college c=new college();
        c.clgname="sharad institute of technology college of Enginnering";
        c.rollNo=69;
        System.out.println(c.clgname);
        System.out.println(c.rollNo);


    }
}
