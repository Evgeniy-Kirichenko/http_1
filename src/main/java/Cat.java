import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    private String id;// - уникальный идентификатор записи
    private String text; //- сообщение
    private String type;// - тип животного
    private String user;// - имя пользователя
    private Integer upvotes;// - голоса

    public Cat (
     @JsonProperty("id")String id,
     @JsonProperty("text")String text,
     @JsonProperty("type")String type,
     @JsonProperty("user")String user,
     @JsonProperty("upvotes") Integer upvotes
         )
    {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes='" + upvotes + '\'' +
                '}';
    }
}