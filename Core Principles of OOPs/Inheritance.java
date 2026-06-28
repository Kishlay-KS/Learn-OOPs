class Employee {
    private String name;
    private Integer id;

    public Employee(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public Integer getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Id : " + this.id);
    }
}

class Manager extends Employee {
    private Integer teamSize;

    public Manager(String name, Integer id, Integer teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }
    public Integer getTeamSize() {
        return this.teamSize;
    }
    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : " + this.teamSize);
    }
}

class Engineer extends Employee {
    private String specialization;

    public Engineer(String name, Integer id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return this.specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization : " + this.specialization);
    }
}