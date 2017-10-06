package server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import server.repository.message.Message;
import server.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	MessageService messageService;
	
	@SuppressWarnings("rawtypes")
	@RequestMapping("/sendMessage")
	public ResponseEntity<?> sendMessage(
			@RequestParam(value = "fromWho") int fromWho,
			@RequestParam(value = "toWhoom") int toWhoom,
			@RequestParam(value = "message") String message
			) {
		if(messageService.sendMessage(fromWho, toWhoom, message).getId() != 0) {
			return new ResponseEntity(HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
	
	@RequestMapping("/getMessages")
	public ResponseEntity<?> getMessages(
			@RequestParam(value = "fromWho") int fromWho,
			@RequestParam(value = "toWhoom") int toWhoom
			) {
		List<Message> list = messageService.getMessages(fromWho, toWhoom);
		return new ResponseEntity<List<Message>>(list, HttpStatus.SERVICE_UNAVAILABLE);
	}
}
