package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;

/* loaded from: classes13.dex */
public final class ErrorFunctionDescriptor extends SimpleFunctionDescriptorImpl {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void A0(Collection<? extends CallableMemberDescriptor> overriddenDescriptors) {
        Intrinsics.j(overriddenDescriptors, "overriddenDescriptors");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    protected FunctionDescriptorImpl I0(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement source) {
        Intrinsics.j(newOwner, "newOwner");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(source, "source");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public SimpleFunctionDescriptor M(DeclarationDescriptor newOwner, Modality modality, DescriptorVisibility visibility, CallableMemberDescriptor.Kind kind, boolean z10) {
        Intrinsics.j(newOwner, "newOwner");
        Intrinsics.j(modality, "modality");
        Intrinsics.j(visibility, "visibility");
        Intrinsics.j(kind, "kind");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V r0(CallableDescriptor.UserDataKey<V> key) {
        Intrinsics.j(key, "key");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorFunctionDescriptor(ClassDescriptor containingDeclaration) {
        super(containingDeclaration, null, Annotations.f143689s3.b(), Name.u(ErrorEntity.f146861c.b()), CallableMemberDescriptor.Kind.DECLARATION, SourceElement.f143647a);
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        O0(null, null, CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m(), ErrorUtils.d(ErrorTypeKind.f146956k, new String[0]), Modality.f143621d, DescriptorVisibilities.f143600e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> t() {
        return new FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.types.error.ErrorFunctionDescriptor$newCopyBuilder$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> a() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> b(List<? extends ValueParameterDescriptor> parameters) {
                Intrinsics.j(parameters, "parameters");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> c(ReceiverParameterDescriptor receiverParameterDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> d() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> e(ReceiverParameterDescriptor receiverParameterDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> f(TypeSubstitution substitution) {
                Intrinsics.j(substitution, "substitution");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public <V> FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> g(CallableDescriptor.UserDataKey<V> userDataKey, V v10) {
                Intrinsics.j(userDataKey, "userDataKey");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> h(DescriptorVisibility visibility) {
                Intrinsics.j(visibility, "visibility");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> i() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> j(Name name) {
                Intrinsics.j(name, "name");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> k(Modality modality) {
                Intrinsics.j(modality, "modality");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> l() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> m(KotlinType type) {
                Intrinsics.j(type, "type");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> n(CallableMemberDescriptor callableMemberDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> o(boolean z10) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> p(List<? extends TypeParameterDescriptor> parameters) {
                Intrinsics.j(parameters, "parameters");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> q(DeclarationDescriptor owner) {
                Intrinsics.j(owner, "owner");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> r(CallableMemberDescriptor.Kind kind) {
                Intrinsics.j(kind, "kind");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> s(Annotations additionalAnnotations) {
                Intrinsics.j(additionalAnnotations, "additionalAnnotations");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public FunctionDescriptor.CopyBuilder<SimpleFunctionDescriptor> t() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public SimpleFunctionDescriptor build() {
                return this.f146870a;
            }
        };
    }
}
