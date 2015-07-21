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

    /**
     * Returns metadata with name icms:identifier
     * @return
     */
    public MetaDataAttributeGroup icms_identifier()
    {
        MetaDataAttributeGroup ret=getGroupByName("icms:identifier");
        return ret;
    }

    /**
     * Returns metadata with name dc:name
     * @return
     */
    public MetaDataAttributeGroup dc_name()
    {
        MetaDataAttributeGroup ret=getGroupByName("dc:name");
        return ret;
    }

    /**
     * Returns metadata with name ayto:alt-name
     * @return
     */
    public MetaDataAttributeGroup ayto__alt_name()
    {
        MetaDataAttributeGroup ret=getGroupByName("ayto:alt-name");
        return ret;
    }

    /**
     * Returns metadata with name ayto:categoria
     * @return
     */
    public MetaDataAttributeGroup ayto_categoria()
    {
        MetaDataAttributeGroup ret=getGroupByName("ayto:categoria");
        return ret;
    }


    /**
     * Returns metadata with name ayto:lon
     * @return
     */
    public MetaDataAttributeGroup ayto_lon()
    {
        MetaDataAttributeGroup ret=getGroupByName("ayto:lon");
        return ret;
    }

    /**
     * Returns metadata with name ayto:link
     * @return
     */
    public MetaDataAttributeGroup ayto_link()
    {
        MetaDataAttributeGroup ret=getGroupByName("ayto:link");
        return ret;
    }

    /**
     * Returns metadata with name dc:modified
     * @return
     */
    public MetaDataAttributeGroup dc_modified()
    {
        MetaDataAttributeGroup ret=getGroupByName("dc:modified");
        return ret;
    }

    /**
     * Returns metadata with name dc:description
     * @return
     */
    public MetaDataAttributeGroup dc_description()
    {
        MetaDataAttributeGroup ret=getGroupByName("dc:description");
        return ret;
    }

    /**
     * Returns metadata with name dc:identifier
     * @return
     */
    public MetaDataAttributeGroup dc_identifier()
    {
        MetaDataAttributeGroup ret=getGroupByName("dc:identifier");
        return ret;
    }
    /**
     * Returns metadata with name ayto:imagen
     * @return
     */
    public MetaDataAttributeGroup ayto_imagen()
    {
        MetaDataAttributeGroup ret=getGroupByName("ayto:imagen");
        return ret;
    }
    /**
     * Returns metadata with name ayto:datetime
     * @return
     */
    public MetaDataAttributeGroup ayto_datetime()
    {
        MetaDataAttributeGroup ret=getGroupByName("ayto:datetime");
        return ret;
    }
    /**
     * Returns metadata with name ayto:alt-link
     * @return
     */
    public MetaDataAttributeGroup ayto__alt_link()
    {
        MetaDataAttributeGroup ret=getGroupByName("ayto:alt-link");
        return ret;
    }
    /**
     * Returns metadata with name ayto:lat
     * @return
     */
    public MetaDataAttributeGroup ayto_lat()
    {
        MetaDataAttributeGroup ret=getGroupByName("ayto:lat");
        return ret;
    }
    /**
     * Returns metadata with name ayto:alt-description
     * @return
     */
    public MetaDataAttributeGroup ayto__alt_description()
    {
        MetaDataAttributeGroup ret=getGroupByName("ayto:alt-description");
        return ret;
    }


    /**
     * Helper method, searches for the group with given name
     * @param id
     * @return
     */
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
