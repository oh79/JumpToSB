package com.sb.sb.answer;

import java.time.LocalDateTime;

import com.sb.sb.question.Question;
import com.sb.sb.user.SiteUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    // 질문 Entity를 참조하기 위해 Question 속성 추가
    @ManyToOne
    private Question question;

    @ManyToOne
    private SiteUser author;
}
