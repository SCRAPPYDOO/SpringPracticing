package server.repository.contacts;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ContactsRepository extends CrudRepository<Contact, Long> {

	public List<Contact> findAllByOwner(int owner);
	
}
