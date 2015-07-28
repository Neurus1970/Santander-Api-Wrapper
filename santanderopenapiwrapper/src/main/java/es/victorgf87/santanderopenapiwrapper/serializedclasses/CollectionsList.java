package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

/**
 * Class containing a list of collections.
 *
 * Created by Víctor on 15/07/2015.
 */
public class CollectionsList
{
    @SerializedName("summary")private Summary summary; //A request contains a summary
    @SerializedName("listCollections")private LinkedTreeMap<String,List<Kollektion>> collections;//List of collections
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
