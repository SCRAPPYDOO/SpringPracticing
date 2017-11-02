package server.repository.messages;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import server.repository.conversation.Conversation;

public interface MessagesRepository extends CrudRepository<Message, Long> {
	List<Message> findByConversation(Conversation conversation);
}
