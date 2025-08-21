package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class DescriptorUtilKt {
    public static final ClassifierDescriptor a(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        DeclarationDescriptor declarationDescriptorB = declarationDescriptor.b();
        if (declarationDescriptorB != null && !(declarationDescriptor instanceof PackageFragmentDescriptor)) {
            if (!b(declarationDescriptorB)) {
                return a(declarationDescriptorB);
            }
            if (declarationDescriptorB instanceof ClassifierDescriptor) {
                return (ClassifierDescriptor) declarationDescriptorB;
            }
        }
        return null;
    }

    public static final boolean b(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        return declarationDescriptor.b() instanceof PackageFragmentDescriptor;
    }

    public static final boolean c(FunctionDescriptor functionDescriptor) {
        SimpleType simpleTypeO;
        KotlinType kotlinTypeD;
        KotlinType returnType;
        Intrinsics.j(functionDescriptor, "<this>");
        DeclarationDescriptor declarationDescriptorB = functionDescriptor.b();
        ClassDescriptor classDescriptor = declarationDescriptorB instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorB : null;
        if (classDescriptor != null) {
            ClassDescriptor classDescriptor2 = InlineClassesUtilsKt.g(classDescriptor) ? classDescriptor : null;
            if (classDescriptor2 != null && (simpleTypeO = classDescriptor2.o()) != null && (kotlinTypeD = TypeUtilsKt.D(simpleTypeO)) != null && (returnType = functionDescriptor.getReturnType()) != null && Intrinsics.e(functionDescriptor.getName(), OperatorNameConventions.f148019e) && ((TypeUtilsKt.s(returnType) || TypeUtilsKt.t(returnType)) && functionDescriptor.h().size() == 1)) {
                KotlinType type = functionDescriptor.h().get(0).getType();
                Intrinsics.i(type, "getType(...)");
                if (Intrinsics.e(TypeUtilsKt.D(type), kotlinTypeD) && functionDescriptor.u0().isEmpty() && functionDescriptor.N() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final ClassDescriptor d(ModuleDescriptor moduleDescriptor, FqName fqName, LookupLocation lookupLocation) {
        MemberScope memberScopeR;
        Intrinsics.j(moduleDescriptor, "<this>");
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(lookupLocation, "lookupLocation");
        if (fqName.c()) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorF = moduleDescriptor.i0(fqName.d()).n().f(fqName.f(), lookupLocation);
        ClassDescriptor classDescriptor = classifierDescriptorF instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF : null;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        ClassDescriptor classDescriptorD = d(moduleDescriptor, fqName.d(), lookupLocation);
        ClassifierDescriptor classifierDescriptorF2 = (classDescriptorD == null || (memberScopeR = classDescriptorD.R()) == null) ? null : memberScopeR.f(fqName.f(), lookupLocation);
        if (classifierDescriptorF2 instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorF2;
        }
        return null;
    }
}
