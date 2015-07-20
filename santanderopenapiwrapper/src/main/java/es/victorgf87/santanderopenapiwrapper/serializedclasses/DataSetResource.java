package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Víctor on 20/07/2015.
 */
public class DataSetResource
{
    public String getDc_modified() {
        return dc_modified;
    }

    public String getAyto_alt_link() {
        return ayto_alt_link;
    }

    public String getId() {
        return id;
    }

    public String getAyto_lon() {
        return ayto_lon;
    }

    public String getAyto_alt_name() {
        return ayto_alt_name;
    }

    public String getAyto_datetime() {
        return ayto_datetime;
    }

    public String getDc_description() {
        return dc_description;
    }
    
    
    @SerializedName("dc:modified")private String dc_modified;
    @SerializedName("ayto:alt-link")private String ayto_alt_link;
    @SerializedName("id")private String id;
    @SerializedName("ayto:lon")private String ayto_lon;
    @SerializedName("ayto:alt-name")private String ayto_alt_name;
    @SerializedName("ayto:datetime")private String ayto_datetime;
    @SerializedName("dc:description")private String dc_description;
}
