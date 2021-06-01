package adapter;

import java.util.Objects;

public class Node {

    private String title;
    private String content;
    private String recipient;

    public Node(String title, String content, String recipient) {
        this.title = title;
        this.content = content;
        this.recipient = recipient;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (!Objects.equals(title, node.title)) return false;
        if (!Objects.equals(content, node.content)) return false;
        return Objects.equals(recipient, node.recipient);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (recipient != null ? recipient.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", recipient='" + recipient + '\'' +
                '}';
    }
}
