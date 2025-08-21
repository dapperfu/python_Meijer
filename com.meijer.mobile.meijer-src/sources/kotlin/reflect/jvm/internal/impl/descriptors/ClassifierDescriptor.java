package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* loaded from: classes14.dex */
public interface ClassifierDescriptor extends DeclarationDescriptorNonRoot {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ClassifierDescriptor a();

    TypeConstructor i();

    SimpleType o();
}
