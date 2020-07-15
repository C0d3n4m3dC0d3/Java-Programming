/*12.  In a college, first year classes are having the following attributes:
  Name of the Class (BCA, BCom, MHA), Name of the staff,
  No. of the students in the class, Array of students in the class.
  Define a class called FirstYear with above attributes and define a suitable constructor.
  Also write a method called bestStudent() which processes a FirstYear object, and
  returns the student with the highest total mark. In the main method, define a FirstYear
  object and find the best student of the class.*/


  class FirstYear  {
    String noc, nos;
    int nost;
    float stds[][];

    FirstYear(String c, String s, int st, float std[st][]){
    noc = c;
    nos = s;
    nost = st;
    stds = new float[st][3];
    for(int i = 0; i<st; i++) {
      for(int j = 0; j<3; j++) {
        stds[i][j] = std[i][j];
    } } }

    int bestStudent(FirstYear s)  {
     float total, max = 0;
     int i, j, rn;
      for(i = 0; i<st; i++) {
        total = 0;
        for(j = 0; j<3; j++) {
          total+=stds[i][j]; }
          if(total>max) {
            max = total;
            rn = i+1;
          }
          return rn;
        }

    public static void main(String args[])  {
      String s1 = "BCA", s2 = "Monisha K"
      float f1[][] = new float[5][3];
      int i, j, bs_roll, ns = 5;
      System.out.println("Enter marks of 5 students:");
      Scanner ip = new Scanner(System.in);
      for(i = 0; i<5; i++)
      {
        System.out.println("Student 1:");
        for(j = 0; j<3; j++)
        {
           System.out.print("Mark of Subject " + (j+1) + " : ");
           f1[i][j] = ip.nextFloat();
        }
        System.out.println();
      }

      //Creating FirstYear Object
      FirstYear fy = new FirstYear(s1, s2, 5, f1);
      rn = bestStudent(fy);
      float tm = f1[rn][0]+f1[rn][1]]+f1[rn][2];
      System.out.println("Best Student");
      System.out.println("Name of Class: " + s1);
      System.out.println("Roll Number: " + rn);
      System.out.println("Total Marks: " + tm);
    }
  }
