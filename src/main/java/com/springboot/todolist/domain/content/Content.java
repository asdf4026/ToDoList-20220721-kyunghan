package com.springboot.todolist.domain.content;

import java.time.LocalDate;

import com.springboot.todolist.web.dto.content.CreateContentRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Content {
	private int contentcode;
	private String content;
	private int usercode;
	private LocalDate createdate;
	private LocalDate updatedate;
	
	public CreateContentRespDto toCreateBoardDto(boolean insertStatus) {
		return CreateContentRespDto.builder()
				.contentcode(contentcode)
				.content(content)
				.usercode(usercode)
				.insertStatus(insertStatus)
				.build();
	}
}


