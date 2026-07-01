class College{
    public String id;
    public String name;

    public College(String name,String id){
        this.name = name;
        this.id = id;
    }
}
class University{
    private String name;
    private List<College> colleges;

    public University(String name){
        this.name = name;
        this.colleges = new ArrayList<>();
    }
    public void addCollege(String collegeName, String collegeId){
        College c = new College(collegeName, collegeId);
        colleges.add(c);
    }
    public void displayDetails(){
        System.out.println("University Name : "+name);
        for(College c : colleges){
            System.out.println("College Name : "+c.name);
            System.out.println("College ID : "+c.id);
        }
    }

}