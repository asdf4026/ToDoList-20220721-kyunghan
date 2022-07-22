package com.springboot.todolist.web.dto.content;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CreateContentRespDto {
	private int contentcode;
	private String content;
	private int usercode;
	
}
