package org.jugni.apps.pico;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jugnicaragua.app.pico.configuraciones.HibernateConfiguracion;
import org.jugnicaragua.app.pico.data.entidades.CuentaTipo;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {

  private static CuentaTipo modelo1;
  private static CuentaTipo modelo2;
  private List<CuentaTipo> lstDatos;
  final String SQLQUERY = "FROM CuentaTipo";

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    modelo1 = new CuentaTipo("Activo");
    modelo2 = new CuentaTipo("Circulante");
  }

  @Test
  public void test() {
    HibernateConfiguracion hibernateConfiguracion = new HibernateConfiguracion();
    Session session = hibernateConfiguracion.getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    session.save(modelo1);
    session.save(modelo2);
//        session.save(new Cuenta("01-00-00000","Activo",1,1,"Algo",modelo1));
//        session.save(new Cuenta("01-01-00000","Circulante",1,1,"Algo",modelo2));
    transaction.commit();
    lstDatos = session.createQuery(SQLQUERY).getResultList();
    assertNotNull(lstDatos);
    assertEquals(2, lstDatos.size());
  }

  @AfterClass
  public static void setUpAfterClass() throws Exception {
  }
}
