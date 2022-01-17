/**
 */
package metamodelREST.impl;

import java.util.Collection;

import metamodelREST.Data;
import metamodelREST.MetamodelRESTPackage;
import metamodelREST.Operation;
import metamodelREST.Request;
import metamodelREST.Route;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodelREST.impl.RequestImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link metamodelREST.impl.RequestImpl#getData <em>Data</em>}</li>
 *   <li>{@link metamodelREST.impl.RequestImpl#getOps <em>Ops</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequestImpl extends MinimalEObjectImpl.Container implements Request {
	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getOps() <em>Ops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOps()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ops;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelRESTPackage.Literals.REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject)route;
			route = (Route)eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelRESTPackage.REQUEST__ROUTE, oldRoute, route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelRESTPackage.REQUEST__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<Data>(Data.class, this, MetamodelRESTPackage.REQUEST__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOps() {
		if (ops == null) {
			ops = new EObjectResolvingEList<Operation>(Operation.class, this, MetamodelRESTPackage.REQUEST__OPS);
		}
		return ops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelRESTPackage.REQUEST__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case MetamodelRESTPackage.REQUEST__DATA:
				return getData();
			case MetamodelRESTPackage.REQUEST__OPS:
				return getOps();
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
			case MetamodelRESTPackage.REQUEST__ROUTE:
				setRoute((Route)newValue);
				return;
			case MetamodelRESTPackage.REQUEST__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
			case MetamodelRESTPackage.REQUEST__OPS:
				getOps().clear();
				getOps().addAll((Collection<? extends Operation>)newValue);
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
			case MetamodelRESTPackage.REQUEST__ROUTE:
				setRoute((Route)null);
				return;
			case MetamodelRESTPackage.REQUEST__DATA:
				getData().clear();
				return;
			case MetamodelRESTPackage.REQUEST__OPS:
				getOps().clear();
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
			case MetamodelRESTPackage.REQUEST__ROUTE:
				return route != null;
			case MetamodelRESTPackage.REQUEST__DATA:
				return data != null && !data.isEmpty();
			case MetamodelRESTPackage.REQUEST__OPS:
				return ops != null && !ops.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequestImpl
