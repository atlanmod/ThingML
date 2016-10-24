/**
 * Copyright (C) 2014 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.thingML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.SimpleParamRef;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Param Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.SimpleParamRefImpl#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleParamRefImpl extends ElmtPropertyImpl implements SimpleParamRef
{
  /**
   * The cached value of the '{@link #getParameterRef() <em>Parameter Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterRef()
   * @generated
   * @ordered
   */
  protected Parameter parameterRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleParamRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ThingMLPackage.Literals.SIMPLE_PARAM_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParameterRef()
  {
    if (parameterRef != null && parameterRef.eIsProxy())
    {
      InternalEObject oldParameterRef = (InternalEObject)parameterRef;
      parameterRef = (Parameter)eResolveProxy(oldParameterRef);
      if (parameterRef != oldParameterRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.SIMPLE_PARAM_REF__PARAMETER_REF, oldParameterRef, parameterRef));
      }
    }
    return parameterRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetParameterRef()
  {
    return parameterRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterRef(Parameter newParameterRef)
  {
    Parameter oldParameterRef = parameterRef;
    parameterRef = newParameterRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.SIMPLE_PARAM_REF__PARAMETER_REF, oldParameterRef, parameterRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ThingMLPackage.SIMPLE_PARAM_REF__PARAMETER_REF:
        if (resolve) return getParameterRef();
        return basicGetParameterRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ThingMLPackage.SIMPLE_PARAM_REF__PARAMETER_REF:
        setParameterRef((Parameter)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ThingMLPackage.SIMPLE_PARAM_REF__PARAMETER_REF:
        setParameterRef((Parameter)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ThingMLPackage.SIMPLE_PARAM_REF__PARAMETER_REF:
        return parameterRef != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleParamRefImpl
