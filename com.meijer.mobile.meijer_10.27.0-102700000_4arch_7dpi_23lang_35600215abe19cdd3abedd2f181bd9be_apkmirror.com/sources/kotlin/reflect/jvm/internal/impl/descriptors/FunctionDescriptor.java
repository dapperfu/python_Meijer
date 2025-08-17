package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes13.dex */
public interface FunctionDescriptor extends CallableMemberDescriptor {

    public interface CopyBuilder<D extends FunctionDescriptor> {
        CopyBuilder<D> a();

        CopyBuilder<D> b(List<ValueParameterDescriptor> list);

        D build();

        CopyBuilder<D> c(ReceiverParameterDescriptor receiverParameterDescriptor);

        CopyBuilder<D> d();

        CopyBuilder<D> e(ReceiverParameterDescriptor receiverParameterDescriptor);

        CopyBuilder<D> f(TypeSubstitution typeSubstitution);

        <V> CopyBuilder<D> g(CallableDescriptor.UserDataKey<V> userDataKey, V v10);

        CopyBuilder<D> h(DescriptorVisibility descriptorVisibility);

        CopyBuilder<D> i();

        CopyBuilder<D> j(Name name);

        CopyBuilder<D> k(Modality modality);

        CopyBuilder<D> l();

        CopyBuilder<D> m(KotlinType kotlinType);

        CopyBuilder<D> n(CallableMemberDescriptor callableMemberDescriptor);

        CopyBuilder<D> o(boolean z10);

        CopyBuilder<D> p(List<TypeParameterDescriptor> list);

        CopyBuilder<D> q(DeclarationDescriptor declarationDescriptor);

        CopyBuilder<D> r(CallableMemberDescriptor.Kind kind);

        CopyBuilder<D> s(Annotations annotations);

        CopyBuilder<D> t();
    }

    boolean B();

    boolean C0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    FunctionDescriptor a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    DeclarationDescriptor b();

    FunctionDescriptor c(TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    Collection<? extends FunctionDescriptor> d();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    FunctionDescriptor p0();

    CopyBuilder<? extends FunctionDescriptor> t();

    boolean z0();
}
