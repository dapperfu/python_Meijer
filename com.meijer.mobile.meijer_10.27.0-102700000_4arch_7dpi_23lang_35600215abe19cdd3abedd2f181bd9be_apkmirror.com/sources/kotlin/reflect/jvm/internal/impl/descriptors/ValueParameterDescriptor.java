package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
public interface ValueParameterDescriptor extends ParameterDescriptor, VariableDescriptor {

    public static final class DefaultImpls {
    }

    ValueParameterDescriptor X(CallableDescriptor callableDescriptor, Name name, int i10);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ValueParameterDescriptor a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    CallableDescriptor b();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    Collection<ValueParameterDescriptor> d();

    int getIndex();

    boolean m0();

    boolean o0();

    KotlinType s0();

    boolean x0();
}
