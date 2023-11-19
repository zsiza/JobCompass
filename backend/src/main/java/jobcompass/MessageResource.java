package jobcompass;

import jakarta.transaction.Transactional;
import jobcompass.model.Message;
import jobcompass.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/message") @Transactional
public class MessageResource {
    private final MessageService messageService;

    public MessageResource(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Message>> getAllMessages() {
        List<Message> messages = messageService.findAllMessages();
        return ResponseEntity.ok(messages);
    }

    @GetMapping("/find/{messageId}")
    public ResponseEntity<Message> getMessageByMessageId(@PathVariable("messageId") Long messageId) {
        Message message = messageService.findMessageByMessageId(messageId);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Message> addMessage(@RequestBody Message message) {
        Message newMessage = messageService.addMessage(message);
        return new ResponseEntity<>(newMessage, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Message> updateMessage(@RequestBody Message message) {
        Message updatedMessage = messageService.updateMessage(message);
        return new ResponseEntity<>(updatedMessage, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{messageId}")
    public ResponseEntity<?> deleteMessage(@PathVariable("messageId") Long messageId) {
        messageService.deleteMessage(messageId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
