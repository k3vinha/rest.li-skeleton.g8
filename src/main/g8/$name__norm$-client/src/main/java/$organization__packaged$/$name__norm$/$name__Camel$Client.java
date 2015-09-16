package $organization$.$name;format="norm"$;

import com.linkedin.common.callback.FutureCallback;
import com.linkedin.common.util.None;
import com.linkedin.r2.transport.common.Client;
import com.linkedin.r2.transport.common.bridge.client.TransportClientAdapter;
import com.linkedin.r2.transport.http.client.HttpClientFactory;
import com.linkedin.restli.client.Request;
import com.linkedin.restli.client.Response;
import com.linkedin.restli.client.ResponseFuture;
import com.linkedin.restli.client.RestClient;

import java.util.Collections;

public class $name;format="Camel"$Client {

    private static final $name;format="Camel"$RequestBuilders _$restli_resource_entity;format="camel"$Builders = new $name;format="Camel"$RequestBuilders();

    /**
     * This stand-alone app demos the client-side Rest.li API.
     * To see the demo, run the server, then start the client
     */
    public static void main(String[] args) throws Exception {
        // Create an HttpClient and wrap it in an abstraction layer
        final HttpClientFactory http = new HttpClientFactory();
        final Client r2Client = new TransportClientAdapter(
                http.getClient(Collections.<String, String>emptyMap()));

        // Create a RestClient to talk to localhost:8080
        RestClient restClient = new RestClient(r2Client, "http://localhost:8080/");

        // Generate a random ID for a $restli_resource_entity;format="camel"$ cookie, in the range 0-5
        long $restli_resource_entity;format="camel"$Id = (long) (Math.random() * 5);

        // Construct a request for the specified $restli_resource_entity;format="camel"$
        $name;format="Camel"$GetRequestBuilder getBuilder = _$restli_resource_entity;format="camel"$Builders.get();
        Request<$restli_resource_entity$> getReq = getBuilder.id($restli_resource_entity;format="camel"$Id).build();

        // Send the request and wait for a response
        final ResponseFuture<$restli_resource_entity$> getFuture = restClient.sendRequest(getReq);
        final Response<$restli_resource_entity$> resp = getFuture.getResponse();

        // Print the response
        System.out.println(resp.getEntity().getMessage());

        // shutdown
        restClient.shutdown(new FutureCallback<None>());
        http.shutdown(new FutureCallback<None>());
    }

}