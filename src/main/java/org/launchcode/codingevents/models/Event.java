package org.launchcode.codingevents.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Entity;
import java.util.Objects;

@Entity
public class Event {
    //fields
    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Location is required")
    private String location;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max= 50, message="Name must be between 3 and 50 characters!")
    private String name;
    @Size(max= 500, message="Description too long!")
    private String description;
    @NotBlank(message = "Email is required")
    @Email(message="Invalid Email!")
    private String contactEmail;

    @AssertTrue(message = "Registration must be required. Please type 'true'")
    private boolean registration;
    @Positive(message="Number of attendees must be one or more.")
    private int numberOfAttendees;

    private EventType type;

    //Constructors
    public Event(String name, String description, String contactEmail, String location,
                 boolean registration, int numberOfAttendees, EventType type) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registration = registration;
        this.numberOfAttendees = numberOfAttendees;
        this.type = type;

    }

    public Event(){}

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    //Methods
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
