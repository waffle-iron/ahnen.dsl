/**
 * generated by Xtext 2.10.0
 */
package com.github.funthomas424242.dsl.ahnen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dateiart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.funthomas424242.dsl.ahnen.Dateiart#getBuch <em>Buch</em>}</li>
 *   <li>{@link com.github.funthomas424242.dsl.ahnen.Dateiart#getFamilie <em>Familie</em>}</li>
 * </ul>
 *
 * @see com.github.funthomas424242.dsl.ahnen.AhnenPackage#getDateiart()
 * @model
 * @generated
 */
public interface Dateiart extends EObject
{
  /**
   * Returns the value of the '<em><b>Buch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buch</em>' containment reference.
   * @see #setBuch(Familienbuch)
   * @see com.github.funthomas424242.dsl.ahnen.AhnenPackage#getDateiart_Buch()
   * @model containment="true"
   * @generated
   */
  Familienbuch getBuch();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.dsl.ahnen.Dateiart#getBuch <em>Buch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Buch</em>' containment reference.
   * @see #getBuch()
   * @generated
   */
  void setBuch(Familienbuch value);

  /**
   * Returns the value of the '<em><b>Familie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Familie</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Familie</em>' containment reference.
   * @see #setFamilie(Familie)
   * @see com.github.funthomas424242.dsl.ahnen.AhnenPackage#getDateiart_Familie()
   * @model containment="true"
   * @generated
   */
  Familie getFamilie();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.dsl.ahnen.Dateiart#getFamilie <em>Familie</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Familie</em>' containment reference.
   * @see #getFamilie()
   * @generated
   */
  void setFamilie(Familie value);

} // Dateiart
