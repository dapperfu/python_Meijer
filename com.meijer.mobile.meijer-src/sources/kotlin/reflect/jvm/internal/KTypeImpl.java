package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010 \u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-²\u0006\u0012\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050!8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/jvm/internal/KTypeBase;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/reflect/KClassifier;", "v", "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Lkotlin/reflect/KClassifier;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "b", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "c", "()Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "d", "()Ljava/util/List;", "arguments", "g", "()Ljava/lang/reflect/Type;", "javaType", "e", "()Z", "isMarkedNullable", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KTypeImpl implements KTypeBase {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f144022e = {Reflection.j(new PropertyReference1Impl(KTypeImpl.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0)), Reflection.j(new PropertyReference1Impl(KTypeImpl.class, "arguments", "getArguments()Ljava/util/List;", 0))};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KotlinType type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal<Type> computeJavaType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal classifier;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal arguments;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.f147703e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.f147704f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.f147705g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KTypeImpl(KotlinType type, Function0<? extends Type> function0) {
        Intrinsics.j(type, "type");
        this.type = type;
        ReflectProperties.LazySoftVal<Type> lazySoftValC = null;
        ReflectProperties.LazySoftVal<Type> lazySoftVal = function0 instanceof ReflectProperties.LazySoftVal ? (ReflectProperties.LazySoftVal) function0 : null;
        if (lazySoftVal != null) {
            lazySoftValC = lazySoftVal;
        } else if (function0 != null) {
            lazySoftValC = ReflectProperties.c(function0);
        }
        this.computeJavaType = lazySoftValC;
        this.classifier = ReflectProperties.c(new t0(this));
        this.arguments = ReflectProperties.c(new u0(this, function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(KTypeImpl kTypeImpl, Function0 function0) {
        KTypeProjection kTypeProjectionD;
        List<TypeProjection> listI0 = kTypeImpl.type.I0();
        if (listI0.isEmpty()) {
            return CollectionsKt.m();
        }
        Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.f143287b, new v0(kTypeImpl));
        List<TypeProjection> list = listI0;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.a()) {
                kTypeProjectionD = KTypeProjection.INSTANCE.c();
            } else {
                KotlinType type = typeProjection.getType();
                Intrinsics.i(type, "getType(...)");
                KTypeImpl kTypeImpl2 = new KTypeImpl(type, function0 == null ? null : new w0(kTypeImpl, i10, lazyA));
                int i12 = WhenMappings.$EnumSwitchMapping$0[typeProjection.c().ordinal()];
                if (i12 == 1) {
                    kTypeProjectionD = KTypeProjection.INSTANCE.d(kTypeImpl2);
                } else if (i12 == 2) {
                    kTypeProjectionD = KTypeProjection.INSTANCE.a(kTypeImpl2);
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kTypeProjectionD = KTypeProjection.INSTANCE.b(kTypeImpl2);
                }
            }
            arrayList.add(kTypeProjectionD);
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier q(KTypeImpl kTypeImpl) {
        return kTypeImpl.v(kTypeImpl.type);
    }

    @Override // kotlin.reflect.KType
    public KClassifier c() {
        return (KClassifier) this.classifier.b(this, f144022e[0]);
    }

    @Override // kotlin.reflect.KType
    public List<KTypeProjection> d() {
        T tB = this.arguments.b(this, f144022e[1]);
        Intrinsics.i(tB, "getValue(...)");
        return (List) tB;
    }

    @Override // kotlin.reflect.KType
    public boolean e() {
        return this.type.L0();
    }

    public boolean equals(Object other) {
        if (!(other instanceof KTypeImpl)) {
            return false;
        }
        KTypeImpl kTypeImpl = (KTypeImpl) other;
        return Intrinsics.e(this.type, kTypeImpl.type) && Intrinsics.e(c(), kTypeImpl.c()) && Intrinsics.e(d(), kTypeImpl.d());
    }

    @Override // kotlin.jvm.internal.KTypeBase
    public Type g() {
        ReflectProperties.LazySoftVal<Type> lazySoftVal = this.computeJavaType;
        if (lazySoftVal != null) {
            return lazySoftVal.invoke();
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        KClassifier kClassifierC = c();
        return ((iHashCode + (kClassifierC != null ? kClassifierC.hashCode() : 0)) * 31) + d().hashCode();
    }

    public String toString() {
        return ReflectionObjectRenderer.f144042a.l(this.type);
    }

    /* renamed from: w, reason: from getter */
    public final KotlinType getType() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(KTypeImpl kTypeImpl) {
        Type typeG = kTypeImpl.g();
        Intrinsics.g(typeG);
        return ReflectClassUtilKt.h(typeG);
    }

    private static final List<Type> o(Lazy<? extends List<? extends Type>> lazy) {
        return (List) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type p(KTypeImpl kTypeImpl, int i10, Lazy<? extends List<? extends Type>> lazy) {
        Class<?> componentType;
        Type typeG = kTypeImpl.g();
        if (typeG instanceof Class) {
            Class cls = (Class) typeG;
            if (cls.isArray()) {
                componentType = cls.getComponentType();
            } else {
                componentType = Object.class;
            }
            Intrinsics.g(componentType);
            return componentType;
        }
        if (typeG instanceof GenericArrayType) {
            if (i10 == 0) {
                Type genericComponentType = ((GenericArrayType) typeG).getGenericComponentType();
                Intrinsics.g(genericComponentType);
                return genericComponentType;
            }
            throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + kTypeImpl);
        }
        if (typeG instanceof ParameterizedType) {
            Type type = o(lazy).get(i10);
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Intrinsics.i(lowerBounds, "getLowerBounds(...)");
            Type type2 = (Type) ArraysKt.g0(lowerBounds);
            if (type2 == null) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                Intrinsics.i(upperBounds, "getUpperBounds(...)");
                type2 = (Type) ArraysKt.f0(upperBounds);
            }
            Intrinsics.g(type2);
            return type2;
        }
        throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + kTypeImpl);
    }

    private final KClassifier v(KotlinType type) {
        KotlinType type2;
        ClassifierDescriptor classifierDescriptorD = type.K0().d();
        if (classifierDescriptorD instanceof ClassDescriptor) {
            Class<?> clsQ = UtilKt.q((ClassDescriptor) classifierDescriptorD);
            if (clsQ == null) {
                return null;
            }
            if (clsQ.isArray()) {
                TypeProjection typeProjection = (TypeProjection) CollectionsKt.W0(type.I0());
                if (typeProjection != null && (type2 = typeProjection.getType()) != null) {
                    KClassifier kClassifierV = v(type2);
                    if (kClassifierV != null) {
                        return new KClassImpl(UtilKt.f(JvmClassMappingKt.b(KTypesJvm.a(kClassifierV))));
                    }
                    throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
                }
                return new KClassImpl(clsQ);
            }
            if (!TypeUtils.l(type)) {
                Class<?> clsI = ReflectClassUtilKt.i(clsQ);
                if (clsI != null) {
                    clsQ = clsI;
                }
                return new KClassImpl(clsQ);
            }
            return new KClassImpl(clsQ);
        }
        if (classifierDescriptorD instanceof TypeParameterDescriptor) {
            return new KTypeParameterImpl(null, (TypeParameterDescriptor) classifierDescriptorD);
        }
        if (!(classifierDescriptorD instanceof TypeAliasDescriptor)) {
            return null;
        }
        throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
    }

    public /* synthetic */ KTypeImpl(KotlinType kotlinType, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinType, (i10 & 2) != 0 ? null : function0);
    }
}
