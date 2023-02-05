package com.example.boardproject.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private String article;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
