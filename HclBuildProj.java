import java.io.File;

class HclBuildProj {
  public static void main(String[] args) {

    // creates a file object with specified path
    File file = new File("c:\\DerrickTest");

    // tries to create a new directory
    boolean value = file.mkdir();
    if(value) {
      System.out.println("The new directory is created.");
    }
    else {
      System.out.println("The directory already exists.");
    }
  }
}