package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes14.dex */
public interface ConstructorDescriptor extends FunctionDescriptor {
    ClassDescriptor a0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ClassifierDescriptorWithTypeParameters b();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    ConstructorDescriptor c(TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    KotlinType getReturnType();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    List<TypeParameterDescriptor> getTypeParameters();

    boolean z();
}
