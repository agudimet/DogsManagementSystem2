package com.gudimetlaClasses.DMS.Models;
/**
*
* @author Anuradha Gudimetla S558919
*/
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Dog {
    @javax.persistence.Id
	private int id;
	private String name;
	private String breed;
	@ManyToOne
	private Trainer trainer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + ", trainer=" + trainer + "]";
	}
	
	
	
}
