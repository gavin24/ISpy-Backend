package ISpy.Factory;

import ISpy.Domain.Fame;
import ISpy.Domain.Story;

/**
 * Created by gavin.ackerman on 2016-04-28.
 */
public interface FameFactory {
    Fame createFame(Long id,long storyId, long userId, int shares,int likes,int dislikes);

}
