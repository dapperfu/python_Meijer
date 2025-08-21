package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes14.dex */
public final class ErrorPropertyDescriptor implements PropertyDescriptor {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ PropertyDescriptorImpl f147784a;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean A() {
        return this.f147784a.A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void A0(Collection<? extends CallableMemberDescriptor> overriddenDescriptors) {
        Intrinsics.j(overriddenDescriptors, "overriddenDescriptors");
        this.f147784a.A0(overriddenDescriptors);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor J() {
        return this.f147784a.J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean L() {
        return this.f147784a.L();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor M(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z10) {
        PropertyDescriptor propertyDescriptorL0 = this.f147784a.M(declarationDescriptor, modality, descriptorVisibility, kind, z10);
        Intrinsics.i(propertyDescriptorL0, "copy(...)");
        return propertyDescriptorL0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor N() {
        return this.f147784a.N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor O() {
        return this.f147784a.O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean V() {
        return this.f147784a.V();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public PropertyDescriptor H0() {
        PropertyDescriptor propertyDescriptorH0 = this.f147784a.H0();
        Intrinsics.i(propertyDescriptorH0, "getOriginal(...)");
        return propertyDescriptorH0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor b() {
        DeclarationDescriptor declarationDescriptorB = this.f147784a.b();
        Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
        return declarationDescriptorB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public PropertyDescriptor c(TypeSubstitutor substitutor) {
        Intrinsics.j(substitutor, "substitutor");
        return this.f147784a.c(substitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<? extends PropertyDescriptor> d() {
        Collection<? extends PropertyDescriptor> collectionD = this.f147784a.d();
        Intrinsics.i(collectionD, "getOverriddenDescriptors(...)");
        return collectionD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean d0() {
        return this.f147784a.d0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind f() {
        CallableMemberDescriptor.Kind kindF = this.f147784a.f();
        Intrinsics.i(kindF, "getKind(...)");
        return kindF;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement g() {
        SourceElement sourceElementG = this.f147784a.g();
        Intrinsics.i(sourceElementG, "getSource(...)");
        return sourceElementG;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.f147784a.getAnnotations();
        Intrinsics.i(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertyGetterDescriptor getGetter() {
        return this.f147784a.getGetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        Name name = this.f147784a.getName();
        Intrinsics.i(name, "getName(...)");
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.f147784a.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertySetterDescriptor getSetter() {
        return this.f147784a.getSetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    public KotlinType getType() {
        KotlinType type = this.f147784a.getType();
        Intrinsics.i(type, "getType(...)");
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> typeParameters = this.f147784a.getTypeParameters();
        Intrinsics.i(typeParameters, "getTypeParameters(...)");
        return typeParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.f147784a.getVisibility();
        Intrinsics.i(visibility, "getVisibility(...)");
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ValueParameterDescriptor> h() {
        List<ValueParameterDescriptor> listH = this.f147784a.h();
        Intrinsics.i(listH, "getValueParameters(...)");
        return listH;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean h0() {
        return this.f147784a.h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.f147784a.isConst();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f147784a.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public ConstantValue<?> l0() {
        return this.f147784a.l0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality q() {
        Modality modalityQ = this.f147784a.q();
        Intrinsics.i(modalityQ, "getModality(...)");
        return modalityQ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V r0(CallableDescriptor.UserDataKey<V> userDataKey) {
        return (V) this.f147784a.r0(userDataKey);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor t0() {
        return this.f147784a.t0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public List<PropertyAccessorDescriptor> u() {
        List<PropertyAccessorDescriptor> listU = this.f147784a.u();
        Intrinsics.i(listU, "getAccessors(...)");
        return listU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ReceiverParameterDescriptor> u0() {
        List<ReceiverParameterDescriptor> listU0 = this.f147784a.u0();
        Intrinsics.i(listU0, "getContextReceiverParameters(...)");
        return listU0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean v0() {
        return this.f147784a.v0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return (R) this.f147784a.x(declarationDescriptorVisitor, d10);
    }

    public ErrorPropertyDescriptor() {
        ErrorUtils errorUtils = ErrorUtils.f147897a;
        PropertyDescriptorImpl propertyDescriptorImplM0 = PropertyDescriptorImpl.M0(errorUtils.h(), Annotations.f144596s3.b(), Modality.f144528d, DescriptorVisibilities.f144507e, true, Name.u(ErrorEntity.f147771f.b()), CallableMemberDescriptor.Kind.DECLARATION, SourceElement.f144554a, false, false, false, false, false, false);
        propertyDescriptorImplM0.Z0(errorUtils.k(), CollectionsKt.m(), null, null, CollectionsKt.m());
        this.f147784a = propertyDescriptorImplM0;
    }
}
