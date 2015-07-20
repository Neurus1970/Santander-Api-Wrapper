package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Víctor on 16/07/2015.
 */
public class Kollektion
{
    @SerializedName("Id")private String id;
    @SerializedName("title")private String title;
    @SerializedName("author")private String author;

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
