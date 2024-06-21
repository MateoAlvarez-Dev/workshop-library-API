package com.workshop.library.infrastructure.services;

import org.springframework.data.domain.Page;

import com.workshop.library.api.dto.request.LoanRequest;
import com.workshop.library.api.dto.response.LoanResponse;
import com.workshop.library.infrastructure.abstract_services.ILoanService;

public class LoanService implements ILoanService{

    @Override
    public Page<LoanResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public LoanResponse getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public LoanResponse create(LoanRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public LoanResponse update(Long id, LoanRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
