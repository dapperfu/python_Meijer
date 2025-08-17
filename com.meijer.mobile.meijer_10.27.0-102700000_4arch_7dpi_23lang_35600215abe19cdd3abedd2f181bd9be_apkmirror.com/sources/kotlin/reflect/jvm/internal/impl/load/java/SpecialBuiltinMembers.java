package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;

@JvmName
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class SpecialBuiltinMembers {
    public static final boolean d(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.j(callableMemberDescriptor, "<this>");
        return g(callableMemberDescriptor) != null;
    }

    public static final String e(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorW;
        Name nameJ;
        Intrinsics.j(callableMemberDescriptor, "callableMemberDescriptor");
        CallableMemberDescriptor callableMemberDescriptorF = f(callableMemberDescriptor);
        if (callableMemberDescriptorF != null && (callableMemberDescriptorW = DescriptorUtilsKt.w(callableMemberDescriptorF)) != null) {
            if (callableMemberDescriptorW instanceof PropertyDescriptor) {
                return ClassicBuiltinSpecialProperties.f144169a.b(callableMemberDescriptorW);
            }
            if ((callableMemberDescriptorW instanceof SimpleFunctionDescriptor) && (nameJ = BuiltinMethodsWithDifferentJvmName.f144161o.j((SimpleFunctionDescriptor) callableMemberDescriptorW)) != null) {
                return nameJ.b();
            }
        }
        return null;
    }

    public static final <T extends CallableMemberDescriptor> T g(T t10) {
        Intrinsics.j(t10, "<this>");
        if (!SpecialGenericSignatures.f144282a.g().contains(t10.getName()) && !BuiltinSpecialProperties.f144163a.d().contains(DescriptorUtilsKt.w(t10).getName())) {
            return null;
        }
        if ((t10 instanceof PropertyDescriptor) || (t10 instanceof PropertyAccessorDescriptor)) {
            return (T) DescriptorUtilsKt.i(t10, false, i.f144381a, 1, null);
        }
        if (t10 instanceof SimpleFunctionDescriptor) {
            return (T) DescriptorUtilsKt.i(t10, false, j.f144382a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(CallableMemberDescriptor it) {
        Intrinsics.j(it, "it");
        return ClassicBuiltinSpecialProperties.f144169a.d(DescriptorUtilsKt.w(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(CallableMemberDescriptor it) {
        Intrinsics.j(it, "it");
        return BuiltinMethodsWithDifferentJvmName.f144161o.k((SimpleFunctionDescriptor) it);
    }

    public static final <T extends CallableMemberDescriptor> T j(T t10) {
        Intrinsics.j(t10, "<this>");
        T t11 = (T) g(t10);
        if (t11 != null) {
            return t11;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f144162o;
        Name name = t10.getName();
        Intrinsics.i(name, "getName(...)");
        if (builtinMethodsWithSpecialGenericSignature.n(name)) {
            return (T) DescriptorUtilsKt.i(t10, false, k.f144383a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(CallableMemberDescriptor it) {
        Intrinsics.j(it, "it");
        return KotlinBuiltIns.h0(it) && BuiltinMethodsWithSpecialGenericSignature.o(it) != null;
    }

    public static final boolean l(ClassDescriptor classDescriptor, CallableDescriptor specialCallableDescriptor) {
        Intrinsics.j(classDescriptor, "<this>");
        Intrinsics.j(specialCallableDescriptor, "specialCallableDescriptor");
        DeclarationDescriptor declarationDescriptorB = specialCallableDescriptor.b();
        Intrinsics.h(declarationDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        SimpleType simpleTypeO = ((ClassDescriptor) declarationDescriptorB).o();
        Intrinsics.i(simpleTypeO, "getDefaultType(...)");
        for (ClassDescriptor classDescriptorS = DescriptorUtils.s(classDescriptor); classDescriptorS != null; classDescriptorS = DescriptorUtils.s(classDescriptorS)) {
            if (!(classDescriptorS instanceof JavaClassDescriptor) && TypeCheckingProcedure.b(classDescriptorS.o(), simpleTypeO) != null) {
                return !KotlinBuiltIns.h0(classDescriptorS);
            }
        }
        return false;
    }

    public static final boolean m(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.j(callableMemberDescriptor, "<this>");
        return DescriptorUtilsKt.w(callableMemberDescriptor).b() instanceof JavaClassDescriptor;
    }

    public static final boolean n(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.j(callableMemberDescriptor, "<this>");
        return m(callableMemberDescriptor) || KotlinBuiltIns.h0(callableMemberDescriptor);
    }

    private static final CallableMemberDescriptor f(CallableMemberDescriptor callableMemberDescriptor) {
        if (KotlinBuiltIns.h0(callableMemberDescriptor)) {
            return g(callableMemberDescriptor);
        }
        return null;
    }
}
