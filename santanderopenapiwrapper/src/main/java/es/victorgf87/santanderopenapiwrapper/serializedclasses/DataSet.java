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
    @SerializedName("resources")List<DataSetResource>resources;//List<LinkedTreeMap<String,String>> resources;

}
