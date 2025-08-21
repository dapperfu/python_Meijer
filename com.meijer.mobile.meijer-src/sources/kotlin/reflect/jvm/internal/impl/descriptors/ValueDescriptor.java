package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public interface ValueDescriptor extends CallableDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    DeclarationDescriptor b();

    KotlinType getType();
}
