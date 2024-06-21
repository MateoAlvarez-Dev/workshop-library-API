package com.workshop.library.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.workshop.library.api.dto.request.BookRequest;
import com.workshop.library.api.dto.response.BookOnlyReservations;
import com.workshop.library.api.dto.response.BookResponse;
import com.workshop.library.api.dto.response.BookResponseFull;
import com.workshop.library.domain.entities.Book;
import com.workshop.library.domain.repositories.BookRepository;
import com.workshop.library.infrastructure.abstract_services.IBookService;
import com.workshop.library.utils.mappers.BookMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService implements IBookService{

    @Autowired
    private final BookRepository bookRepository;

    @Autowired
    private final BookMapper bookMapper;

    @Override
    public BookResponseFull getById(Long id) {
        Book book = this.find(id);
        return this.bookMapper.BookToResponseFull(book);
    }

    @Override
    public BookResponseFull create(BookRequest request) {
        Book book = this.bookMapper.RequestToBook(request);
        return this.bookMapper.BookToResponseFull(this.bookRepository.save(book));
    }

    @Override
    public BookResponseFull update(Long id, BookRequest request) {

        this.find(id);
        Book bookToUpdate = this.bookMapper.RequestToBook(request);
        bookToUpdate.setId(id);
        Book bookSaved = this.bookRepository.save(bookToUpdate);
        return this.bookMapper.BookToResponseFull(bookSaved);
    
    }

    @Override
    public void delete(Long id) {
        this.bookRepository.deleteById(id);
    }

    private Book find(Long id){
        return this.bookRepository.findById(id).orElseThrow();
    }

    @Override
    public Page<BookResponse> getAll(int page, int size) {

        if(page < 0) page = 0;
        PageRequest pagination = PageRequest.of(page -1, size);

        return this.bookRepository.findAll(pagination).map(bookMapper::BookToResponse);

    }

    @Override
    public BookOnlyReservations getOnlyReservations(Long id) {
        return this.bookMapper.bookToOnlyReservations(this.find(id));
    }

}
