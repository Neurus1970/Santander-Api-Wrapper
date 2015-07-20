package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

/**
 * Created by Víctor on 15/07/2015.
 */
public class Summary
{
    //summary":{"property":[{"name":"pages","value":"111"},{"name":"items_per_page","value":"1"},{"name":"current_page","value":"1"},{"name":"collections","value":"111"}]}
    @SerializedName("property")List<LinkedTreeMap<String,String>> property;

    //{"name":"pages","value":"111"},{"name":"items_per_page","value":"1"},{"name":"current_page","value":"1"},{"name":"collections","value":"111"}

    public Integer getPages()
    {
        Integer ret=Integer.valueOf(getPropertyByName("pages"));
        return ret;
    }

    public Integer getItemsPerPage()
    {
        Integer ret=Integer.valueOf(getPropertyByName("items_per_page"));
        return ret;
    }

    public Integer getCurrentPage()
    {
        Integer ret=Integer.valueOf(getPropertyByName("current_page"));
        return ret;
    }

    public Integer getCollectionsCount()
    {
        Integer ret=Integer.valueOf(getPropertyByName("collections"));
        return ret;
    }

    private String getPropertyByName(String name)
    {
        String ret=null;
        for(LinkedTreeMap<String,String>proper: property)
        {
            if(proper.get("name").equals(name))
            {
                ret= proper.get("value");
                break;
            }
        }
        return ret;
    }



}
