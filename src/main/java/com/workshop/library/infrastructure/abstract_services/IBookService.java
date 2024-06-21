package com.workshop.library.infrastructure.abstract_services;

import org.springframework.data.domain.Page;

import com.workshop.library.api.dto.request.BookRequest;
import com.workshop.library.api.dto.response.BookResponseFull;

public interface IBookService extends CrudAbstractService<BookRequest, BookResponseFull, Long> {

    public Page<BookResponseFull> getAll(int page, int size);
    
}
