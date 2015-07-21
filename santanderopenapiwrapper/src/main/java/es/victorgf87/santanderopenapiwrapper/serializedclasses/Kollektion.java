package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

/**
 * Created by Víctor on 16/07/2015.
 */
public class Kollektion
{
    @SerializedName("Id")private String id;
    @SerializedName("title")private String title;
    @SerializedName("author")private String author;
    @SerializedName("listNameSpaces")private NameSpaceInCollection listNameSpaces;

    public NameSpaceInCollection getListNameSpaces() {
        return listNameSpaces;
    }

    public MetaData getMetadataList() {
        return metadataList;
    }

    @SerializedName("metadataList")private MetaData metadataList;

    public NameSpaceInCollection getNameSpace()
    {
        return listNameSpaces;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString()
    {
        String ret="";
        ret+="Id: "+id+"\n";
        ret+="Title: "+title+"\n";
        ret+="author: "+author;
        return ret;
    }
}
