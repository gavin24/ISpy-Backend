package ISpy.Factory;

import ISpy.Domain.Story;
import ISpy.Domain.User;

/**
 * Created by gavin.ackerman on 2016-04-28.
 */
public interface StoryFactory {
    Story createStory(Long id,String name, String tag, String text,long userId,byte[] image);

}
