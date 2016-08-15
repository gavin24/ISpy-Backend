package ISpy.Factory.Impl;

import ISpy.Domain.Tag;
import ISpy.Factory.TagFactory;

/**
 * Created by gavin.ackerman on 2016-04-28.
 */
public class TagFactoryImpl implements TagFactory{
    private static TagFactoryImpl factory = null;

    private TagFactoryImpl(){

    }

    public static TagFactoryImpl getInstance(){
        if (factory == null)
            factory = new TagFactoryImpl();

        return factory;
    }


    public Tag createTag(Long id,String name, String location)
    {
        Tag ticket =  new Tag.Builder().id(id).name(name).location(location)
                .build();

        return ticket;
    }
}
