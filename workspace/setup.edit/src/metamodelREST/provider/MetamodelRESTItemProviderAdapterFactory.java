/**
 */
package metamodelREST.provider;

import java.util.ArrayList;
import java.util.Collection;

import metamodelREST.util.MetamodelRESTAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelRESTItemProviderAdapterFactory extends MetamodelRESTAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelRESTItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.ReGet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReGetItemProvider reGetItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.ReGet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReGetAdapter() {
		if (reGetItemProvider == null) {
			reGetItemProvider = new ReGetItemProvider(this);
		}

		return reGetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.RePost} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RePostItemProvider rePostItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.RePost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRePostAdapter() {
		if (rePostItemProvider == null) {
			rePostItemProvider = new RePostItemProvider(this);
		}

		return rePostItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.RePut} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RePutItemProvider rePutItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.RePut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRePutAdapter() {
		if (rePutItemProvider == null) {
			rePutItemProvider = new RePutItemProvider(this);
		}

		return rePutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.ReDelete} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReDeleteItemProvider reDeleteItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.ReDelete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReDeleteAdapter() {
		if (reDeleteItemProvider == null) {
			reDeleteItemProvider = new ReDeleteItemProvider(this);
		}

		return reDeleteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.Route} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteItemProvider routeItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRouteAdapter() {
		if (routeItemProvider == null) {
			routeItemProvider = new RouteItemProvider(this);
		}

		return routeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.Segment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentItemProvider segmentItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.Segment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSegmentAdapter() {
		if (segmentItemProvider == null) {
			segmentItemProvider = new SegmentItemProvider(this);
		}

		return segmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.Attachments} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentsItemProvider attachmentsItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.Attachments}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttachmentsAdapter() {
		if (attachmentsItemProvider == null) {
			attachmentsItemProvider = new AttachmentsItemProvider(this);
		}

		return attachmentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.Random} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomItemProvider randomItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.Random}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRandomAdapter() {
		if (randomItemProvider == null) {
			randomItemProvider = new RandomItemProvider(this);
		}

		return randomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.OpCreate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpCreateItemProvider opCreateItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.OpCreate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpCreateAdapter() {
		if (opCreateItemProvider == null) {
			opCreateItemProvider = new OpCreateItemProvider(this);
		}

		return opCreateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.FieldSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldSetItemProvider fieldSetItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.FieldSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldSetAdapter() {
		if (fieldSetItemProvider == null) {
			fieldSetItemProvider = new FieldSetItemProvider(this);
		}

		return fieldSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.OpRead} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpReadItemProvider opReadItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.OpRead}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpReadAdapter() {
		if (opReadItemProvider == null) {
			opReadItemProvider = new OpReadItemProvider(this);
		}

		return opReadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.OpUpdate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpUpdateItemProvider opUpdateItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.OpUpdate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpUpdateAdapter() {
		if (opUpdateItemProvider == null) {
			opUpdateItemProvider = new OpUpdateItemProvider(this);
		}

		return opUpdateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.OpDelete} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpDeleteItemProvider opDeleteItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.OpDelete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpDeleteAdapter() {
		if (opDeleteItemProvider == null) {
			opDeleteItemProvider = new OpDeleteItemProvider(this);
		}

		return opDeleteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.Answer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerItemProvider answerItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnswerAdapter() {
		if (answerItemProvider == null) {
			answerItemProvider = new AnswerItemProvider(this);
		}

		return answerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.Struct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructItemProvider structItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.Struct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructAdapter() {
		if (structItemProvider == null) {
			structItemProvider = new StructItemProvider(this);
		}

		return structItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodelREST.RestSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestSystemItemProvider restSystemItemProvider;

	/**
	 * This creates an adapter for a {@link metamodelREST.RestSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRestSystemAdapter() {
		if (restSystemItemProvider == null) {
			restSystemItemProvider = new RestSystemItemProvider(this);
		}

		return restSystemItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (reGetItemProvider != null) reGetItemProvider.dispose();
		if (rePostItemProvider != null) rePostItemProvider.dispose();
		if (rePutItemProvider != null) rePutItemProvider.dispose();
		if (reDeleteItemProvider != null) reDeleteItemProvider.dispose();
		if (routeItemProvider != null) routeItemProvider.dispose();
		if (segmentItemProvider != null) segmentItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (attachmentsItemProvider != null) attachmentsItemProvider.dispose();
		if (randomItemProvider != null) randomItemProvider.dispose();
		if (opCreateItemProvider != null) opCreateItemProvider.dispose();
		if (fieldSetItemProvider != null) fieldSetItemProvider.dispose();
		if (opReadItemProvider != null) opReadItemProvider.dispose();
		if (opUpdateItemProvider != null) opUpdateItemProvider.dispose();
		if (opDeleteItemProvider != null) opDeleteItemProvider.dispose();
		if (answerItemProvider != null) answerItemProvider.dispose();
		if (structItemProvider != null) structItemProvider.dispose();
		if (restSystemItemProvider != null) restSystemItemProvider.dispose();
	}

}