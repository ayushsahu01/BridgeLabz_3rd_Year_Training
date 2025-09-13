class StudentService {
   private Student studentOne;
   private Student studentTwo;
   private Student studentThree;
   private Student studentFour;
   private Student studentFive;

    public void setStudentDetails() {
        studentOne = new Student();    
        studentOne.setStudentRollNumber(19);
        studentOne.setStudentName("Ayush Sahu");
        studentOne.setStudentAge(20);
        studentOne.setStudentDepartment("Computer Science and Engineering");

        studentTwo = new Student();    
        studentTwo.setStudentRollNumber(22);
        studentTwo.setStudentName("Ayushman Yadav");
        studentTwo.setStudentAge(20);
        studentTwo.setStudentDepartment("Computer Science and Engineering");

        studentThree = new Student();    
        studentThree.setStudentRollNumber(41);
        studentThree.setStudentName("Kushaal Kankane");
        studentThree.setStudentAge(21);
        studentThree.setStudentDepartment("Computer Science and Engineering");

        studentFour = new Student();    
        studentFour.setStudentRollNumber(17);
        studentFour.setStudentName("Akash Agrawal");
        studentFour.setStudentAge(20);
        studentFour.setStudentDepartment("Computer Science and Engineering");

        studentFive = new Student();    
        studentFive.setStudentRollNumber(32);
        studentFive.setStudentName("Karan Gupta");
        studentFive.setStudentAge(20);
        studentFive.setStudentDepartment("Computer Science and Engineering");
    }
    public void displayStudentDetails(){
        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentThree);
        System.out.println(studentFour);
        System.out.println(studentFive);   
    }
}
