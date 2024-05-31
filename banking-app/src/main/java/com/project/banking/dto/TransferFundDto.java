package com.project.banking.dto;

public record TransferFundDto(Long fromAccountId,
                              Long toAccountId,
                              double amount) {
}
