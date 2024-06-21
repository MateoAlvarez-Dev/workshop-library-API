package com.workshop.library.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoanResponse {

    private LocalDateTime loanDate;
    private LocalDateTime returnDate;
    private Long user_id;
    private Long book_id;
}
