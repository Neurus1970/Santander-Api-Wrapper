package es.victorgf87.santanderopenapiwrapper.serializedclasses;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

/**
 * This class represents a collection given by the API
 * Created by Víctor on 16/07/2015.
 */
public class Kollektion
{
    @SerializedName("Id")private String id;         //Id of the collection
    @SerializedName("title")private String title;   //Title of the collection
    @SerializedName("author")private String author; //Author of the collection
    @SerializedName("listNameSpaces")private NameSpaceInCollection listNameSpaces; //Namespaces attached to this collection.
    @SerializedName("metadataList")private MetaData metadataList;   //Metadata list of this collection
    @SerializedName("modifiable")private Boolean modifiable;        //Is this collection modifiable?


    /**
     * Gets if this collection is modifiable.
     * @return - true if modifiable, false if not. null if data doesn't exist.
     */
    public Boolean isModifiable()
    {
        return modifiable;
    }

    /**
     * Gets list of nameSpaces in collection
     * @return - Object that contains the namespaces associated to this collection.
     */
    public NameSpaceInCollection getListNameSpaces() {
        return listNameSpaces;
    }

    /**
     * Gets metadata attached to this collection.
     * @return
     */
    public MetaData getMetadataList() {
        return metadataList;
    }


    /**
     * Gets id of collection
     * @return - String containing id of this collection
     */
    public String getId() {
        return id;
    }

    /**
     * Gets collection title.
     * @return - String containing title of this collection
     */
    public String getTitle() {
        return title;
    }


    /**
     * Gets author of this collection
     * @return - String containing author of the collection
     */
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString()
    {
        String ret="";
        ret+="Id: "+id+"\n";
        ret+="Title: "+title+"\n";
        ret+="author: "+author+"\n";
        ret+="modifiable: "+modifiable+"\n";
        return ret;
    }
}
