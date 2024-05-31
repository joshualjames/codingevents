package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
public class EventCategory extends AbstractEntity{


    public EventCategory(@Size(min=3, message = "Name must be at least 3 characters long") String name) {
        super();
    }

    public EventCategory(){}






}
