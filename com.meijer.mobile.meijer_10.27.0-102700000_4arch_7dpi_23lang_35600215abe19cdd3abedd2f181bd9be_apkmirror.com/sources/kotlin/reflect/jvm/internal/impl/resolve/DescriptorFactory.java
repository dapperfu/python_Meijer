package kotlin.reflect.jvm.internal.impl.resolve;

import com.medallia.digital.mobilesdk.l3;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes13.dex */
public class DescriptorFactory {

    private static class a extends ClassConstructorDescriptorImpl {
        private static /* synthetic */ void e0(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ClassDescriptor classDescriptor, SourceElement sourceElement, boolean z10) {
            super(classDescriptor, null, Annotations.f143689s3.b(), true, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
            if (classDescriptor == null) {
                e0(0);
            }
            if (sourceElement == null) {
                e0(1);
            }
            n1(Collections.EMPTY_LIST, DescriptorUtils.k(classDescriptor, z10));
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case l3.f92486e /* 32 */:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case l3.f92486e /* 32 */:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static ReceiverParameterDescriptor b(CallableDescriptor callableDescriptor, KotlinType kotlinType, Name name, Annotations annotations, int i10) {
        if (callableDescriptor == null) {
            a(32);
        }
        if (annotations == null) {
            a(33);
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ContextReceiver(callableDescriptor, kotlinType, name, null), annotations, NameUtils.a(i10));
    }

    public static ReceiverParameterDescriptor c(ClassDescriptor classDescriptor, KotlinType kotlinType, Name name, Annotations annotations, int i10) {
        if (classDescriptor == null) {
            a(34);
        }
        if (annotations == null) {
            a(35);
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(classDescriptor, new ContextClassReceiver(classDescriptor, kotlinType, name, null), annotations, NameUtils.a(i10));
    }

    public static PropertyGetterDescriptorImpl d(PropertyDescriptor propertyDescriptor, Annotations annotations) {
        if (propertyDescriptor == null) {
            a(13);
        }
        if (annotations == null) {
            a(14);
        }
        return j(propertyDescriptor, annotations, true, false, false);
    }

    public static PropertySetterDescriptorImpl e(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2) {
        if (propertyDescriptor == null) {
            a(0);
        }
        if (annotations == null) {
            a(1);
        }
        if (annotations2 == null) {
            a(2);
        }
        return n(propertyDescriptor, annotations, annotations2, true, false, false, propertyDescriptor.g());
    }

    public static PropertyDescriptor f(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(26);
        }
        ModuleDescriptor moduleDescriptorG = DescriptorUtils.g(classDescriptor);
        ClassDescriptor classDescriptorA = StdlibClassFinderKt.a(moduleDescriptorG).a(moduleDescriptorG);
        if (classDescriptorA == null) {
            return null;
        }
        Annotations.Companion companion = Annotations.f143689s3;
        Annotations annotationsB = companion.b();
        Modality modality = Modality.f143619b;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f143600e;
        Name name = StandardNames.f143298e;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.SYNTHESIZED;
        PropertyDescriptorImpl propertyDescriptorImplM0 = PropertyDescriptorImpl.M0(classDescriptor, annotationsB, modality, descriptorVisibility, false, name, kind, classDescriptor.g(), false, false, false, false, false, false);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(propertyDescriptorImplM0, companion.b(), modality, descriptorVisibility, false, false, false, kind, null, classDescriptor.g());
        propertyDescriptorImplM0.S0(propertyGetterDescriptorImpl, null);
        SimpleType simpleTypeI = KotlinTypeFactory.i(TypeAttributes.f146740b.k(), classDescriptorA.i(), Collections.singletonList(new TypeProjectionImpl(classDescriptor.o())), false);
        List<? extends TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        propertyDescriptorImplM0.Z0(simpleTypeI, list, null, null, list);
        propertyGetterDescriptorImpl.N0(propertyDescriptorImplM0.getReturnType());
        return propertyDescriptorImplM0;
    }

    public static SimpleFunctionDescriptor g(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(24);
        }
        Annotations.Companion companion = Annotations.f143689s3;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplI1 = SimpleFunctionDescriptorImpl.i1(classDescriptor, companion.b(), StandardNames.f143299f, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.g());
        ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(simpleFunctionDescriptorImplI1, null, 0, companion.b(), Name.o("value"), DescriptorUtilsKt.m(classDescriptor).X(), false, false, false, null, classDescriptor.g());
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplK1 = simpleFunctionDescriptorImplI1.O0(null, null, list, list, Collections.singletonList(valueParameterDescriptorImpl), classDescriptor.o(), Modality.f143619b, DescriptorVisibilities.f143600e);
        if (simpleFunctionDescriptorImplK1 == null) {
            a(25);
        }
        return simpleFunctionDescriptorImplK1;
    }

    public static SimpleFunctionDescriptor h(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(22);
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplI1 = SimpleFunctionDescriptorImpl.i1(classDescriptor, Annotations.f143689s3.b(), StandardNames.f143297d, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.g());
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplK1 = simpleFunctionDescriptorImplI1.O0(null, null, list, list, list, DescriptorUtilsKt.m(classDescriptor).m(Variance.f146796e, classDescriptor.o()), Modality.f143619b, DescriptorVisibilities.f143600e);
        if (simpleFunctionDescriptorImplK1 == null) {
            a(23);
        }
        return simpleFunctionDescriptorImplK1;
    }

    public static ReceiverParameterDescriptor i(CallableDescriptor callableDescriptor, KotlinType kotlinType, Annotations annotations) {
        if (callableDescriptor == null) {
            a(30);
        }
        if (annotations == null) {
            a(31);
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ExtensionReceiver(callableDescriptor, kotlinType, null), annotations);
    }

    public static PropertyGetterDescriptorImpl j(PropertyDescriptor propertyDescriptor, Annotations annotations, boolean z10, boolean z11, boolean z12) {
        if (propertyDescriptor == null) {
            a(15);
        }
        if (annotations == null) {
            a(16);
        }
        return k(propertyDescriptor, annotations, z10, z11, z12, propertyDescriptor.g());
    }

    public static PropertyGetterDescriptorImpl k(PropertyDescriptor propertyDescriptor, Annotations annotations, boolean z10, boolean z11, boolean z12, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            a(17);
        }
        if (annotations == null) {
            a(18);
        }
        if (sourceElement == null) {
            a(19);
        }
        return new PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.q(), propertyDescriptor.getVisibility(), z10, z11, z12, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
    }

