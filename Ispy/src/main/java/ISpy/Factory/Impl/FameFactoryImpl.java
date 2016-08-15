package ISpy.Factory.Impl;

import ISpy.Domain.Fame;
import ISpy.Factory.FameFactory;

/**
 * Created by gavin.ackerman on 2016-04-28.
 */
public class FameFactoryImpl implements FameFactory{
    private static FameFactoryImpl factory = null;

    private FameFactoryImpl(){

    }

    public static FameFactoryImpl getInstance(){
        if (factory == null)
            factory = new FameFactoryImpl();

        return factory;
    }


    public Fame createFame(Long id,long storyId, long userId, int shares,int likes,int dislikes)
    {
        Fame ticket =  new Fame.Builder().id(id).storyId(storyId).userId(userId).shares(shares).likes(likes).dislikes(dislikes)
                .build();

        return ticket;
    }
}
