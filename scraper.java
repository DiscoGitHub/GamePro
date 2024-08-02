import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class scraper {
  static void scrape(String theurl){
    try {
            // Command and arguments
            List<String> command = new ArrayList<>();
            command.add("curl");
            command.add("-L");
            command.add("-o");
            command.add("output.html");
            command.add(theurl);

            // Create a ProcessBuilder instance
            ProcessBuilder processBuilder = new ProcessBuilder(command);

            // Start the process
            Process process = processBuilder.start();

            // Read the output from the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the process to complete
            int exitCode = process.waitFor();
            System.out.println("Exited with code: " + exitCode);

      } catch (Exception e) {
        e.printStackTrace();
      }
  }
  public static void main(String[] args) {
    Scanner urlObj = new Scanner(System.in);
    System.out.println("please enter the web page you would like to go to: ");
    String urlinput = urlObj.nextLine();
    urlinput = "https://" + urlinput;
    System.out.println(urlinput);
    scrape(urlinput);
  }
}
