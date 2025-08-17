package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ExpandedTypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class DescriptorBasedTypeSignatureMappingKt {
    public static final String a(ClassDescriptor klass, TypeMappingConfiguration<?> typeMappingConfiguration) {
        Intrinsics.j(klass, "klass");
        Intrinsics.j(typeMappingConfiguration, "typeMappingConfiguration");
        String strB = typeMappingConfiguration.b(klass);
        if (strB != null) {
            return strB;
        }
        DeclarationDescriptor declarationDescriptorB = klass.b();
        Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
        String strL = SpecialNames.b(klass.getName()).l();
        Intrinsics.i(strL, "getIdentifier(...)");
        if (declarationDescriptorB instanceof PackageFragmentDescriptor) {
            FqName fqNameE = ((PackageFragmentDescriptor) declarationDescriptorB).e();
            if (fqNameE.c()) {
                return strL;
            }
            return StringsKt.P(fqNameE.a(), '.', '/', false, 4, null) + '/' + strL;
        }
        ClassDescriptor classDescriptor = declarationDescriptorB instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorB : null;
        if (classDescriptor == null) {
            throw new IllegalArgumentException("Unexpected container: " + declarationDescriptorB + " for " + klass);
        }
        String strC = typeMappingConfiguration.c(classDescriptor);
        if (strC == null) {
            strC = a(classDescriptor, typeMappingConfiguration);
        }
        return strC + '$' + strL;
    }

    public static /* synthetic */ String b(ClassDescriptor classDescriptor, TypeMappingConfiguration typeMappingConfiguration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMappingConfiguration = TypeMappingConfigurationImpl.f144830a;
        }
        return a(classDescriptor, typeMappingConfiguration);
    }

    public static final boolean c(CallableDescriptor descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        if (descriptor instanceof ConstructorDescriptor) {
            return true;
        }
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.g(returnType);
        if (!KotlinBuiltIns.D0(returnType)) {
            return false;
        }
        KotlinType returnType2 = descriptor.getReturnType();
        Intrinsics.g(returnType2);
        return (TypeUtils.l(returnType2) || (descriptor instanceof PropertyGetterDescriptor)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v31, types: [T, java.lang.Object] */
    public static final <T> T d(KotlinType kotlinType, JvmTypeFactory<T> factory, TypeMappingMode mode, TypeMappingConfiguration<? extends T> typeMappingConfiguration, JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter, Function3<? super KotlinType, ? super T, ? super TypeMappingMode, Unit> writeGenericType) {
        T tA;
        KotlinType kotlinType2;
        Object objD;
        Intrinsics.j(kotlinType, "kotlinType");
        Intrinsics.j(factory, "factory");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(typeMappingConfiguration, "typeMappingConfiguration");
        Intrinsics.j(writeGenericType, "writeGenericType");
        KotlinType kotlinTypeD = typeMappingConfiguration.d(kotlinType);
        if (kotlinTypeD != null) {
            return (T) d(kotlinTypeD, factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        if (FunctionTypesKt.r(kotlinType)) {
            return (T) d(SuspendFunctionTypesKt.a(kotlinType), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.f146839a;
        Object objB = TypeSignatureMappingKt.b(simpleClassicTypeSystemContext, kotlinType, factory, mode);
        if (objB != null) {
            ?? r82 = (Object) TypeSignatureMappingKt.a(factory, objB, mode.d());
            writeGenericType.invoke(kotlinType, r82, mode);
            return r82;
        }
        TypeConstructor typeConstructorK0 = kotlinType.K0();
        if (typeConstructorK0 instanceof IntersectionTypeConstructor) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) typeConstructorK0;
            KotlinType kotlinTypeM = intersectionTypeConstructor.m();
            if (kotlinTypeM == null) {
                kotlinTypeM = typeMappingConfiguration.f(intersectionTypeConstructor.a());
            }
            return (T) d(TypeUtilsKt.D(kotlinTypeM), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        ClassifierDescriptor classifierDescriptorD = typeConstructorK0.d();
        if (classifierDescriptorD == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (ErrorUtils.m(classifierDescriptorD)) {
            T t10 = (T) factory.e("error/NonExistentClass");
            typeMappingConfiguration.e(kotlinType, (ClassDescriptor) classifierDescriptorD);
            if (jvmDescriptorTypeWriter != 0) {
                jvmDescriptorTypeWriter.c(t10);
            }
            return t10;
        }
        boolean z10 = classifierDescriptorD instanceof ClassDescriptor;
        if (z10 && KotlinBuiltIns.d0(kotlinType)) {
            if (kotlinType.I0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            TypeProjection typeProjection = kotlinType.I0().get(0);
            KotlinType type = typeProjection.getType();
            Intrinsics.i(type, "getType(...)");
            if (typeProjection.c() == Variance.f146797f) {
                objD = factory.e("java/lang/Object");
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.b();
                    jvmDescriptorTypeWriter.c(objD);
                    jvmDescriptorTypeWriter.a();
                }
            } else {
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.b();
                }
                Variance varianceC = typeProjection.c();
                Intrinsics.i(varianceC, "getProjectionKind(...)");
                objD = d(type, factory, mode.f(varianceC, true), typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.a();
                }
            }
            return (T) factory.a('[' + factory.d(objD));
        }
        if (!z10) {
            if (!(classifierDescriptorD instanceof TypeParameterDescriptor)) {
                if ((classifierDescriptorD instanceof TypeAliasDescriptor) && mode.b()) {
                    return (T) d(((TypeAliasDescriptor) classifierDescriptorD).F(), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
                }
                throw new UnsupportedOperationException("Unknown type " + kotlinType);
            }
            KotlinType kotlinTypeO = TypeUtilsKt.o((TypeParameterDescriptor) classifierDescriptorD);
            if (kotlinType.L0()) {
                kotlinTypeO = TypeUtilsKt.B(kotlinTypeO);
            }
            T t11 = (T) d(kotlinTypeO, factory, mode, typeMappingConfiguration, null, FunctionsKt.l());
            if (jvmDescriptorTypeWriter != 0) {
                Name name = classifierDescriptorD.getName();
                Intrinsics.i(name, "getName(...)");
                jvmDescriptorTypeWriter.e(name, t11);
            }
            return t11;
        }
        if (InlineClassesUtilsKt.b(classifierDescriptorD) && !mode.c() && (kotlinType2 = (KotlinType) ExpandedTypeUtilsKt.a(simpleClassicTypeSystemContext, kotlinType)) != null) {
            return (T) d(kotlinType2, factory, mode.g(), typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        if (mode.e() && KotlinBuiltIns.m0((ClassDescriptor) classifierDescriptorD)) {
            tA = (Object) factory.f();
        } else {
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorD;
            ClassDescriptor classDescriptorA = classDescriptor.H0();
            Intrinsics.i(classDescriptorA, "getOriginal(...)");
            tA = typeMappingConfiguration.a(classDescriptorA);
            if (tA == null) {
                if (classDescriptor.f() == ClassKind.f143588e) {
                    DeclarationDescriptor declarationDescriptorB = classDescriptor.b();
                    Intrinsics.h(declarationDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    classDescriptor = (ClassDescriptor) declarationDescriptorB;
                }
                ClassDescriptor classDescriptorA2 = classDescriptor.H0();
                Intrinsics.i(classDescriptorA2, "getOriginal(...)");
                tA = (Object) factory.e(a(classDescriptorA2, typeMappingConfiguration));
            }
        }
        writeGenericType.invoke(kotlinType, tA, mode);
        return tA;
    }

    public static /* synthetic */ Object e(KotlinType kotlinType, JvmTypeFactory jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration typeMappingConfiguration, JvmDescriptorTypeWriter jvmDescriptorTypeWriter, Function3 function3, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            function3 = FunctionsKt.l();
        }
        return d(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
    }
}
