package es.victorgf87.santanderopenapiwrapper.factories;

import es.victorgf87.santanderopenapiwrapper.apiclasses.SantanderService;
import retrofit.RestAdapter;

/**
 * Created by V�ctor on 14/07/2015.
 */
public class AdapterFactory
{
    public static final String SANTANDER_ENDPOINT="http://datos.santander.es/api";
    public static SantanderService createSantanderService()
    {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(SANTANDER_ENDPOINT)
                .build();

        SantanderService service = restAdapter.create(SantanderService.class);

        return service;
    }
}
