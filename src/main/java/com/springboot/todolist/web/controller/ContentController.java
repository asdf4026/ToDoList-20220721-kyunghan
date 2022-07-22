package com.springboot.todolist.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.service.content.ContentService;
import com.springboot.todolist.web.dto.CMRespDto;
import com.springboot.todolist.web.dto.content.CreateContentReqDto;
import com.springboot.todolist.web.dto.content.CreateContentRespDto;

import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/api/v1/todolist")
@RequiredArgsConstructor


public class ContentController {
	
	private final ContentService contentService;
	
	@PostMapping("/content")
	public ResponseEntity<?> addContent(@RequestBody CreateContentReqDto createContentReqDto){
		CreateContentRespDto createContentRespDto = null;
		
		try {
			contentService.createContentRespDto(createContentReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(new CMRespDto<>(-1 , "게시글 등록 실패", createContentRespDto));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 등록 성공", createContentRespDto));
	}
}
