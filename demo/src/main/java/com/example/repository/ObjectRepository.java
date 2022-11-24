package com.example.repository;

public interface ObjectRepository<T> {
    public void store(T t);

    public T retrieve(long id);

    public T search(String name);

    public T delete(long id);

}
