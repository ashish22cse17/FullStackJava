enum Status{
    Running(200),Failed(14),Pending(78);
    private int time;

    private Status(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

}
public class enuminjava {
    
    public static void main(String[] args) {
        Status u=Status.Running;
        System.out.println(u.getTime());
        if(u==Status.Running){
            System.out.println("keep going");
        }
        System.out.println(u);
         
        Status[] ss=Status.values();
        for (Status status : ss) {
            System.out.println(status+" "+status.ordinal());
        }
    }
    
}
