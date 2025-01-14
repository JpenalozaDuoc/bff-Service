package bff_router.service;

import java.util.Map;


public interface BffService {

    String read(String id);

    String read();

    String create(Map<String, String> body);

    String update(String status);

    String delete(String id);
}
