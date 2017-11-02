package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import server.repository.conversation.Conversation;
import server.service.ConversationService;

@RestController
public class ConversationController {
	
	@Autowired
	private ConversationService conversationService;
	
	@RequestMapping("/conversation/{id}")
	public ResponseEntity<Conversation> getConversation(@PathVariable int id) { 
		Conversation conversation = conversationService.getConversation(id);
		return new ResponseEntity<Conversation>(conversation, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/conversation")
	public ResponseEntity<Conversation>  addConversation(@RequestBody Conversation conversation) {
		return new ResponseEntity<Conversation>(conversationService.addConversation(conversation), HttpStatus.OK);
	}
}
