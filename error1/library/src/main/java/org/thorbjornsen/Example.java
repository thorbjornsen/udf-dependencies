package org.thorbjornsen;

import java.util.concurrent.TimeUnit;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Client;

public class Example
{
    public static void process()
    {
        //
        // Basically, just do something with the dependency that has conflicting versions
        //

        Client client = ClientBuilder.newBuilder()
                .connectTimeout(100, TimeUnit.SECONDS)
                .readTimeout(2, TimeUnit.SECONDS)
                .build();

        client.close();
    }
}
