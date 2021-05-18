package org.jugnicaragua.app.pico.data.dao;

import java.util.List;

/**
 * 
 * @author  :Gustavo Castro <gacsnic75@gmail.com>
 * @version :1.0 
 * @param <T> En la clase que lo implemente se sustituye por la clase entidad
 */
public interface CrearRegistrosDao<T> {
     void insertarRegistros(List<T> lista);
}
