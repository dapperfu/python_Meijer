package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "KotlinFunction", "KotlinConstructor", "JavaMethod", "JavaConstructor", "FakeJavaAnnotationConstructor", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class JvmFunctionSignature {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR%\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "methods", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Class<?> jClass;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<Method> methods;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeJavaAnnotationConstructor(Class<?> jClass) throws SecurityException {
            super(null);
            Intrinsics.j(jClass, "jClass");
            this.jClass = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            Intrinsics.i(declaredMethods, "getDeclaredMethods(...)");
            this.methods = ArraysKt.W0(declaredMethods, new Comparator() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return ComparisonsKt.d(((Method) t10).getName(), ((Method) t11).getName());
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: a */
        public String get_signature() {
            return CollectionsKt.B0(this.methods, "", "<init>(", ")V", 0, null, C15336g.f144130a, 24, null);
        }

        public final List<Method> d() {
            return this.methods;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            Intrinsics.i(returnType, "getReturnType(...)");
            return ReflectClassUtilKt.f(returnType);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "d", "()Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JavaConstructor extends JvmFunctionSignature {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Constructor<?> constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaConstructor(Constructor<?> constructor) {
            super(null);
            Intrinsics.j(constructor, "constructor");
            this.constructor = constructor;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: a */
        public String get_signature() {
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            Intrinsics.i(parameterTypes, "getParameterTypes(...)");
            return ArraysKt.C0(parameterTypes, "", "<init>(", ")V", 0, null, C15337h.f144132a, 24, null);
        }

        public final Constructor<?> d() {
            return this.constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Class cls) {
            Intrinsics.g(cls);
            return ReflectClassUtilKt.f(cls);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JavaMethod extends JvmFunctionSignature {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Method method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethod(Method method) {
            super(null);
            Intrinsics.j(method, "method");
            this.method = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: a */
        public String get_signature() {
            return RuntimeTypeMapperKt.d(this.method);
        }

        /* renamed from: b, reason: from getter */
        public final Method getMethod() {
            return this.method;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "constructorDesc", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KotlinConstructor extends JvmFunctionSignature {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final JvmMemberSignature.Method signature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinConstructor(JvmMemberSignature.Method signature) {
            super(null);
            Intrinsics.j(signature, "signature");
            this.signature = signature;
            this._signature = signature.a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        public final String b() {
            return this.signature.d();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "c", "methodName", "methodDesc", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KotlinFunction extends JvmFunctionSignature {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final JvmMemberSignature.Method signature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinFunction(JvmMemberSignature.Method signature) {
            super(null);
            Intrinsics.j(signature, "signature");
            this.signature = signature;
            this._signature = signature.a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        public final String b() {
            return this.signature.d();
        }

        public final String c() {
            return this.signature.e();
        }
    }

    public /* synthetic */ JvmFunctionSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String get_signature();

    private JvmFunctionSignature() {
    }
}
