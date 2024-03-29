/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatemanagement;

import CandidateTypes.Candidate;
import CandidateTypes.Experience;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
class GetData {
    private final static String[] graduationRankList = {"Excellence","Good","Fair","Poor"};
    static int getInt(String msg,int min, int max){
        Scanner sc = new Scanner(System.in);
        String input;
        int choice;
        //Loop until user choose exit
        while(true){
            try{
                System.out.print(msg);            
                //Check String empty
                input=sc.nextLine();
                if(input.equals(""))
                    throw new NullPointerException();
            //Check Format error
                choice = Integer.parseInt(input);
            //Check if the number is in the range or not
                if(choice<min||choice>max)
                    throw new Exception("The number you typed must be in range of "+min+" to "+max+"!");
                return choice;
            }catch(NullPointerException NullValue){
                System.out.println("Error: You have to type a number!");
            }catch(NumberFormatException FormatError){
                System.out.println("Error: You have to type an integer!");
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    static int getUserOption(int min, int max) {
        Display display = new Display();
        Scanner sc = new Scanner(System.in);
        String input;
        int choice;
        //Loop until user choose exit
        while(true){
            try{
                //Check String empty
                input=sc.nextLine();
                if(input.equals(""))
                    throw new NullPointerException();
            //Check Format error
                choice = Integer.parseInt(input);
            //Check if the number is in the range or not
                if(choice<min||choice>max)
                    throw new Exception("The number you typed must be in range of "+min+" to "+max+"!");
                return choice;
            }catch(NullPointerException NullValue){
                System.out.println("Error: You have to type a number!");
                display.displayMainScreen();
            }catch(NumberFormatException FormatError){
                System.out.println("Error: You have to type an integer!");
                display.displayMainScreen();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                display.displayMainScreen();
            }
        }
    }

    static String getStringInput(String msg, String regex) {
        Scanner sc = new Scanner(System.in);
        String input;
        //Loop until user typed valid value
        while(true){
            System.out.print(msg);
            try{
                input=sc.nextLine();
                if(input.equals(""))
                    throw new NullPointerException();
                if(!input.matches(regex))
                    throw new Exception("Error: the input is not in valid format!");
                return input.trim();
            }catch(NullPointerException NullValue){
                System.out.println("Error: You must type something!");
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    static ArrayList<Candidate> getCandidateSearchedList(ArrayList<Candidate> candidateList, String candidateName, int candidateType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static String getStringInput(String msg) {
        Scanner sc = new Scanner(System.in);
        String input;
        //Loop until user typed valid value
        while(true){
            System.out.print(msg);
            try{
                input=sc.nextLine();
                if(input.equals(""))
                    throw new NullPointerException();
                return input.trim();
            }catch(NullPointerException NullValue){
                System.out.println("Error: You must type something!");
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    static boolean checkDuplicateId(ArrayList<Candidate> candidateList, String id) {
        if(candidateList.isEmpty())
            return false;
        else{
            //Access every elements of candidate array
            for(int i=0;i<candidateList.size();i++){
                //Check if the id is contained in the candidateList or not
                if(candidateList.get(i).getId().equals(id))
                    return true;
            }
        }
        return false;
    }

    static String getIdInput(String msg,String regex,ArrayList<Candidate> candidateList) {
        String input;
        //Loop until user input valid value
        while(true){
            input = getStringInput(msg,regex);
            //Check if the id is duplicated or not
            if (!GetData.checkDuplicateId(candidateList, input)) {
                return input;
            } else {
                System.out.println("Error: Duplicate information!");
            }
        }
    }

    static String getGraduationRankInput(String msg) {
        String input;
        //Loop until user input valid value
        while(true){
            input = getStringInput(msg);
            //Access every value of Rank list
            for(int i=0;i<graduationRankList.length;i++){
                //Check if the Graduation Rank is on the list or not
                if(input.equals(graduationRankList[i]))
                    return input;
            }
            System.out.println("Error: Graduation Rank not valid yet!");
        }
    }
}
