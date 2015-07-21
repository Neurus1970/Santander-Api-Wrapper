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
    @SerializedName("Metadata")private List<LinkedTreeMap<String,Object>> metaData;
    

    public void bla()
    {
        Object keys=metaData.get(0).keySet();
        Object values=metaData.get(0).values();
        Object obj=metaData.get(0).entrySet();

        String klas=obj.getClass().toString();
        int a=3;
        int b=a;
    }
}
