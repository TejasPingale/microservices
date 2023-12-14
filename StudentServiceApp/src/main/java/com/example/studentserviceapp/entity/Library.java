package com.example.studentserviceapp.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="library")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id ;
    private String name ;
    private String address;
    private String email;
    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

    
}
