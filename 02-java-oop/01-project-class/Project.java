
class Project {
    private String name;
    private String desc;

//create instance method 
    public String elevatorPitch() {
        name = "Java";
        desc = "Most popular prog lang";
        return this.name + " : " + this.desc;
    }
//overload the constructor method 3 diff ways
    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

//getters and setters
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    }
    



