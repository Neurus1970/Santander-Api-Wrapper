package es.victorgf87.santanderopenapiwrapper.apiclasses;

import es.victorgf87.santanderopenapiwrapper.serializedclasses.CollectionsList;
import es.victorgf87.santanderopenapiwrapper.serializedclasses.DataSet;
import es.victorgf87.santanderopenapiwrapper.serializedclasses.Kollektion;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by V�ctor on 14/07/2015.
 */
public interface SantanderService
{

    /**
     * Returns default collections set. By default it will return 1000 elements.
     */
    @GET("/rest/collections.json")
    CollectionsList getAllCollections();


    /**
     * Returns collections list paginated, with the ammount of items desired.
     * @param items - amount of items you want to fetch.
     * @param page - the page of items
     * @return - collection list
     */
    @GET("/rest/collections.json")
    CollectionsList getAllCollections(@Query("items")Integer items, @Query("page")Integer page);


    /**
     * Returns dataset of desired collection
     * @param collection_id
     * @return
     */
    @GET("/rest/datasets/{collection_id}.json")
    DataSet getCollectionDataSet(@Path("collection_id") String collection_id);


    /**
     * Returns dataset of desired collection paginated.
     * @param collection_id - id of desired collecion
     * @param items - amount of items wanted
     * @param page - page of items wanted
     * @return
     */
    @GET("/rest/datasets/{collection_id}.json")
    DataSet getCollectionDataSet(@Path("collection_id") String collection_id, @Query("items")Integer items, @Query("page")Integer page);


    /**
     * Fetches desired collection
     * @param collection_id
     * @return
     */
    @GET("/rest/collections/{collection_id}.json")
    Kollektion getCollection(@Path("collection_id") String collection_id);


    /**
     * Fetched certain resource from certain collection.
     * @param collection_id
     * @param resource_id
     * @return
     */
    @GET("/rest/datasets/{collection_id}/{resource_id}.json")
    DataSet getResourceFromCollection(@Path("collection_id") String collection_id, @Path("resource_id") String resource_id);



}

