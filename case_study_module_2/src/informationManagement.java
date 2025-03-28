package src;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class informationManagement extends information implements IinformationManagement {


    @Override
    public void display() {

    }

    @Override
    public void addInformation() {
        // check File
        File informationFile = new File("information.txt");
        if (!informationFile.exists()) {
            System.out.println("Information file does not exist");
        } else {
            if (!informationFile.canWrite()) {
                System.out.println("Cannot write to file");
            } else {
                try {
                    FileWriter fw = new FileWriter(informationFile);
                    fw.write("");
                    fw.close();
                } catch (IOException e){
                    System.out.println("Cannot write to file" + e.getMessage());
                }
            }
        }
        // imput information
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your gender: ");
        String gender = sc.nextLine();
        int phoneNumber;
        while (true){
            System.out.println("Enter the phone number of the person");
            phoneNumber = sc.nextInt();
            if (String.valueOf(phoneNumber).length() == 10)
                break;
            else {
                System.out.println("invalid phone number");
            }
        }
        System.out.println("Enter your group: ");
        String group = sc.nextLine();
        System.out.println("Enter your address: ");
        String address = sc.nextLine();
        System.out.println("Enter your date of birth: ");
        String dateOfBirth = sc.nextLine();
        // validate dateOfBirth
        try{
            Date date = dateFormat.parse(dateOfBirth);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Invalid date format");
        }
        System.out.println("Enter your email: ");
        String email = sc.nextLine();

        ArrayList<information> informationArray = new ArrayList<>();
        informationArray.add(new information(name, gender, phoneNumber, group, address, dateOfBirth, email));
        String test = String.valueOf(informationArray);
        System.out.println(test);
    }

    @Override
    public void updateInformation() {

    }

    @Override
    public void deleteInformation() {

    }

    @Override
    public void searchInformation() {

    }

    @Override
    public void sortInformation() {

    }

    @Override
    public void writeIntoFile() {

    }

    @Override
    public void readFromFile() {

    }

    public void validate(){
    }
}
