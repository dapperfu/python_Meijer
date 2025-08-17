package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;

/* loaded from: classes13.dex */
public interface ClassDescriptor extends ClassOrPackageFragmentDescriptor, ClassifierDescriptorWithTypeParameters {
    ClassConstructorDescriptor C();

    boolean F0();

    ReceiverParameterDescriptor G0();

    MemberScope R();

    ValueClassRepresentation<SimpleType> S();

    MemberScope U();

    List<ReceiverParameterDescriptor> W();

    boolean Z();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ClassDescriptor a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    DeclarationDescriptor b();

    boolean b0();

    ClassKind f();

    DescriptorVisibility getVisibility();

    boolean isInline();

    Collection<ClassConstructorDescriptor> j();

    MemberScope j0();

    ClassDescriptor k0();

    MemberScope n0(TypeSubstitution typeSubstitution);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    SimpleType o();

    List<TypeParameterDescriptor> p();

    Modality q();

    boolean r();

    Collection<ClassDescriptor> w();
}
