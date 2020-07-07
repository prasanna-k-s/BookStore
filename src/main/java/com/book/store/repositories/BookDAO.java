package com.book.store.repositories;

import com.book.store.entities.BookEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookDAO extends CrudRepository<BookEntity, Integer> {

    /**
     * Using list of entities to wrap the data if we find duplicate records
     * @param bookId
     * @return
     */
    @Query("SELECT bookRecord FROM BookEntity bookRecord where bookRecord.bookId = :bookId ")
    List<BookEntity> findOne(@Param("bookId") Integer bookId);

    //List<BookEntity> getBookDetailsBetweenDates(Date beginDate, Date endDate);

    @Query("SELECT bookRecord.bookId FROM BookEntity")
    List<Integer> getAllBookIds();
}
