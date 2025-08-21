package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.JvmPropertySignature;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001e\u0010#\u001a\u0004\u0018\u00010 *\u0006\u0012\u0002\b\u00030\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "", "b", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Z", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "d", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/String;", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "g", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "f", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Ljava/lang/Class;", "klass", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "c", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class RuntimeTypeMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final RuntimeTypeMapper f144044a = new RuntimeTypeMapper();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ClassId JAVA_LANG_VOID = ClassId.f146581d.c(new FqName("java.lang.Void"));

    private final JvmFunctionSignature.KotlinFunction d(FunctionDescriptor descriptor) {
        return new JvmFunctionSignature.KotlinFunction(new JvmMemberSignature.Method(e(descriptor), MethodSignatureMappingKt.c(descriptor, false, false, 1, null)));
    }

    public final ClassId c(Class<?> klass) {
        ClassId classIdM;
        Intrinsics.j(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.i(componentType, "getComponentType(...)");
            PrimitiveType primitiveTypeA = a(componentType);
            return primitiveTypeA != null ? new ClassId(StandardNames.f144191A, primitiveTypeA.o()) : ClassId.f146581d.c(StandardNames.FqNames.f144291i.m());
        }
        if (Intrinsics.e(klass, Void.TYPE)) {
            return JAVA_LANG_VOID;
        }
        PrimitiveType primitiveTypeA2 = a(klass);
        if (primitiveTypeA2 != null) {
            return new ClassId(StandardNames.f144191A, primitiveTypeA2.t());
        }
        ClassId classIdE = ReflectClassUtilKt.e(klass);
        return (classIdE.i() || (classIdM = JavaToKotlinClassMap.f144399a.m(classIdE.a())) == null) ? classIdE : classIdM;
    }

    public final JvmPropertySignature f(PropertyDescriptor possiblyOverriddenProperty) {
        Intrinsics.j(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        PropertyDescriptor propertyDescriptorA = ((PropertyDescriptor) DescriptorUtils.L(possiblyOverriddenProperty)).H0();
        Intrinsics.i(propertyDescriptorA, "getOriginal(...)");
        if (propertyDescriptorA instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) propertyDescriptorA;
            ProtoBuf.Property propertyD1 = deserializedPropertyDescriptor.c0();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f146463d;
            Intrinsics.i(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.a(propertyD1, propertySignature);
            if (jvmPropertySignature != null) {
                return new JvmPropertySignature.KotlinProperty(propertyDescriptorA, propertyD1, jvmPropertySignature, deserializedPropertyDescriptor.G(), deserializedPropertyDescriptor.D());
            }
        } else if (propertyDescriptorA instanceof JavaPropertyDescriptor) {
            JavaPropertyDescriptor javaPropertyDescriptor = (JavaPropertyDescriptor) propertyDescriptorA;
            SourceElement sourceElementG = javaPropertyDescriptor.g();
            JavaSourceElement javaSourceElement = sourceElementG instanceof JavaSourceElement ? (JavaSourceElement) sourceElementG : null;
            JavaElement javaElementC = javaSourceElement != null ? javaSourceElement.c() : null;
            if (javaElementC instanceof ReflectJavaField) {
                return new JvmPropertySignature.JavaField(((ReflectJavaField) javaElementC).R());
            }
            if (javaElementC instanceof ReflectJavaMethod) {
                Method methodR = ((ReflectJavaMethod) javaElementC).R();
                PropertySetterDescriptor setter = javaPropertyDescriptor.getSetter();
                SourceElement sourceElementG2 = setter != null ? setter.g() : null;
                JavaSourceElement javaSourceElement2 = sourceElementG2 instanceof JavaSourceElement ? (JavaSourceElement) sourceElementG2 : null;
                JavaElement javaElementC2 = javaSourceElement2 != null ? javaSourceElement2.c() : null;
                ReflectJavaMethod reflectJavaMethod = javaElementC2 instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElementC2 : null;
                return new JvmPropertySignature.JavaMethodProperty(methodR, reflectJavaMethod != null ? reflectJavaMethod.R() : null);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + propertyDescriptorA + " (source = " + javaElementC + ')');
        }
        PropertyGetterDescriptor getter = propertyDescriptorA.getGetter();
        Intrinsics.g(getter);
        JvmFunctionSignature.KotlinFunction kotlinFunctionD = d(getter);
        PropertySetterDescriptor setter2 = propertyDescriptorA.getSetter();
        return new JvmPropertySignature.MappedKotlinProperty(kotlinFunctionD, setter2 != null ? d(setter2) : null);
    }

    public final JvmFunctionSignature g(FunctionDescriptor possiblySubstitutedFunction) {
        Method methodR;
        JvmMemberSignature.Method methodB;
        JvmMemberSignature.Method methodE;
        Intrinsics.j(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        FunctionDescriptor functionDescriptorA = ((FunctionDescriptor) DescriptorUtils.L(possiblySubstitutedFunction)).H0();
        Intrinsics.i(functionDescriptorA, "getOriginal(...)");
        if (!(functionDescriptorA instanceof DeserializedCallableMemberDescriptor)) {
            if (functionDescriptorA instanceof JavaMethodDescriptor) {
                SourceElement sourceElementG = ((JavaMethodDescriptor) functionDescriptorA).g();
                JavaSourceElement javaSourceElement = sourceElementG instanceof JavaSourceElement ? (JavaSourceElement) sourceElementG : null;
                JavaElement javaElementC = javaSourceElement != null ? javaSourceElement.c() : null;
                ReflectJavaMethod reflectJavaMethod = javaElementC instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElementC : null;
                if (reflectJavaMethod != null && (methodR = reflectJavaMethod.R()) != null) {
                    return new JvmFunctionSignature.JavaMethod(methodR);
                }
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + functionDescriptorA);
            }
            if (!(functionDescriptorA instanceof JavaClassConstructorDescriptor)) {
                if (b(functionDescriptorA)) {
                    return d(functionDescriptorA);
                }
                throw new KotlinReflectionInternalError("Unknown origin of " + functionDescriptorA + " (" + functionDescriptorA.getClass() + ')');
            }
            SourceElement sourceElementG2 = ((JavaClassConstructorDescriptor) functionDescriptorA).g();
            JavaSourceElement javaSourceElement2 = sourceElementG2 instanceof JavaSourceElement ? (JavaSourceElement) sourceElementG2 : null;
            JavaElement javaElementC2 = javaSourceElement2 != null ? javaSourceElement2.c() : null;
            if (javaElementC2 instanceof ReflectJavaConstructor) {
                return new JvmFunctionSignature.JavaConstructor(((ReflectJavaConstructor) javaElementC2).R());
            }
            if (javaElementC2 instanceof ReflectJavaClass) {
                ReflectJavaClass reflectJavaClass = (ReflectJavaClass) javaElementC2;
                if (reflectJavaClass.o()) {
                    return new JvmFunctionSignature.FakeJavaAnnotationConstructor(reflectJavaClass.s());
                }
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + functionDescriptorA + " (" + javaElementC2 + ')');
        }
        DeserializedMemberDescriptor deserializedMemberDescriptor = (DeserializedMemberDescriptor) functionDescriptorA;
        MessageLite messageLiteC0 = deserializedMemberDescriptor.c0();
        if ((messageLiteC0 instanceof ProtoBuf.Function) && (methodE = JvmProtoBufUtil.f146571a.e((ProtoBuf.Function) messageLiteC0, deserializedMemberDescriptor.G(), deserializedMemberDescriptor.D())) != null) {
            return new JvmFunctionSignature.KotlinFunction(methodE);
        }
        if (!(messageLiteC0 instanceof ProtoBuf.Constructor) || (methodB = JvmProtoBufUtil.f146571a.b((ProtoBuf.Constructor) messageLiteC0, deserializedMemberDescriptor.G(), deserializedMemberDescriptor.D())) == null) {
            return d(functionDescriptorA);
        }
        DeclarationDescriptor declarationDescriptorB = possiblySubstitutedFunction.b();
        Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
        if (InlineClassesUtilsKt.b(declarationDescriptorB)) {
            return new JvmFunctionSignature.KotlinFunction(methodB);
        }
        DeclarationDescriptor declarationDescriptorB2 = possiblySubstitutedFunction.b();
        Intrinsics.i(declarationDescriptorB2, "getContainingDeclaration(...)");
        if (!InlineClassesUtilsKt.d(declarationDescriptorB2)) {
            return new JvmFunctionSignature.KotlinConstructor(methodB);
        }
        ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) possiblySubstitutedFunction;
        if (constructorDescriptor.z()) {
            if (!Intrinsics.e(methodB.e(), "constructor-impl") || !StringsKt.G(methodB.d(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + methodB).toString());
            }
        } else {
            if (!Intrinsics.e(methodB.e(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + methodB).toString());
            }
            ClassDescriptor classDescriptorA0 = constructorDescriptor.a0();
            Intrinsics.i(classDescriptorA0, "getConstructedClass(...)");
            String strU = ValueClassAwareCallerKt.u(classDescriptorA0);
            if (StringsKt.G(methodB.d(), ")V", false, 2, null)) {
                methodB = JvmMemberSignature.Method.c(methodB, null, StringsKt.M0(methodB.d(), "V") + strU, 1, null);
            } else if (!StringsKt.G(methodB.d(), strU, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + methodB).toString());
            }
        }
        return new JvmFunctionSignature.KotlinFunction(methodB);
    }

    private RuntimeTypeMapper() {
    }

    private final PrimitiveType a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return JvmPrimitiveType.b(cls.getSimpleName()).o();
        }
        return null;
    }

    private final boolean b(FunctionDescriptor descriptor) {
        if (DescriptorFactory.p(descriptor) || DescriptorFactory.q(descriptor)) {
            return true;
        }
        if (Intrinsics.e(descriptor.getName(), CloneableClassScope.f144395e.a()) && descriptor.h().isEmpty()) {
            return true;
        }
        return false;
    }

    private final String e(CallableMemberDescriptor descriptor) {
        String strE = SpecialBuiltinMembers.e(descriptor);
        if (strE == null) {
            if (descriptor instanceof PropertyGetterDescriptor) {
                String strB = DescriptorUtilsKt.w(descriptor).getName().b();
                Intrinsics.i(strB, "asString(...)");
                return JvmAbi.b(strB);
            }
            if (descriptor instanceof PropertySetterDescriptor) {
                String strB2 = DescriptorUtilsKt.w(descriptor).getName().b();
                Intrinsics.i(strB2, "asString(...)");
                return JvmAbi.e(strB2);
            }
            String strB3 = descriptor.getName().b();
            Intrinsics.i(strB3, "asString(...)");
            return strB3;
        }
        return strE;
    }
}
