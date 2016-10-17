/**
 * generated by Xtext 2.10.0
 */
package com.github.funthomas424242.dsl.ahnen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.funthomas424242.dsl.ahnen.Model#getDatei <em>Datei</em>}</li>
 * </ul>
 *
 * @see com.github.funthomas424242.dsl.ahnen.AhnenPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Datei</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datei</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datei</em>' containment reference.
   * @see #setDatei(Dateiart)
   * @see com.github.funthomas424242.dsl.ahnen.AhnenPackage#getModel_Datei()
   * @model containment="true"
   * @generated
   */
  Dateiart getDatei();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.dsl.ahnen.Model#getDatei <em>Datei</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datei</em>' containment reference.
   * @see #getDatei()
   * @generated
   */
  void setDatei(Dateiart value);

} // Model
