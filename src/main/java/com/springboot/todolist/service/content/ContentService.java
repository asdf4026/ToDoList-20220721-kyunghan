package com.springboot.todolist.service.content;

import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.todolist.web.dto.content.CreateContentReqDto;
import com.springboot.todolist.web.dto.content.CreateContentRespDto;

public interface ContentService {
	
	
	@PostMapping("/content")
	public CreateContentRespDto createContentRespDto(CreateContentReqDto createContentReqDto) throws Exception;
	
}
