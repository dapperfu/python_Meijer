package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes14.dex */
public class PropertySetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertySetterDescriptor {

    /* renamed from: m, reason: collision with root package name */
    private ValueParameterDescriptor f144898m;

    /* renamed from: n, reason: collision with root package name */
    private final PropertySetterDescriptor f144899n;

    private static /* synthetic */ void e0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<? extends PropertySetterDescriptor> d() {
        Collection<PropertyAccessorDescriptor> collectionI0 = super.I0(false);
        if (collectionI0 == null) {
            e0(10);
        }
        return collectionI0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertySetterDescriptorImpl(PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z10, boolean z11, boolean z12, CallableMemberDescriptor.Kind kind, PropertySetterDescriptor propertySetterDescriptor, SourceElement sourceElement) {
        super(modality, descriptorVisibility, propertyDescriptor, annotations, Name.u("<set-" + propertyDescriptor.getName() + ">"), z10, z11, z12, kind, sourceElement);
        if (propertyDescriptor == null) {
            e0(0);
        }
        if (annotations == null) {
            e0(1);
        }
        if (modality == null) {
            e0(2);
        }
        if (descriptorVisibility == null) {
            e0(3);
        }
        if (kind == null) {
            e0(4);
        }
        if (sourceElement == null) {
            e0(5);
        }
        this.f144899n = propertySetterDescriptor != null ? propertySetterDescriptor : this;
    }

    public static ValueParameterDescriptorImpl M0(PropertySetterDescriptor propertySetterDescriptor, KotlinType kotlinType, Annotations annotations) {
        if (propertySetterDescriptor == null) {
            e0(7);
        }
        if (kotlinType == null) {
            e0(8);
        }
        if (annotations == null) {
            e0(9);
        }
        return new ValueParameterDescriptorImpl(propertySetterDescriptor, null, 0, annotations, SpecialNames.f146615o, kotlinType, false, false, false, null, SourceElement.f144554a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: N0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PropertySetterDescriptor H0() {
        PropertySetterDescriptor propertySetterDescriptor = this.f144899n;
        if (propertySetterDescriptor == null) {
            e0(13);
        }
        return propertySetterDescriptor;
    }

    public void O0(ValueParameterDescriptor valueParameterDescriptor) {
        if (valueParameterDescriptor == null) {
            e0(6);
        }
        this.f144898m = valueParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ValueParameterDescriptor> h() {
        ValueParameterDescriptor valueParameterDescriptor = this.f144898m;
        if (valueParameterDescriptor == null) {
            throw new IllegalStateException();
        }
        List<ValueParameterDescriptor> listSingletonList = Collections.singletonList(valueParameterDescriptor);
        if (listSingletonList == null) {
            e0(11);
        }
        return listSingletonList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        SimpleType simpleTypeA0 = DescriptorUtilsKt.m(this).a0();
        if (simpleTypeA0 == null) {
            e0(12);
        }
        return simpleTypeA0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.e(this, d10);
    }
}
