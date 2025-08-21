package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

/* loaded from: classes14.dex */
public interface TypeParameterDescriptor extends ClassifierDescriptor, TypeParameterMarker {
    StorageManager K();

    boolean P();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    TypeParameterDescriptor a();

    int getIndex();

    List<KotlinType> getUpperBounds();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    TypeConstructor i();

    Variance k();

    boolean v();
}
