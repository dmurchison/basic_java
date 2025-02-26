import java.io.File;


public class BasicJavaProjectInfo {
    public static void main(String[] args) {
        // Print the current working directory
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currentDir);

        // List all files in the project directory and its subdirectories
        File projectDir = new File(currentDir);
        listFiles(projectDir);
    }

    public static void listFiles(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    listFiles(file); // Recursively list files in subdirectories
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
