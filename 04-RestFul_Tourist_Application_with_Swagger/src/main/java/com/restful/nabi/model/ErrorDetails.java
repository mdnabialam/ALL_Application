package com.restful.nabi.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {
		
	public ErrorDetails(LocalDateTime now, String string) {
		// TODO Auto-generated constructor stub
	}
	public ErrorDetails(String string) {
		// TODO Auto-generated constructor stub
	}
	private LocalDateTime time;
	private String msg;
	private String status;
}
