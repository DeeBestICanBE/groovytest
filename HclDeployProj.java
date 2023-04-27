// importing the FileWriter class
import java.io.FileWriter;

 class HclDeployProj {
   public static void main(String args[]) {

     String data = "This is the data in the output file";
     try {
       // Creates a Writer using FileWriter
       FileWriter output = new FileWriter("c:\\DerrickTest\\test1.txt");

       // Writes string to the file
       output.write(data);
       System.out.println("New Data from Derricks test ");

       // Closes the writer
       output.close();
     }
     catch (Exception e) {
       e.getStackTrace();
     }
  }
}