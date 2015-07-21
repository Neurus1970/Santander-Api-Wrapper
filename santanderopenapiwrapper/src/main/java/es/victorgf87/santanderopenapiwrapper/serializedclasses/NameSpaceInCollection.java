package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Víctor on 20/07/2015.
 */
public class NameSpaceInCollection
{
    @SerializedName("NameSpace")List<String> nameSpace;
    /*
    "rdf:http://www.w3.org/1999/02/22-rdf-syntax-ns#",
					"ayto:http://datos.santander.es#",
					"icms:http://def.santander.es/icms#",
					"atom:http://www.w3.org/2005/Atom/",
					"dc:http://purl.org/dc/elements/1.1/"
     */


    public String getrdf()
    {
        return getMatchingStart("rdf:");
    }

    public String getAyto()
    {
        return getMatchingStart("ayto:");
    }

    public String geticms()
    {
        return getMatchingStart("icms:");
    }

    public String getdc()
    {
        return getMatchingStart("dc:");
    }

    public String getatom()
    {
        return getMatchingStart("atom:");
    }

    private String getMatchingStart(String start)
    {
        String ret=null;
        int i=0;
        boolean found=false;

        while(i<nameSpace.size() && !found)
        {
            String current=nameSpace.get(i);
            if(current.startsWith(start))
            {
                found=true;
                ret=nameSpace.get(i);
            }
            else
                i++;
        }

        return ret;
    }
}
