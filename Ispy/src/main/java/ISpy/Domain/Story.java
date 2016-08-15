package ISpy.Domain;

/**
 * Created by gavin.ackerman on 2016-04-28.
 */
public class Story {
    private String name;
    private long id;
    private String tag;
    private String text;
    private long userId;
    private byte[] image;

    private Story() {
    }



    public String getTag(){return tag;}
    public long getId() {
        return id;
    }
    public String getName(){return name;}
    public String getText(){return text;}

    public byte[] getImage(){return image;}
    public long getuserId(){return userId;}

    public Story(Builder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.text=builder.text;
        this.tag=builder.tag;
        this.image=builder.image;
        this.userId=builder.userId;

    }

    public static class Builder {
        private long id;
        private String name;
        private String text;
        private String tag;
        private byte[] image;
        private long userId;


        public Builder name(String value) {
            this.name = value;
            return this;
        }


        public Builder id(long value) {
            this.id = value;
            return this;
        }
        public Builder text(String value) {
            this.text = value;
            return this;
        }
        public Builder image(byte[] value) {
            this.image = value;
            return this;
        }

        public Builder userId(long value) {
            this.userId = value;
            return this;
        }

        public Builder tag(String value) {
            this.tag = value;
            return this;

        }


        public Builder copy(Story value) {
            this.id = value.id;
            this.name = value.name;
            this.image = value.image;
            this.tag = value.tag;
            this.userId = value.userId;
            this.text = value.text;
            return this;
        }

        public Story build() {
            return new Story(this);
        }
    }
}
