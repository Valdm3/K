/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javafxdemo1;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author student
 */
public class Student {
    
    public IntegerProperty id;
    public StringProperty firstName;
    public StringProperty lastName;
    public StringProperty Age;

    public Student(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
    }

    public StringProperty getFirstNameProperty() {
        return firstName;
    }

    public StringProperty getLastNameProperty() {
        return lastName;
    }

    public String getFirstName() {
        return firstName.getValue();
    }

    public String getLastName() {
        return lastName.getValue();
    }
    public StringProperty getAgeProperty(){
        return Age;
    }
    public String getAge(){
        return Age.getValue();
    }
}
