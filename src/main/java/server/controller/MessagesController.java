package server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import server.repository.conversation.Conversation;
import server.repository.messages.Message;
import server.service.MessagesService;

@RestController
public class MessagesController {
	
	@Autowired
	private MessagesService messageService;
	
	@RequestMapping("/messages/{conversation}")
	public ResponseEntity<?> getMessages(@PathVariable Conversation conversation) { 
		List<Message> list = messageService.getMessages(conversation);
		return new ResponseEntity<List<Message>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/messages")
	public ResponseEntity<?> addMessage(@RequestBody Message message
			) {
		if(messageService.addMessage(message).getId() != 0) {
			return new ResponseEntity(HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
	

}
