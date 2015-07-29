package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

/**
 * A summary contains data from a query. Like items per page and the page that were asked.
 * Created by Víctor on 15/07/2015.
 */
public class Summary
{

    //Contains the properties.
    @SerializedName("property")List<LinkedTreeMap<String,String>> property;

    /**
     * Number of pages generated for x items
     * @return
     */
    public Integer getPages()
    {
        Integer ret=Integer.valueOf(getPropertyByName("pages"));
        return ret;
    }

    /**
     * Number of items that are returned per page.
     * @return
     */
    public Integer getItemsPerPage()
    {
        Integer ret=Integer.valueOf(getPropertyByName("items_per_page"));
        return ret;
    }

    /**
     * Gets the number of current page
     * @return
     */
    public Integer getCurrentPage()
    {
        Integer ret=Integer.valueOf(getPropertyByName("current_page"));
        return ret;
    }

    /**
     *
     * @return
     */
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
