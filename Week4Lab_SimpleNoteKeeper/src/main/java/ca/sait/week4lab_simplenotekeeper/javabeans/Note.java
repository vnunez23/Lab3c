/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.week4lab_simplenotekeeper.javabeans;

import java.io.Serializable;

/**
 * Represents a note
 * @author Vivtor Nunez
 */
public class Note implements Serializable {
    //Fields
    private String title;
    private String contents;
    
    //Constructors
    public Note(){
        
    }
    public Note(String title, String contents){
        this.title = title;
        this.contents = contents;
    }
    //Getter/Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    
    
}
