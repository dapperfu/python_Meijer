package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes14.dex */
public abstract class PropertyAccessorDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PropertyAccessorDescriptor {

    /* renamed from: e, reason: collision with root package name */
    private boolean f144855e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f144856f;

    /* renamed from: g, reason: collision with root package name */
    private final Modality f144857g;

    /* renamed from: h, reason: collision with root package name */
    private final PropertyDescriptor f144858h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f144859i;

    /* renamed from: j, reason: collision with root package name */
    private final CallableMemberDescriptor.Kind f144860j;

    /* renamed from: k, reason: collision with root package name */
    private DescriptorVisibility f144861k;

    /* renamed from: l, reason: collision with root package name */
    private FunctionDescriptor f144862l;

    private static /* synthetic */ void e0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void A0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            e0(16);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean B() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean C0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public abstract PropertyAccessorDescriptor a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean V() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public FunctionDescriptor c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            e0(7);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean d0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V r0(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean z0() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyAccessorDescriptorImpl(Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, Annotations annotations, Name name, boolean z10, boolean z11, boolean z12, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(propertyDescriptor.b(), annotations, name, sourceElement);
        if (modality == null) {
            e0(0);
        }
        if (descriptorVisibility == null) {
            e0(1);
        }
        if (propertyDescriptor == null) {
            e0(2);
        }
        if (annotations == null) {
            e0(3);
        }
        if (name == null) {
            e0(4);
        }
        if (sourceElement == null) {
            e0(5);
        }
        this.f144862l = null;
        this.f144857g = modality;
        this.f144861k = descriptorVisibility;
        this.f144858h = propertyDescriptor;
        this.f144855e = z10;
        this.f144856f = z11;
        this.f144859i = z12;
        this.f144860j = kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public PropertyAccessorDescriptor M(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
    public boolean E() {
        return this.f144855e;
    }

    protected Collection<PropertyAccessorDescriptor> I0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (PropertyDescriptor propertyDescriptor : T().d()) {
            CallableDescriptor getter = z10 ? propertyDescriptor.getGetter() : propertyDescriptor.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    public void J0(boolean z10) {
        this.f144855e = z10;
    }

    public void K0(FunctionDescriptor functionDescriptor) {
        this.f144862l = functionDescriptor;
    }

    public void L0(DescriptorVisibility descriptorVisibility) {
        this.f144861k = descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
    public PropertyDescriptor T() {
        PropertyDescriptor propertyDescriptor = this.f144858h;
        if (propertyDescriptor == null) {
            e0(13);
        }
        return propertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind f() {
        CallableMemberDescriptor.Kind kind = this.f144860j;
        if (kind == null) {
            e0(6);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            e0(9);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f144861k;
        if (descriptorVisibility == null) {
            e0(11);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f144856f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return this.f144859i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor p0() {
        return this.f144862l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality q() {
        Modality modality = this.f144857g;
        if (modality == null) {
            e0(10);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor J() {
        return T().J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor N() {
        return T().N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ReceiverParameterDescriptor> u0() {
        List<ReceiverParameterDescriptor> listU0 = T().u0();
        if (listU0 == null) {
            e0(14);
        }
        return listU0;
    }
}
