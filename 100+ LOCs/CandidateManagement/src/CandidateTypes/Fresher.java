/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandidateTypes;

/**
 *
 * @author Lenovo
 */
public class Fresher extends Candidate{
    private int Graduation_date;
    private String Graduation_rank;

    public Fresher(int Graduation_date, String Graduation_rank, String id, String firstName, String lastName, int birthDate, String address, String phone, String email) {
        super(id, firstName, lastName, birthDate, address, phone, email, 1);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
    }

    public Fresher(String id, String firstName, String lastName, int birthDate, String address, String phone, String email) {
        super(id, firstName, lastName, birthDate, address, phone, email, 1);
    }

    public int getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(int Graduation_date) {
        this.Graduation_date = Graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String Graduation_rank) {
        this.Graduation_rank = Graduation_rank;
    }
}