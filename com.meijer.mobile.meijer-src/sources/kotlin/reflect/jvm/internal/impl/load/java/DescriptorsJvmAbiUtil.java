package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* loaded from: classes14.dex */
public final class DescriptorsJvmAbiUtil {
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean c(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(1);
        }
        return DescriptorUtils.x(declarationDescriptor) && DescriptorUtils.w(declarationDescriptor.b()) && !d((ClassDescriptor) declarationDescriptor);
    }

    public static boolean e(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor == null) {
            a(0);
        }
        if (propertyDescriptor.f() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return false;
        }
        if (c(propertyDescriptor.b())) {
            return true;
        }
        return DescriptorUtils.x(propertyDescriptor.b()) && b(propertyDescriptor);
    }

    public static boolean b(CallableMemberDescriptor callableMemberDescriptor) {
        FieldDescriptor fieldDescriptorT0;
        if (callableMemberDescriptor == null) {
            a(3);
        }
        if ((callableMemberDescriptor instanceof PropertyDescriptor) && (fieldDescriptorT0 = ((PropertyDescriptor) callableMemberDescriptor).t0()) != null && fieldDescriptorT0.getAnnotations().p3(JvmAbi.f145124b)) {
            return true;
        }
        return callableMemberDescriptor.getAnnotations().p3(JvmAbi.f145124b);
    }

    public static boolean d(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(2);
        }
        return CompanionObjectMappingUtilsKt.a(CompanionObjectMapping.f144143a, classDescriptor);
    }
}
