package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

/**
 * Created by Víctor on 21/07/2015.
 */
public class MetaDataAttributeGroup
{

    @SerializedName("name")private String name;
    @SerializedName("attributes")private Group attributes;



    public String getName()
    {
        return name;
    }


    /*
    {
            "name":"icms:identifier",
            "attributes":
                {
                    "attribute":[{"key":"resolvable","value":"false"},
                    {"key":"visible","value":"true"},
                    {"key":"should_escape","value":"false"},
                    {"key":"rule","value":""},
                    {"key":"name","value":"icms:identifier"},
                    {"key":"required","value":"false"},
                    {"key":"type","value":""},
                    {"key":"queryable","value":"false"}]
                }
        }
     */
    public Boolean queryable()
    {
        Object o=attributes.attrs;
        Boolean ret= Boolean.getBoolean(getAttributeByName("queryable"));
        return ret;
    }

    public String type()
    {
        String ret= getAttributeByName("type");
        return ret;
    }

    public Boolean isRequired()
    {
        Object o=attributes.attrs;
        Boolean ret= Boolean.getBoolean(getAttributeByName("required"));
        return ret;
    }

    public String name()
    {
        String ret= getAttributeByName("name");
        return ret;
    }

    public String rule()
    {
        String ret= getAttributeByName("rule");
        return ret;
    }


    public Boolean isResolvable()
    {
        Object o=attributes.attrs;
        Boolean ret= Boolean.getBoolean(getAttributeByName("resolvable"));
        return ret;
    }

    public Boolean isVisible()
    {
        Boolean ret=Boolean.getBoolean(getAttributeByName("visible"));
        return ret;
    }
    public Boolean should_scape()
    {
        Boolean ret=Boolean.getBoolean(getAttributeByName("should_scape"));
        return ret;
    }

    private String getAttributeByName(String name)
    {
        String ret=null;
        int i=0;
        boolean found=false;
        while(i<attributes.attrs.size()&&!found)
        {
            LinkedTreeMap<String,String>current=attributes.attrs.get(i);
            String jarl=current.get("key");
            if(current.get("key").equals(name))
            {
                ret=current.get("value");
                found=true;
            }
            else
                i++;
        }

        return ret;
    }

    private class Group
    {
        @SerializedName("attribute")private List<LinkedTreeMap<String,String>> attrs;
    }
}
