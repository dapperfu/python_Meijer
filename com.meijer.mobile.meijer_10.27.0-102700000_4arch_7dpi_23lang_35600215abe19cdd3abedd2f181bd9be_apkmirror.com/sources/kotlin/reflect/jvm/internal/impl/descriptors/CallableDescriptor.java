package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
public interface CallableDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility, Substitutable<CallableDescriptor> {

    public interface UserDataKey<V> {
    }

    ReceiverParameterDescriptor J();

    ReceiverParameterDescriptor N();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    CallableDescriptor a();

    Collection<? extends CallableDescriptor> d();

    boolean d0();

    KotlinType getReturnType();

    List<TypeParameterDescriptor> getTypeParameters();

    List<ValueParameterDescriptor> h();

    <V> V r0(UserDataKey<V> userDataKey);

    List<ReceiverParameterDescriptor> u0();
}
