package fruits_static;

public class fruits {
     int no;
    String name;
    static int  n=0;
    public fruits(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }


    void display(){
        n++;
        System.out.printf("%d\n",no);
        System.out.printf("%s\n",name);


    }
}