    public static ClassConstructorDescriptorImpl l(ClassDescriptor classDescriptor, SourceElement sourceElement) {
        if (classDescriptor == null) {
            a(20);
        }
        if (sourceElement == null) {
            a(21);
        }
        return new a(classDescriptor, sourceElement, false);
    }

    public static PropertySetterDescriptorImpl m(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2, boolean z10, boolean z11, boolean z12, DescriptorVisibility descriptorVisibility, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            a(7);
        }
        if (annotations == null) {
            a(8);
        }
        if (annotations2 == null) {
            a(9);
        }
        if (descriptorVisibility == null) {
            a(10);
        }
        if (sourceElement == null) {
            a(11);
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.q(), descriptorVisibility, z10, z11, z12, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
        propertySetterDescriptorImpl.O0(PropertySetterDescriptorImpl.M0(propertySetterDescriptorImpl, propertyDescriptor.getType(), annotations2));
        return propertySetterDescriptorImpl;
    }

    public static PropertySetterDescriptorImpl n(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2, boolean z10, boolean z11, boolean z12, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            a(3);
        }
        if (annotations == null) {
            a(4);
        }
        if (annotations2 == null) {
            a(5);
        }
        if (sourceElement == null) {
            a(6);
        }
        return m(propertyDescriptor, annotations, annotations2, z10, z11, z12, propertyDescriptor.getVisibility(), sourceElement);
    }

    private static boolean o(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            a(29);
        }
        return functionDescriptor.f() == CallableMemberDescriptor.Kind.SYNTHESIZED && DescriptorUtils.A(functionDescriptor.b());
    }

    public static boolean p(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            a(28);
        }
        return functionDescriptor.getName().equals(StandardNames.f143299f) && o(functionDescriptor);
    }

    public static boolean q(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            a(27);
        }
        return functionDescriptor.getName().equals(StandardNames.f143297d) && o(functionDescriptor);
    }
}
