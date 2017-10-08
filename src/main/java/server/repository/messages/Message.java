package server.repository.messages;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "MESSAGE")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int fromWho;
	int toWhoom;
	String message;
	@Temporal(TemporalType.DATE)
	Date date;

	protected Message() {}
	
	public Message(int fromWho, int toWhoom, String message, Date date) {
		this.fromWho = fromWho;
		this.toWhoom = toWhoom;
		this.message = message;
		this.date = date;
	}

	public int getFromWho() {
		return fromWho;
	}

	public void setFromWho(int fromWho) {
		this.fromWho = fromWho;
	}

	public int getToWhoom() {
		return toWhoom;
	}

	public void setToWhoom(int toWhoom) {
		this.toWhoom = toWhoom;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}