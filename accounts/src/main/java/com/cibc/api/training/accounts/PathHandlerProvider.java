
package com.cibc.api.training.accounts;

import com.cibc.api.training.accounts.handler.AccountsIdGetHandler;
import com.cibc.api.training.accounts.provider.OLProvider;
import com.networknt.health.HealthGetHandler;
import com.networknt.info.ServerInfoGetHandler;
import com.networknt.server.HandlerProvider;

import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.util.Methods;

public class PathHandlerProvider implements HandlerProvider {
    @Override
    public HttpHandler getHandler() {
    	OLProvider.INSTANCE.initApplicationContext();
    	
        return Handlers.routing()
            .add(Methods.GET, "/v1/accounts/{id}", new AccountsIdGetHandler())
            .add(Methods.GET, "/v1/health", new HealthGetHandler());
    }
}
