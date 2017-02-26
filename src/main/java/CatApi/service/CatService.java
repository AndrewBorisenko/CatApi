package CatApi.service;

import CatApi.entity.Cat;

import java.util.List;

public interface CatService {

    List<Cat> getAll();
    Cat getByID(long id);
    Cat save(Cat Cat);
    void remove(long id);

}
