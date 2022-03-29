public class Course {
    
    private int order;
    private String name;
    private String teacher;
    private int number;
    private int credit;
    private String place;

    public Course( int order, int number, String name, String teacher, int credit, String place ){
        this.order = order;
        this.number = number;
        this.name = name;
        this.teacher = teacher;
        this.credit = credit;
        this.place = place;
    }

    public int getOrder(){
        return order;
    }
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public String getTeacher(){
        return teacher;
    }
    public int getCredit(){
        return credit;
    }
    public String place(){
        return place;
    }

}
