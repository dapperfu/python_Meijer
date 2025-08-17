package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes13.dex */
public final class BuiltinMethodsWithDifferentJvmName extends SpecialGenericSignatures {

    /* renamed from: o, reason: collision with root package name */
    public static final BuiltinMethodsWithDifferentJvmName f144161o = new BuiltinMethodsWithDifferentJvmName();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(SimpleFunctionDescriptor simpleFunctionDescriptor, CallableMemberDescriptor it) {
        Intrinsics.j(it, "it");
        return SpecialGenericSignatures.f144282a.j().containsKey(MethodSignatureMappingKt.d(simpleFunctionDescriptor));
    }

    public final Name j(SimpleFunctionDescriptor functionDescriptor) {
        Intrinsics.j(functionDescriptor, "functionDescriptor");
        Map<String, Name> mapJ = SpecialGenericSignatures.f144282a.j();
        String strD = MethodSignatureMappingKt.d(functionDescriptor);
        if (strD == null) {
            return null;
        }
        return mapJ.get(strD);
    }

    public final boolean k(SimpleFunctionDescriptor functionDescriptor) {
        Intrinsics.j(functionDescriptor, "functionDescriptor");
        return KotlinBuiltIns.h0(functionDescriptor) && DescriptorUtilsKt.i(functionDescriptor, false, new b(functionDescriptor), 1, null) != null;
    }

    public final boolean m(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Intrinsics.j(simpleFunctionDescriptor, "<this>");
        return Intrinsics.e(simpleFunctionDescriptor.getName().b(), "removeAt") && Intrinsics.e(MethodSignatureMappingKt.d(simpleFunctionDescriptor), SpecialGenericSignatures.f144282a.h().d());
    }

    private BuiltinMethodsWithDifferentJvmName() {
    }
}
