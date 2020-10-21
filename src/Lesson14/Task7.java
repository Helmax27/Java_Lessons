package Lesson14;

import java.util.*;

public class Task7 {

    public static void main(String[] args) {
        Comparator<Message> comparator = new Comparator<Message>(){
            public int compare(Message m1, Message m2){
                //return (m1.getId() < m2.getId()) ? -1 : ((m1.getId() == m2.getId()) ? 0:1); //Integer.compare
                return m1.getMessage().length() - m2.getMessage().length();
            }
         };
        Comparator<Message> shortComparator = (Message m1, Message m2) ->
        {
            return m1.getMessage().length() - m2.getMessage().length();
        };
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Hello Lena!"));
        messages.add(new Message("Hello Word message!"));
        messages.add(new Message("blalabadbsff"));
        System.out.println(messages);
        messages.sort((Message m1, Message m2) -> m1.getMessage().length() - m2.getMessage().length());
        System.out.println(messages);
    }

    public static class Message {
        private String message;
        private int id;


        @Override
        public String toString() {
            return "Message{" +
                    "message='" + message + '\'' +
                    ", id=" + id +
                    '}';
        }

        public Message(String message) {
            this.message = message;
            this.id = new Random().nextInt(1000);
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Message)) return false;
            Message message1 = (Message) o;
            return getId() == message1.getId() &&
                    Objects.equals(getMessage(), message1.getMessage());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getMessage(), getId());
        }
    }
}
