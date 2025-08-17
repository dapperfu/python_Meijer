package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes13.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f144190a = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean a(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor) {
            Intrinsics.j(superDescriptor, "superDescriptor");
            Intrinsics.j(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof JavaMethodDescriptor) && (superDescriptor instanceof FunctionDescriptor)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
                javaMethodDescriptor.h().size();
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) superDescriptor;
                functionDescriptor.h().size();
                List<ValueParameterDescriptor> listH = javaMethodDescriptor.a().h();
                Intrinsics.i(listH, "getValueParameters(...)");
                List<ValueParameterDescriptor> listH2 = functionDescriptor.H0().h();
                Intrinsics.i(listH2, "getValueParameters(...)");
                for (Pair pair : CollectionsKt.u1(listH, listH2)) {
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.a();
                    ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) pair.b();
                    Intrinsics.g(valueParameterDescriptor);
                    boolean z10 = c((FunctionDescriptor) subDescriptor, valueParameterDescriptor) instanceof JvmType.Primitive;
                    Intrinsics.g(valueParameterDescriptor2);
                    if (z10 != (c(functionDescriptor, valueParameterDescriptor2) instanceof JvmType.Primitive)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final boolean b(FunctionDescriptor functionDescriptor) {
            ClassDescriptor classDescriptor;
            if (functionDescriptor.h().size() != 1) {
                return false;
            }
            DeclarationDescriptor declarationDescriptorB = functionDescriptor.b();
            ClassDescriptor classDescriptor2 = null;
            if (declarationDescriptorB instanceof ClassDescriptor) {
                classDescriptor = (ClassDescriptor) declarationDescriptorB;
            } else {
                classDescriptor = null;
            }
            if (classDescriptor == null) {
                return false;
            }
            List<ValueParameterDescriptor> listH = functionDescriptor.h();
            Intrinsics.i(listH, "getValueParameters(...)");
            ClassifierDescriptor classifierDescriptorD = ((ValueParameterDescriptor) CollectionsKt.U0(listH)).getType().K0().d();
            if (classifierDescriptorD instanceof ClassDescriptor) {
                classDescriptor2 = (ClassDescriptor) classifierDescriptorD;
            }
            if (classDescriptor2 == null || !KotlinBuiltIns.s0(classDescriptor) || !Intrinsics.e(DescriptorUtilsKt.o(classDescriptor), DescriptorUtilsKt.o(classDescriptor2))) {
                return false;
            }
            return true;
        }

        private final JvmType c(FunctionDescriptor functionDescriptor, ValueParameterDescriptor valueParameterDescriptor) {
            if (!MethodSignatureMappingKt.e(functionDescriptor) && !b(functionDescriptor)) {
                KotlinType type = valueParameterDescriptor.getType();
                Intrinsics.i(type, "getType(...)");
                return MethodSignatureMappingKt.g(type);
            }
            KotlinType type2 = valueParameterDescriptor.getType();
            Intrinsics.i(type2, "getType(...)");
            return MethodSignatureMappingKt.g(TypeUtilsKt.B(type2));
        }
    }

    private final boolean c(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && !KotlinBuiltIns.h0(callableDescriptor2)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f144162o;
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor2;
            Name name = functionDescriptor.getName();
            Intrinsics.i(name, "getName(...)");
            if (!builtinMethodsWithSpecialGenericSignature.n(name)) {
                SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.f144282a;
                Name name2 = functionDescriptor.getName();
                Intrinsics.i(name2, "getName(...)");
                if (!companion.k(name2)) {
                    return false;
                }
            }
            CallableMemberDescriptor callableMemberDescriptorJ = SpecialBuiltinMembers.j((CallableMemberDescriptor) callableDescriptor);
            boolean z10 = callableDescriptor instanceof FunctionDescriptor;
            FunctionDescriptor functionDescriptor2 = z10 ? (FunctionDescriptor) callableDescriptor : null;
            if (!(functionDescriptor2 != null && functionDescriptor.z0() == functionDescriptor2.z0()) && (callableMemberDescriptorJ == null || !functionDescriptor.z0())) {
                return true;
            }
            if ((classDescriptor instanceof JavaClassDescriptor) && functionDescriptor.p0() == null && callableMemberDescriptorJ != null && !SpecialBuiltinMembers.l(classDescriptor, callableMemberDescriptorJ)) {
                if ((callableMemberDescriptorJ instanceof FunctionDescriptor) && z10 && BuiltinMethodsWithSpecialGenericSignature.l((FunctionDescriptor) callableMemberDescriptorJ) != null) {
                    String strC = MethodSignatureMappingKt.c(functionDescriptor, false, false, 2, null);
                    FunctionDescriptor functionDescriptorA = ((FunctionDescriptor) callableDescriptor).H0();
                    Intrinsics.i(functionDescriptorA, "getOriginal(...)");
                    if (Intrinsics.e(strC, MethodSignatureMappingKt.c(functionDescriptorA, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result b(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        Intrinsics.j(superDescriptor, "superDescriptor");
        Intrinsics.j(subDescriptor, "subDescriptor");
        return c(superDescriptor, subDescriptor, classDescriptor) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : f144190a.a(superDescriptor, subDescriptor) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
