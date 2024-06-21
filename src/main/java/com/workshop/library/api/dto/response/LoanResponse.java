package com.workshop.library.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import com.workshop.library.utils.enums.statusType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoanResponse {

    private LocalDateTime loanDate;
    private LocalDateTime returnDate;
    private statusType status;
    private Long user_id;
    private Long book_id;
}
