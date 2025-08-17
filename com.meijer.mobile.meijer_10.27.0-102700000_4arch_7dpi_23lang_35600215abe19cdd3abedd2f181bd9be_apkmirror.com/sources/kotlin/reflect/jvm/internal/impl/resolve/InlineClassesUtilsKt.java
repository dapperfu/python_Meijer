package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class InlineClassesUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    private static final FqName f146126a;

    /* renamed from: b, reason: collision with root package name */
    private static final ClassId f146127b;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmInline");
        f146126a = fqName;
        f146127b = ClassId.f145674d.c(fqName);
    }

    public static final boolean a(CallableDescriptor callableDescriptor) {
        Intrinsics.j(callableDescriptor, "<this>");
        if (!(callableDescriptor instanceof PropertyGetterDescriptor)) {
            return false;
        }
        PropertyDescriptor propertyDescriptorT = ((PropertyGetterDescriptor) callableDescriptor).T();
        Intrinsics.i(propertyDescriptorT, "getCorrespondingProperty(...)");
        return f(propertyDescriptorT);
    }

    public static final boolean b(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).S() instanceof InlineClassRepresentation);
    }

    public static final boolean c(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD != null) {
            return b(classifierDescriptorD);
        }
        return false;
    }

    public static final boolean d(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).S() instanceof MultiFieldValueClassRepresentation);
    }

    public static final boolean e(VariableDescriptor variableDescriptor) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentationQ;
        Intrinsics.j(variableDescriptor, "<this>");
        if (variableDescriptor.N() != null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorB = variableDescriptor.b();
        Name nameC = null;
        ClassDescriptor classDescriptor = declarationDescriptorB instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorB : null;
        if (classDescriptor != null && (inlineClassRepresentationQ = DescriptorUtilsKt.q(classDescriptor)) != null) {
            nameC = inlineClassRepresentationQ.c();
        }
        return Intrinsics.e(nameC, variableDescriptor.getName());
    }

    public static final boolean f(VariableDescriptor variableDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentationS;
        Intrinsics.j(variableDescriptor, "<this>");
        if (variableDescriptor.N() != null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorB = variableDescriptor.b();
        ClassDescriptor classDescriptor = declarationDescriptorB instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorB : null;
        if (classDescriptor == null || (valueClassRepresentationS = classDescriptor.S()) == null) {
            return false;
        }
        Name name = variableDescriptor.getName();
        Intrinsics.i(name, "getName(...)");
        return valueClassRepresentationS.a(name);
    }

    public static final boolean g(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        return b(declarationDescriptor) || d(declarationDescriptor);
    }

    public static final boolean h(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD != null) {
            return g(classifierDescriptorD);
        }
        return false;
    }

    public static final boolean i(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        return (classifierDescriptorD == null || !d(classifierDescriptorD) || SimpleClassicTypeSystemContext.f146839a.O(kotlinType)) ? false : true;
    }

    public static final KotlinType j(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        KotlinType kotlinTypeK = k(kotlinType);
        if (kotlinTypeK != null) {
            return TypeSubstitutor.f(kotlinType).p(kotlinTypeK, Variance.f146796e);
        }
        return null;
    }

    public static final KotlinType k(KotlinType kotlinType) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentationQ;
        Intrinsics.j(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        ClassDescriptor classDescriptor = classifierDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorD : null;
        if (classDescriptor == null || (inlineClassRepresentationQ = DescriptorUtilsKt.q(classDescriptor)) == null) {
            return null;
        }
        return (SimpleType) inlineClassRepresentationQ.d();
    }
}
