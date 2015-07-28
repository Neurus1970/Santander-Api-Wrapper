package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;


/*
    Example of JSON hashed
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


/**
 * Created by Víctor on 21/07/2015.
 */
public class MetaDataAttributeGroup
{

    //Serialized names to retrieve data from dataset.
    @SerializedName("name")private String name; //Name of the attribute group
    @SerializedName("attributes")private Group attributes; //Group of values


    /**
     * Returns name of the metadata attribute
     * @return
     */
    public String getName()
    {
        return name;
    }


    
    @Override
    public String toString()
    {
        String ret="";
        ret+="\nresolvable: "+getAttributeByName("resolvable")+"\n";
        ret+="visible: "+getAttributeByName("visible")+"\n";
        ret+="should_scape: "+getAttributeByName("should_scape")+"\n";
        ret+="rule: "+getAttributeByName("rule")+"\n";
        ret+="name: "+getAttributeByName("name")+"\n";
        ret+="required: "+getAttributeByName("required")+"\n";
        ret+="type: "+getAttributeByName("type")+"\n";
        ret+="queryable: "+getAttributeByName("queryable")+"\n";
        return ret;

    }

    /**
     * Returns if it is queryable or not
     * @return true if queryable, false if not. Null if data not found.
     */
    public Boolean queryable()
    {
        Object o=attributes.attrs;
        Boolean ret= Boolean.getBoolean(getAttributeByName("queryable"));
        return ret;
    }

    /**
     * Returns string with the type of the metadata
     * @return - name of the metadata
     */
    public String type()
    {
        String ret= getAttributeByName("type");
        return ret;
    }

    /**
     * Tells if object is required
     * @return - true if it's required, false otherwise. Null if data not found.
     */
    public Boolean isRequired()
    {
        Object o=attributes.attrs;
        Boolean ret= Boolean.getBoolean(getAttributeByName("required"));
        return ret;
    }


    /**
     * Returns rule of the object
     * @return - string containing rule of data (Not sure of what is this, because it seems to be blank always)
     */
    public String rule()
    {
        String ret= getAttributeByName("rule");
        return ret;
    }


    /**
     * Is this object resolvable?
     * @return - true if it is resolvable, false otherwise. Returns null if data not found.
     */
    public Boolean isResolvable()
    {
        Object o=attributes.attrs;
        Boolean ret= Boolean.getBoolean(getAttributeByName("resolvable"));
        return ret;
    }

    /**
     * Is this object visible?
     * @return - true if it is visible, false otherwise. Returns null if data not found.
     */
    public Boolean isVisible()
    {
        Boolean ret=Boolean.getBoolean(getAttributeByName("visible"));
        return ret;
    }


    /**
     * Should this object scape? (Don't know what this means)
     * @return
     */
    public Boolean should_scape()
    {
        Boolean ret=Boolean.getBoolean(getAttributeByName("should_scape"));
        return ret;
    }


    /**
     * Helper method that gets an attribute by its name
     * @param name - name of the attribute to get.
     * @return string that contains attribute value
     */
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

    /**
     * Helper class that represents an attribute group
     */
    private class Group
    {
        @SerializedName("attribute")private List<LinkedTreeMap<String,String>> attrs;
    }
}
