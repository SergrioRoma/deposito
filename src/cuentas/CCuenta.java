package cuentas;

/**
 * Cuenta bancaria
 *
 * @author sergi
 */
public class CCuenta {

  private String nombre;
  private String cuenta;
  private double saldo;
  private double tipoInterés;

  /**
   * Constructor
   */
  public CCuenta() {
  }

  /**
   * Constructor
   *
   * @param nom nombre del titular
   * @param cue numero de cuenta
   * @param sal saldo de cuenta
   * @param tipo tipo de interes
   */
  public CCuenta(String nom, String cue, double sal, double tipo) {
    nombre = nom;
    cuenta = cue;
    saldo = sal;
  }

  /**
   * Devuelve el saldo de la cuenta
   *
   * @return el saldo
   */
  public double estado() {
    return getSaldo();
  }

  /**
   * Ingresa dinero en cuena
   *
   * @param cantidad
   * @throws Exception no se puede ingresar cantidad negativa
   */
  public void ingresar(double cantidad) throws Exception {
    if (cantidad < 0) {
      throw new Exception("No se puede ingresar una cantidad negativa");
    }
    setSaldo(getSaldo() + cantidad);
  }

  /**
   * Sacar dinero de la cuenta
   *
   * @param cantidad importe que se quiere sacar de la cuenta
   * @throws Exception no permite cantidad negativa ni exceder el saldo
   */
  public void retirar(double cantidad) throws Exception {
    if (cantidad <= 0) {
      throw new Exception("No se puede retirar una cantidad negativa");
    }
    if (estado() < cantidad) {
      throw new Exception("No se hay suficiente saldo");
    }
    setSaldo(getSaldo() - cantidad);
  }

  /**
   * Devuelve el nombre de la cuenta
   *
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Pone el nombre a la cuenta
   *
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Devue el numero de cuenta
   *
   * @return the cuenta
   */
  public String getCuenta() {
    return cuenta;
  }

  /**
   * Pone el numero de cuenta
   *
   * @param cuenta the cuenta to set
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Devuelve el saldo
   *
   * @return the saldo
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * Añade saldo a la cuenta
   *
   * @param saldo the saldo to set
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Devuelve el tipo de interes
   *
   * @return the tipoInterés
   */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * Pone el tipo de interes
   *
   * @param tipoInterés the tipoInterés to set
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
