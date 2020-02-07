package pg10Q;
//page no 91 ka X wla question::
interface DONE
{
    void job();
}
class JOB{
    int a = 9;
    void Job()
    {
        System.out.println("Job is to print :"+a);
    }
}
public class WORK extends JOB implements DONE {
   public void job(){
        System.out.println("Job is getting done :::");
    }

    public static void main(String[] args) {
    WORK w = new WORK();
    w.job();
    w.Job();
    }
}
