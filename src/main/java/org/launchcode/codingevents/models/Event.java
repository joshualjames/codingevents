package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;

@Entity
public class Event extends AbstractEntity{
    //fields

//    @NotBlank(message = "Location is required")
//    private String location;

    @Size(max= 500, message="Description too long!")
    private String description;
    @NotBlank(message = "Email is required")
    @Email(message="Invalid Email!")
    private String contactEmail;

//    @AssertTrue(message = "Registration must be required. Please type 'true'")
//    private boolean registration;
//    @Positive(message="Number of attendees must be one or more.")
//    private int numberOfAttendees;

    private EventType type;

    //Constructors
    public Event(String name, String description, String contactEmail, String location,
                 boolean registration, int numberOfAttendees, EventType type) {
        super();
        this.description = description;
        this.contactEmail = contactEmail;
//        this.location = location;
//        this.registration = registration;
//        this.numberOfAttendees = numberOfAttendees;
        this.type = type;

    }

    public Event(){}

    //Getters and Setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public boolean isRegistration() {
//        return registration;
//    }
//
//    public void setRegistration(boolean registration) {
//        this.registration = registration;
//    }
//
//    public int getNumberOfAttendees() {
//        return numberOfAttendees;
//    }
//
//    public void setNumberOfAttendees(int numberOfAttendees) {
//        this.numberOfAttendees = numberOfAttendees;
//    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

}
