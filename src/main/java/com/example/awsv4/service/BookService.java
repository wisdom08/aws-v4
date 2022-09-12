package com.example.awsv4.service;

import com.example.awsv4.domain.Book;
import com.example.awsv4.domain.BookRepository;
import com.example.awsv4.web.dto.BookRespDto;
import com.example.awsv4.web.dto.BookSaveReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;

    @Transactional(rollbackFor = RuntimeException.class)
    public BookRespDto createBook(BookSaveReqDto reqDto) {
        Book bookEntity = bookRepository.save(reqDto.toEntity());
        return new BookRespDto(bookEntity);
    }

    @Transactional(readOnly = true)
    public List<BookRespDto> getBooks() {
        List<Book> booksEntity = bookRepository.findAll();
        return booksEntity.stream()
                .map(BookRespDto::new)
                .collect(Collectors.toList());
    }
}
