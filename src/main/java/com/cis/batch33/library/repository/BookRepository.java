package com.cis.batch33.library.repository;
import com.cis.batch33.library.entity.LibraryBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
public interface BookRepository extends JpaRepository<LibraryBook, Integer>{
}
