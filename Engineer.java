/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bai1;

import java.time.LocalDate;
/**
 *
 * @author admin
 */
public class Engineer extends Officer {
    private String branch;
    public Engineer(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        this.branch = branch;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    
    @ Override
    public String toString(){
          return "Engineer{" +
                "branch='" + branch + '\'' +
                ", name='" +name +'\'' +
                ", age= + age + '\'' +
                ", gender= + gender + '\'' +
                ", address = '" + address + '\'' +
                        '}';
    }
}
    
    

