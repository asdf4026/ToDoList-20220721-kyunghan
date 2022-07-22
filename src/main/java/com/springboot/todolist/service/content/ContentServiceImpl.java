package com.springboot.todolist.service.content;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.todolist.domain.content.Content;
import com.springboot.todolist.domain.content.ContentRepository;
import com.springboot.todolist.web.dto.content.CreateContentReqDto;
import com.springboot.todolist.web.dto.content.CreateContentRespDto;
import com.springboot.todolist.web.dto.content.ReadContentRespDto;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ContentServiceImpl implements ContentService {

	private final ContentRepository contentRepository;
	
	@Override
	public CreateContentRespDto createContentRespDto(CreateContentReqDto createContentReqDto) throws Exception {
		Content contentEntity = createContentReqDto.toEntity();
		boolean insertStatus =	contentRepository.save(contentEntity) > 0;
		return contentEntity.toCreateBoardDto(insertStatus);
	}

	@Override
	public ReadContentRespDto readContentRespDto(int contentcode) throws Exception {
		return null;
	}

	@Override
	public List<ReadContentRespDto> readContentList(int page) throws Exception {
		return null;
	}
	
	
	

}
