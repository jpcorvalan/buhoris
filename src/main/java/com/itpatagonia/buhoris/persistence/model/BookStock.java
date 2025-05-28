package com.itpatagonia.buhoris.persistence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "book_stock")
@Getter
@Setter
public class BookStock {

    @Id
    @Column(name = "book_id")
    private Long bookId;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId // Indica que la clave primaria de BookStock es la misma que la clave foránea hacia Book.
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(nullable = false)
    private Integer quantity = 0;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();
}
