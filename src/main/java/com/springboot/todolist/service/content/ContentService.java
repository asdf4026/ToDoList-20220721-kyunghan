package com.springboot.todolist.service.content;

import java.util.List;


import com.springboot.todolist.web.dto.content.CreateContentReqDto;
import com.springboot.todolist.web.dto.content.CreateContentRespDto;
import com.springboot.todolist.web.dto.content.ReadContentRespDto;

public interface ContentService {
	
	public CreateContentRespDto createContentRespDto(CreateContentReqDto createContentReqDto) throws Exception;
	public ReadContentRespDto readContentRespDto(int contentcode) throws Exception;
	public List<ReadContentRespDto> readContentList(int page) throws Exception;
}
