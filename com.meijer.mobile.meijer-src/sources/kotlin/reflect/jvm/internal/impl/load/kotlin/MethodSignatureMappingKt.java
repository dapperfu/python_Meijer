package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class MethodSignatureMappingKt {
    public static final String b(FunctionDescriptor functionDescriptor, boolean z10, boolean z11) {
        String strB;
        Intrinsics.j(functionDescriptor, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (functionDescriptor instanceof ConstructorDescriptor) {
                strB = "<init>";
            } else {
                strB = functionDescriptor.getName().b();
                Intrinsics.i(strB, "asString(...)");
            }
            sb2.append(strB);
        }
        sb2.append("(");
        ReceiverParameterDescriptor receiverParameterDescriptorN = functionDescriptor.N();
        if (receiverParameterDescriptorN != null) {
            KotlinType type = receiverParameterDescriptorN.getType();
            Intrinsics.i(type, "getType(...)");
            a(sb2, type);
        }
        Iterator<ValueParameterDescriptor> it = functionDescriptor.h().iterator();
        while (it.hasNext()) {
            KotlinType type2 = it.next().getType();
            Intrinsics.i(type2, "getType(...)");
            a(sb2, type2);
        }
        sb2.append(")");
        if (z10) {
            if (DescriptorBasedTypeSignatureMappingKt.c(functionDescriptor)) {
                sb2.append("V");
            } else {
                KotlinType returnType = functionDescriptor.getReturnType();
                Intrinsics.g(returnType);
                a(sb2, returnType);
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ String c(FunctionDescriptor functionDescriptor, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(functionDescriptor, z10, z11);
    }

    public static final String d(CallableDescriptor callableDescriptor) {
        Intrinsics.j(callableDescriptor, "<this>");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f145736a;
        if (DescriptorUtils.E(callableDescriptor)) {
            return null;
        }
        DeclarationDescriptor declarationDescriptorB = callableDescriptor.b();
        ClassDescriptor classDescriptor = declarationDescriptorB instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorB : null;
        if (classDescriptor == null || classDescriptor.getName().p()) {
            return null;
        }
        CallableDescriptor callableDescriptorA = callableDescriptor.a();
        SimpleFunctionDescriptor simpleFunctionDescriptor = callableDescriptorA instanceof SimpleFunctionDescriptor ? (SimpleFunctionDescriptor) callableDescriptorA : null;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        return MethodSignatureBuildingUtilsKt.a(signatureBuildingComponents, classDescriptor, c(simpleFunctionDescriptor, false, false, 3, null));
    }

    public static final boolean e(CallableDescriptor f10) {
        FunctionDescriptor functionDescriptorL;
        Intrinsics.j(f10, "f");
        if (!(f10 instanceof FunctionDescriptor)) {
            return false;
        }
        FunctionDescriptor functionDescriptor = (FunctionDescriptor) f10;
        if (Intrinsics.e(functionDescriptor.getName().b(), "remove") && functionDescriptor.h().size() == 1 && !SpecialBuiltinMembers.n((CallableMemberDescriptor) f10)) {
            List<ValueParameterDescriptor> listH = functionDescriptor.a().h();
            Intrinsics.i(listH, "getValueParameters(...)");
            KotlinType type = ((ValueParameterDescriptor) CollectionsKt.U0(listH)).getType();
            Intrinsics.i(type, "getType(...)");
            JvmType jvmTypeG = g(type);
            JvmType.Primitive primitive = jvmTypeG instanceof JvmType.Primitive ? (JvmType.Primitive) jvmTypeG : null;
            if ((primitive != null ? primitive.i() : null) != JvmPrimitiveType.INT || (functionDescriptorL = BuiltinMethodsWithSpecialGenericSignature.l(functionDescriptor)) == null) {
                return false;
            }
            List<ValueParameterDescriptor> listH2 = functionDescriptorL.a().h();
            Intrinsics.i(listH2, "getValueParameters(...)");
            KotlinType type2 = ((ValueParameterDescriptor) CollectionsKt.U0(listH2)).getType();
            Intrinsics.i(type2, "getType(...)");
            JvmType jvmTypeG2 = g(type2);
            DeclarationDescriptor declarationDescriptorB = functionDescriptorL.b();
            Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
            if (Intrinsics.e(DescriptorUtilsKt.p(declarationDescriptorB), StandardNames.FqNames.f144286f0.i()) && (jvmTypeG2 instanceof JvmType.Object) && Intrinsics.e(((JvmType.Object) jvmTypeG2).i(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    public static final String f(ClassDescriptor classDescriptor) {
        Intrinsics.j(classDescriptor, "<this>");
        ClassId classIdN = JavaToKotlinClassMap.f144399a.n(DescriptorUtilsKt.o(classDescriptor).i());
        if (classIdN == null) {
            return DescriptorBasedTypeSignatureMappingKt.b(classDescriptor, null, 2, null);
        }
        String strH = JvmClassName.h(classIdN);
        Intrinsics.i(strH, "internalNameByClassId(...)");
        return strH;
    }

    public static final JvmType g(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return (JvmType) DescriptorBasedTypeSignatureMappingKt.e(kotlinType, JvmTypeFactoryImpl.f145724a, TypeMappingMode.f145742o, TypeMappingConfigurationImpl.f145737a, null, null, 32, null);
    }

    private static final void a(StringBuilder sb2, KotlinType kotlinType) {
        sb2.append(g(kotlinType));
    }
}
