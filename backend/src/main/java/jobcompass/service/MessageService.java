package jobcompass.service;

import jakarta.persistence.Table;
import jobcompass.exception.MessageException;
import jobcompass.model.Message;
import jobcompass.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Table(name="message", schema = "public")
public class MessageService {
    private final MessageRepo messageRepo;

    @Autowired
    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public Message addMessage(Message message) {
        return messageRepo.save(message);
    }

    public List<Message> findAllMessages() {
        return messageRepo.findAll();
    }

    public Message updateMessage(Message message) {
        return messageRepo.save(message);
    }

    public Message findMessageById(Long id) throws MessageException {
        return messageRepo.findMessageById(id)
                .orElseThrow(() -> new MessageException("Nincs " + id + " azonosíójú üzenet!"));
    }

    public void deleteMessage(Long id) {
        messageRepo.deleteMessageById(id);
    }
}
