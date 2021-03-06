package com.gowhich.androidsqlite.service;

import java.util.List;
import java.util.Map;

/**
 * Created by durban126 on 16/9/20.
 */
public interface PersonService {
    public boolean addPerson(Object[] params);

    public boolean deletePerson(Object[] params);

    public boolean updatePerson(Object[] params);

    public Map<String, String> viewPerson(String[] args);

    public List<Map<String, String>> listPerson(String[] args);
}
