package server.repository.conversation;

import org.springframework.data.repository.CrudRepository;

public interface ConversationRepository extends CrudRepository<Conversation, Long> {
	public Conversation getById(int id);
}
