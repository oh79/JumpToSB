package com.sb.sb;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.sb.sb.answer.Answer;
import com.sb.sb.question.Question;
import com.sb.sb.question.QuestionRepository;

@SpringBootTest
class SbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Transactional
	@Test
	void testJpa() {
		// Optional<Question> oq = this.questionRepository.findById(2);
		// assertTrue(oq.isPresent());
		// Question q = oq.get();

		// List<Answer> answerList = q.getAnswerList();

		// assertEquals(1, answerList.size());
		// assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
	}
}