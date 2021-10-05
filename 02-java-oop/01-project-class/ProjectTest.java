class ProjectTest {
    public static void main(String[] args) {
        Project name = new Project();
        Project desc = new Project();

        name.setName("OOP");
        desc.setDesc("This has been a fun project!");

        String projectName = name.getName();
        String projectDesc = desc.getDesc();

        System.out.println("The current project is: " + projectName);
        System.out.println("Project description: " + projectDesc);


    }
}