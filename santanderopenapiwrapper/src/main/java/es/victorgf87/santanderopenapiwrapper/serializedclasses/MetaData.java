package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Víctor on 20/07/2015.
 */
public class MetaData
{
    @SerializedName("Metadata")private List<MetaDataAttributeGroup> metaData;

    public List<MetaDataAttributeGroup> getMetaData()
    {
        return metaData;
    }

    //icms:identifier
    public MetaDataAttributeGroup icms_identifier()
    {
        MetaDataAttributeGroup ret=getGroupByName("icms:identifier");
        return ret;
    }

    private MetaDataAttributeGroup getGroupByName(String id)
    {
        MetaDataAttributeGroup ret=null;
        int i=0;
        boolean found=false;
        while(i<metaData.size() && !found)
        {
            MetaDataAttributeGroup current=metaData.get(i);
            if(current.getName().equals(id))
            {
                found=true;
                ret=current;
            }
            i++;
        }
        return ret;
    }
}
