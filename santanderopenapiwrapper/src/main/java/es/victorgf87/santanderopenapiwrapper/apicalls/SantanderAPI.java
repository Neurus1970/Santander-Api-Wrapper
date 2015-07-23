package es.victorgf87.santanderopenapiwrapper.apicalls;

import android.support.annotation.WorkerThread;
import android.widget.Adapter;

import es.victorgf87.santanderopenapiwrapper.apiclasses.SantanderService;
import es.victorgf87.santanderopenapiwrapper.factories.AdapterFactory;
import es.victorgf87.santanderopenapiwrapper.serializedclasses.CollectionsList;
import es.victorgf87.santanderopenapiwrapper.serializedclasses.DataSet;
import es.victorgf87.santanderopenapiwrapper.serializedclasses.Kollektion;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by V�ctor on 14/07/2015.
 */
@WorkerThread
public class SantanderAPI implements SantanderService
{
    @Override
    public CollectionsList getAllCollections()
    {
        SantanderService service=AdapterFactory.createSantanderService();
        CollectionsList obj=service.getAllCollections();
        obj.getCollections();
        return obj;
    }

    @Override
    public CollectionsList getAllCollections(Integer items,Integer page)
    {
        SantanderService service=AdapterFactory.createSantanderService();
        CollectionsList ret=service.getAllCollections(items, page);
        return ret;
    }

    @Override
    public DataSet getCollectionDataSet(String collection_id)
    {
        SantanderService service = AdapterFactory.createSantanderService();

        DataSet obj = service.getCollectionDataSet(collection_id);

        return obj;
    }

    @Override
    public DataSet getCollectionDataSet(String collection_id, Integer items, Integer page)
    {
        SantanderService service=AdapterFactory.createSantanderService();
        DataSet obj=service.getCollectionDataSet(collection_id, items, page);
        return obj;
    }

    @Override
    public Kollektion getCollection(String collection_id)
    {
        SantanderService service=AdapterFactory.createSantanderService();
        Kollektion obj=service.getCollection(collection_id);
        return obj;
    }

    @Override
    public DataSet getResourceFromCollection(String collection_id, String resource_id)
    {
        SantanderService service= AdapterFactory.createSantanderService();
        DataSet ret=service.getResourceFromCollection(collection_id,resource_id);
        return ret;
    }




}
