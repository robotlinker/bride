/**
 * Copyright (c) 2011 Katholieke Universiteit Leuven
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 * 
 *     Hugo A. Garica - initial API and implementation
 * and/or initial documentation.
 * 
 *     Herman Bruyninckx - Supervisor.
 */
package org.best_of_robotics.model.Cpf.impl;

import java.util.Collection;

import org.best_of_robotics.model.Cpf.CpfPackage;
import org.best_of_robotics.model.Cpf.Description;
import org.best_of_robotics.model.Cpf.Sequence;
import org.best_of_robotics.model.Cpf.Simple;
import org.best_of_robotics.model.Cpf.Struct;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.StructImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.StructImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.StructImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.StructImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.StructImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.impl.StructImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructImpl extends EObjectImpl implements Struct {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getSimple() <em>Simple</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple()
	 * @generated
	 * @ordered
	 */
	protected EList<Simple> simple;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence sequence;

	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected EList<Struct> struct;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpfPackage.Literals.STRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription,
			NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, CpfPackage.STRUCT__DESCRIPTION,
					oldDescription, newDescription);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- CpfPackage.STRUCT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- CpfPackage.STRUCT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpfPackage.STRUCT__DESCRIPTION, newDescription,
					newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Simple> getSimple() {
		if (simple == null) {
			simple = new EObjectContainmentEList<Simple>(Simple.class, this,
					CpfPackage.STRUCT__SIMPLE);
		}
		return simple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(Sequence newSequence,
			NotificationChain msgs) {
		Sequence oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, CpfPackage.STRUCT__SEQUENCE, oldSequence,
					newSequence);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Sequence newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject) sequence).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpfPackage.STRUCT__SEQUENCE,
						null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject) newSequence).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpfPackage.STRUCT__SEQUENCE,
						null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpfPackage.STRUCT__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Struct> getStruct() {
		if (struct == null) {
			struct = new EObjectContainmentEList<Struct>(Struct.class, this,
					CpfPackage.STRUCT__STRUCT);
		}
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpfPackage.STRUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpfPackage.STRUCT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpfPackage.STRUCT__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpfPackage.STRUCT__SIMPLE:
			return ((InternalEList<?>) getSimple()).basicRemove(otherEnd, msgs);
		case CpfPackage.STRUCT__SEQUENCE:
			return basicSetSequence(null, msgs);
		case CpfPackage.STRUCT__STRUCT:
			return ((InternalEList<?>) getStruct()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpfPackage.STRUCT__DESCRIPTION:
			return getDescription();
		case CpfPackage.STRUCT__SIMPLE:
			return getSimple();
		case CpfPackage.STRUCT__SEQUENCE:
			return getSequence();
		case CpfPackage.STRUCT__STRUCT:
			return getStruct();
		case CpfPackage.STRUCT__NAME:
			return getName();
		case CpfPackage.STRUCT__TYPE:
			return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpfPackage.STRUCT__DESCRIPTION:
			setDescription((Description) newValue);
			return;
		case CpfPackage.STRUCT__SIMPLE:
			getSimple().clear();
			getSimple().addAll((Collection<? extends Simple>) newValue);
			return;
		case CpfPackage.STRUCT__SEQUENCE:
			setSequence((Sequence) newValue);
			return;
		case CpfPackage.STRUCT__STRUCT:
			getStruct().clear();
			getStruct().addAll((Collection<? extends Struct>) newValue);
			return;
		case CpfPackage.STRUCT__NAME:
			setName((String) newValue);
			return;
		case CpfPackage.STRUCT__TYPE:
			setType((String) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case CpfPackage.STRUCT__DESCRIPTION:
			setDescription((Description) null);
			return;
		case CpfPackage.STRUCT__SIMPLE:
			getSimple().clear();
			return;
		case CpfPackage.STRUCT__SEQUENCE:
			setSequence((Sequence) null);
			return;
		case CpfPackage.STRUCT__STRUCT:
			getStruct().clear();
			return;
		case CpfPackage.STRUCT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CpfPackage.STRUCT__TYPE:
			setType(TYPE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CpfPackage.STRUCT__DESCRIPTION:
			return description != null;
		case CpfPackage.STRUCT__SIMPLE:
			return simple != null && !simple.isEmpty();
		case CpfPackage.STRUCT__SEQUENCE:
			return sequence != null;
		case CpfPackage.STRUCT__STRUCT:
			return struct != null && !struct.isEmpty();
		case CpfPackage.STRUCT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case CpfPackage.STRUCT__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StructImpl
