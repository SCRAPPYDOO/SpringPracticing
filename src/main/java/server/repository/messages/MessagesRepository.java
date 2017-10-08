package server.repository.messages;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MessagesRepository extends CrudRepository<Message, Long> {
	List<Message> findByFromWhoAndToWhoom(int fromWho, int toWhoom);
}
