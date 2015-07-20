package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Víctor on 20/07/2015.
 */
public class DataSet
{
    @SerializedName("summary")Summary summary;
    @SerializedName("resources")List<LinkedTreeMap<String,String>>resources;//List<LinkedTreeMap<String,String>> resources;




    private String getResourceByName(String name)
    {
        String ret=null;
        for(LinkedTreeMap<String,String>resource: resources)
        {
            if(resource.get("name").equals(name))
            {
                ret= resource.get("value");
                break;
            }
        }
        return ret;
    }
}
