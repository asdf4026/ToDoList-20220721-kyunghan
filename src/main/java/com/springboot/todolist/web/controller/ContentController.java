package com.springboot.todolist.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.web.dto.content.CreateContentReqDto;
import com.springboot.todolist.web.dto.content.CreateContentRespDto;

import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/api/v1/todolist")
@RequiredArgsConstructor


public class ContentController {
	public ResponseEntity<?> addContent(@RequestBody CreateContentReqDto createContentReqDto){
		CreateContentRespDto createContentRespDto = null;
		
		return null;
	}
}
