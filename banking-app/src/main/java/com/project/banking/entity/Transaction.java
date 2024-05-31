package com.project.banking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long accountId;
    private double amount;
    private String transactionType; // DEPOSIT, WITHDRAW, TRANSFER
    private LocalDateTime timestamp;
}
