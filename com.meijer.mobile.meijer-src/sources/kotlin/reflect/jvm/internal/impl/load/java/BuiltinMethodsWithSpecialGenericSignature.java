package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {

    /* renamed from: o, reason: collision with root package name */
    public static final BuiltinMethodsWithSpecialGenericSignature f145069o = new BuiltinMethodsWithSpecialGenericSignature();

    private final boolean k(CallableMemberDescriptor callableMemberDescriptor) {
        return CollectionsKt.h0(SpecialGenericSignatures.f145189a.e(), MethodSignatureMappingKt.d(callableMemberDescriptor));
    }

    @JvmStatic
    public static final FunctionDescriptor l(FunctionDescriptor functionDescriptor) {
        Intrinsics.j(functionDescriptor, "functionDescriptor");
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = f145069o;
        Name name = functionDescriptor.getName();
        Intrinsics.i(name, "getName(...)");
        if (builtinMethodsWithSpecialGenericSignature.n(name)) {
            return (FunctionDescriptor) DescriptorUtilsKt.i(functionDescriptor, false, c.f145224a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(CallableMemberDescriptor it) {
        Intrinsics.j(it, "it");
        return f145069o.k(it);
    }

    @JvmStatic
    public static final SpecialGenericSignatures.SpecialSignatureInfo o(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorI;
        String strD;
        Intrinsics.j(callableMemberDescriptor, "<this>");
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.f145189a;
        if (!companion.d().contains(callableMemberDescriptor.getName()) || (callableMemberDescriptorI = DescriptorUtilsKt.i(callableMemberDescriptor, false, d.f145264a, 1, null)) == null || (strD = MethodSignatureMappingKt.d(callableMemberDescriptorI)) == null) {
            return null;
        }
        return companion.l(strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(CallableMemberDescriptor it) {
        Intrinsics.j(it, "it");
        return (it instanceof FunctionDescriptor) && f145069o.k(it);
    }

    public final boolean n(Name name) {
        Intrinsics.j(name, "<this>");
        return SpecialGenericSignatures.f145189a.d().contains(name);
    }

    private BuiltinMethodsWithSpecialGenericSignature() {
    }
}
