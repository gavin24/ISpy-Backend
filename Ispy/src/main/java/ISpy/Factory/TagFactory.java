package ISpy.Factory;

import ISpy.Domain.Tag;
import ISpy.Domain.User;

/**
 * Created by gavin.ackerman on 2016-04-28.
 */
public interface TagFactory {
    Tag createTag(Long id,String name, String location);

}
