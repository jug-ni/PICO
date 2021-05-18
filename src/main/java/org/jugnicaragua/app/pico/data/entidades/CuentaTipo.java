package org.jugnicaragua.app.pico.data.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;


/**
 * Clase que representa la entidad o tabla CuentaTipo.
 *
 * @author :Gustavo Castro <gacsnic75@gmail.com>
 * @license : GPLv3
 *
 */
@Entity
@Table(name = "CuentaTipo", indexes = {@Index(name = "idx_tipocuenta", columnList = "Descripcion")})
public class CuentaTipo extends Identificador<Short> {

  @Column(name = "Descripcion", length = 50)
  private String descripcion;

  public CuentaTipo(String descripcion) {
    this.descripcion = descripcion;
  }


  /**
   * Constructor Vacio requerido, para cuando no se tiene los valores al instanciar la clase
   * TipoCuenta
   */
  public CuentaTipo() {}

  /**
   * Devuelve el nombre del tipo de cuenta
   * 
   * @return String
   */
  public String getDescripcion() {
    return descripcion;
  }

  /**
   * Establece la descripcion del tipo de cuenta
   * 
   * @param descripcion
   */
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  /**
   * Nos devuelve las cuentas que se relacionan con el tipo de cuenta
   * 
   * @return List<Cuenta>
   */
  /*
   * public List<Cuenta> getCuentas() { return cuentas; }
   * 
   * /** Establece las cuentas que le corresponde a tipo de cuenta
   * 
   * @param cuentas
   */
  /*
   * public void setCuentas(List<Cuenta> cuentas) { this.cuentas = cuentas; }
   */

  @Override
  public String toString() {
    return "CuentaTipo{" + "id=" + id + ", descripcion=" + descripcion + ", cuentas=" + '}';
  }

}
