package es.victorgf87.santanderopenapiwrapper.apicalls;

import android.support.annotation.WorkerThread;

import es.victorgf87.santanderopenapiwrapper.apiclasses.SantanderService;
import es.victorgf87.santanderopenapiwrapper.factories.AdapterFactory;
import es.victorgf87.santanderopenapiwrapper.serializedclasses.CollectionsList;
import es.victorgf87.santanderopenapiwrapper.serializedclasses.DataSet;

/**
 * Created by V�ctor on 14/07/2015.
 */
@WorkerThread
public class SantanderAPI
{
    public CollectionsList getAllCollections()
    {
        SantanderService service=AdapterFactory.createSantanderService();
        CollectionsList obj=service.getAllCollections();
        obj.getCollections();
        return obj;
    }

    public CollectionsList getCollection(String collection_id)
    {
        SantanderService service = AdapterFactory.createSantanderService();

        DataSet obj = service.getCollection(collection_id);

        return null;
    }




}
