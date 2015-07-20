package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

/**
 * Created by Víctor on 15/07/2015.
 */
public class CollectionsList
{
    @SerializedName("summary")private Summary summary;
    @SerializedName("listCollections")private LinkedTreeMap<String,List<Kollektion>> collections;
    @SerializedName("resources")Object resources;

    public List<Kollektion>getCollections()
    {
        List<Kollektion> ret=collections.get("collection");
        return ret;
    }


    public Summary getSummary()
    {
        return summary;
    }
}
