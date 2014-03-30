/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning.object.repository.interfaces;

import java.util.List;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 * @param <T>
 */
public interface CRUD<T> {
    public void save(T object);
    public void delete(T object);
    public void update(T object);
    public T find(int id);
    public List<T> all();
}
