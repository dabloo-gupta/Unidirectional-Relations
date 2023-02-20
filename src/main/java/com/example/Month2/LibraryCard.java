package com.example.Month2;

import javax.persistence.*;

@Entity
@Table(name="library_card")
public class LibraryCard {

    @Id
    private int cardNo;

    private int fine;

    private int bookIssued;

    @Enumerated(value = EnumType.STRING)  //To store the values in db in String format
    private CardStatus cardStatus;

    //child class will have the foreign key of the parent class : through which
    //it connects to the other
    @OneToOne   //mapping relation between two entity
    @JoinColumn  //You are telling : add a foreign key column -> define the column name of the parent class, by default ith the primary key of parent class
    User user;
}
