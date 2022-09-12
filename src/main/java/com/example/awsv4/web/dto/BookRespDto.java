package com.example.awsv4.web.dto;

import com.example.awsv4.domain.Book;
import lombok.Builder;
import lombok.Getter;

@Getter
public class BookRespDto {
    private final Long id;
    private final String title;
    private final String content;
    private final String author;

    @Builder
    public BookRespDto(Long id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public BookRespDto(Book bookEntity) {
        this.id = bookEntity.getId();
        this.title = bookEntity.getTitle();
        this.content = bookEntity.getContent();
        this.author = bookEntity.getAuthor();
    }
}
