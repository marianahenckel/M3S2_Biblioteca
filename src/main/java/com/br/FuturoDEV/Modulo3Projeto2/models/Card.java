package com.br.FuturoDEV.Modulo3Projeto2.models;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private long id;
    private String number;
    private Double limit;
    private Double currentLimit;
    EnumType typeCard; 
}
