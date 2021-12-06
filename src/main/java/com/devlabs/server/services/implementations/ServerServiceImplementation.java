package com.devlabs.server.services.implementations;

import com.devlabs.server.model.Server;
import com.devlabs.server.services.ServerService;

import java.util.Collection;

public class ServerServiceImplementation implements ServerService {

    @Override
    public Server create(Server server) {
        return null;
    }

    @Override
    public Server ping(String ipAddress) {
        return null;
    }

    @Override
    public Collection<Server> list(int limit) {
        return null;
    }

    @Override
    public Server get(Long id) {
        return null;
    }

    @Override
    public Server update(Server server) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
