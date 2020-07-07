package com.book.store.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="bookId")
    Integer bookId;

    @Column(name="bookName")
    String bookName;

    @Column(name="publisher")
    String publisher;

    @Column(name="total_count")
    Integer total_count;

    @Column(name="recieved_date")
    Date recieved_date;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Date getRecieved_date() {
        return recieved_date;
    }

    public void setRecieved_date(Date recieved_date) {
        this.recieved_date = recieved_date;
    }
}
