package com.Modulo3Projeto2.models;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EnumTypeCard {
    private String CREDIT;
    private String DEBIT;
}
