package ISpy.Factory;

import ISpy.Domain.User;

import java.sql.Date;

/**
 * Created by gavin.ackerman on 2016-04-28.
 */
public interface UserFactory {
    User createUser(Long id,String name, String surname, String email,String password);

}
