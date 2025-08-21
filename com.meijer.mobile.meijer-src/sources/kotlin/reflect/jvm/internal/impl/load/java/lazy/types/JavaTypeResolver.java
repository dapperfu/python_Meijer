package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class JavaTypeResolver {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f145498a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeParameterResolver f145499b;

    /* renamed from: c, reason: collision with root package name */
    private final RawProjectionComputer f145500c;

    /* renamed from: d, reason: collision with root package name */
    private final TypeParameterUpperBoundEraser f145501d;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeResolver(LazyJavaResolverContext c10, TypeParameterResolver typeParameterResolver) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(typeParameterResolver, "typeParameterResolver");
        this.f145498a = c10;
        this.f145499b = typeParameterResolver;
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f145500c = rawProjectionComputer;
        this.f145501d = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
    }

    private final List<TypeProjection> d(JavaClassifierType javaClassifierType, List<? extends TypeParameterDescriptor> list, TypeConstructor typeConstructor, JavaTypeAttributes javaTypeAttributes) {
        JavaClassifierType javaClassifierType2;
        TypeConstructor typeConstructor2;
        JavaTypeAttributes javaTypeAttributes2;
        TypeProjection typeProjectionA;
        List<? extends TypeParameterDescriptor> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list2) {
            if (TypeUtilsKt.q(typeParameterDescriptor, null, javaTypeAttributes.c())) {
                typeProjectionA = TypeUtils.t(typeParameterDescriptor, javaTypeAttributes);
                javaClassifierType2 = javaClassifierType;
                typeConstructor2 = typeConstructor;
                javaTypeAttributes2 = javaTypeAttributes;
            } else {
                javaClassifierType2 = javaClassifierType;
                typeConstructor2 = typeConstructor;
                javaTypeAttributes2 = javaTypeAttributes;
                typeProjectionA = this.f145500c.a(typeParameterDescriptor, javaTypeAttributes2.j(javaClassifierType2.t()), this.f145501d, new LazyWrappedType(this.f145498a.e(), new a(this, typeParameterDescriptor, javaTypeAttributes2, typeConstructor2, javaClassifierType2)));
            }
            arrayList.add(typeProjectionA);
            javaTypeAttributes = javaTypeAttributes2;
            typeConstructor = typeConstructor2;
            javaClassifierType = javaClassifierType2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType e(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = javaTypeResolver.f145501d;
        ClassifierDescriptor classifierDescriptorD = typeConstructor.d();
        return typeParameterUpperBoundEraser.e(typeParameterDescriptor, javaTypeAttributes.k(classifierDescriptorD != null ? classifierDescriptorD.o() : null).j(javaClassifierType.t()));
    }

    private final SimpleType f(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        JavaClassifierType javaClassifierType2;
        TypeAttributes typeAttributesB;
        if (simpleType == null || (typeAttributesB = simpleType.J0()) == null) {
            javaClassifierType2 = javaClassifierType;
            typeAttributesB = TypeAttributesKt.b(new LazyJavaAnnotations(this.f145498a, javaClassifierType2, false, 4, null));
        } else {
            javaClassifierType2 = javaClassifierType;
        }
        TypeAttributes typeAttributes = typeAttributesB;
        TypeConstructor typeConstructorG = g(javaClassifierType2, javaTypeAttributes);
        if (typeConstructorG == null) {
            return null;
        }
        boolean zJ = j(javaTypeAttributes);
        return (Intrinsics.e(simpleType != null ? simpleType.K0() : null, typeConstructorG) && !javaClassifierType2.t() && zJ) ? simpleType.R0(true) : KotlinTypeFactory.k(typeAttributes, typeConstructorG, c(javaClassifierType2, javaTypeAttributes, typeConstructorG), zJ, null, 16, null);
    }

    private final TypeConstructor h(JavaClassifierType javaClassifierType) {
        TypeConstructor typeConstructorI = this.f145498a.a().b().f().r().d(ClassId.f146581d.c(new FqName(javaClassifierType.I())), CollectionsKt.e(0)).i();
        Intrinsics.i(typeConstructorI, "getTypeConstructor(...)");
        return typeConstructorI;
    }

    public static /* synthetic */ KotlinType m(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return javaTypeResolver.l(javaArrayType, javaTypeAttributes, z10);
    }

    private static final ErrorType o(JavaClassifierType javaClassifierType) {
        return ErrorUtils.d(ErrorTypeKind.f147853f, javaClassifierType.F());
    }

    private final TypeProjection q(JavaType javaType, JavaTypeAttributes javaTypeAttributes, TypeParameterDescriptor typeParameterDescriptor) {
        if (!(javaType instanceof JavaWildcardType)) {
            return new TypeProjectionImpl(Variance.f147703e, p(javaType, javaTypeAttributes));
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        JavaType javaTypeX = javaWildcardType.x();
        Variance variance = javaWildcardType.M() ? Variance.f147705g : Variance.f147704f;
        if (javaTypeX == null || i(variance, typeParameterDescriptor)) {
            TypeProjection typeProjectionT = TypeUtils.t(typeParameterDescriptor, javaTypeAttributes);
            Intrinsics.i(typeProjectionT, "makeStarProjection(...)");
            return typeProjectionT;
        }
        AnnotationDescriptor annotationDescriptorA = UtilsKt.a(this.f145498a, javaWildcardType);
        KotlinType kotlinTypeP = p(javaTypeX, JavaTypeAttributesKt.b(TypeUsage.f147695b, false, false, null, 7, null));
        if (annotationDescriptorA != null) {
            kotlinTypeP = TypeUtilsKt.C(kotlinTypeP, Annotations.f144596s3.a(CollectionsKt.O0(kotlinTypeP.getAnnotations(), annotationDescriptorA)));
        }
        return TypeUtilsKt.k(kotlinTypeP, variance, typeParameterDescriptor);
    }

    public final KotlinType l(JavaArrayType arrayType, JavaTypeAttributes attr, boolean z10) {
        Intrinsics.j(arrayType, "arrayType");
        Intrinsics.j(attr, "attr");
        JavaType javaTypeN = arrayType.n();
        JavaPrimitiveType javaPrimitiveType = javaTypeN instanceof JavaPrimitiveType ? (JavaPrimitiveType) javaTypeN : null;
        PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.f145498a, arrayType, true);
        if (type != null) {
            SimpleType simpleTypeP = this.f145498a.d().l().P(type);
            Intrinsics.g(simpleTypeP);
            KotlinType kotlinTypeC = TypeUtilsKt.C(simpleTypeP, new CompositeAnnotations(simpleTypeP.getAnnotations(), lazyJavaAnnotations));
            Intrinsics.h(kotlinTypeC, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            SimpleType simpleType = (SimpleType) kotlinTypeC;
            return attr.h() ? simpleType : KotlinTypeFactory.e(simpleType, simpleType.R0(true));
        }
        KotlinType kotlinTypeP = p(javaTypeN, JavaTypeAttributesKt.b(TypeUsage.f147695b, attr.h(), false, null, 6, null));
        if (attr.h()) {
            SimpleType simpleTypeN = this.f145498a.d().l().n(z10 ? Variance.f147705g : Variance.f147703e, kotlinTypeP, lazyJavaAnnotations);
            Intrinsics.i(simpleTypeN, "getArrayType(...)");
            return simpleTypeN;
        }
        SimpleType simpleTypeN2 = this.f145498a.d().l().n(Variance.f147703e, kotlinTypeP, lazyJavaAnnotations);
        Intrinsics.i(simpleTypeN2, "getArrayType(...)");
        return KotlinTypeFactory.e(simpleTypeN2, this.f145498a.d().l().n(Variance.f147705g, kotlinTypeP, lazyJavaAnnotations).R0(true));
    }

    public final KotlinType p(JavaType javaType, JavaTypeAttributes attr) {
        KotlinType kotlinTypeP;
        Intrinsics.j(attr, "attr");
        if (javaType instanceof JavaPrimitiveType) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            SimpleType simpleTypeS = type != null ? this.f145498a.d().l().S(type) : this.f145498a.d().l().a0();
            Intrinsics.g(simpleTypeS);
            return simpleTypeS;
        }
        if (javaType instanceof JavaClassifierType) {
            return n((JavaClassifierType) javaType, attr);
        }
        if (javaType instanceof JavaArrayType) {
            return m(this, (JavaArrayType) javaType, attr, false, 4, null);
        }
        if (javaType instanceof JavaWildcardType) {
            JavaType javaTypeX = ((JavaWildcardType) javaType).x();
            if (javaTypeX != null && (kotlinTypeP = p(javaTypeX, attr)) != null) {
                return kotlinTypeP;
            }
            SimpleType simpleTypeZ = this.f145498a.d().l().z();
            Intrinsics.i(simpleTypeZ, "getDefaultBound(...)");
            return simpleTypeZ;
        }
        if (javaType == null) {
            SimpleType simpleTypeZ2 = this.f145498a.d().l().z();
            Intrinsics.i(simpleTypeZ2, "getDefaultBound(...)");
            return simpleTypeZ2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + javaType);
    }

    private final boolean b(JavaClassifierType javaClassifierType, ClassDescriptor classDescriptor) {
        Variance varianceK;
        if (!JavaTypesKt.a((JavaType) CollectionsKt.F0(javaClassifierType.A()))) {
            return false;
        }
        List<TypeParameterDescriptor> parameters = JavaToKotlinClassMapper.f144419a.b(classDescriptor).i().getParameters();
        Intrinsics.i(parameters, "getParameters(...)");
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.F0(parameters);
        if (typeParameterDescriptor == null || (varianceK = typeParameterDescriptor.k()) == null || varianceK == Variance.f147705g) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> c(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType r10, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r11, kotlin.reflect.jvm.internal.impl.types.TypeConstructor r12) {
        /*
            r9 = this;
            boolean r0 = r10.t()
            java.lang.String r1 = "getParameters(...)"
            if (r0 != 0) goto L24
            java.util.List r0 = r10.A()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.List r0 = r12.getParameters()
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            goto L24
        L22:
            r0 = 0
            goto L25
        L24:
            r0 = 1
        L25:
            java.util.List r2 = r12.getParameters()
            kotlin.jvm.internal.Intrinsics.i(r2, r1)
            if (r0 == 0) goto L33
            java.util.List r10 = r9.d(r10, r2, r12, r11)
            return r10
        L33:
            int r11 = r2.size()
            java.util.List r12 = r10.A()
            int r12 = r12.size()
            r0 = 10
            if (r11 == r12) goto L7e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = kotlin.collections.CollectionsKt.x(r2, r0)
            r10.<init>(r11)
            java.util.Iterator r11 = r2.iterator()
        L52:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L79
            java.lang.Object r12 = r11.next()
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r12 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r12
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r0 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.f147840V
            kotlin.reflect.jvm.internal.impl.name.Name r12 = r12.getName()
            java.lang.String r12 = r12.b()
            java.lang.String[] r12 = new java.lang.String[]{r12}
            kotlin.reflect.jvm.internal.impl.types.error.ErrorType r12 = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.d(r1, r12)
            r0.<init>(r12)
            r10.add(r0)
            goto L52
        L79:
            java.util.List r10 = kotlin.collections.CollectionsKt.j1(r10)
            return r10
        L7e:
            java.util.List r10 = r10.A()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Iterable r10 = kotlin.collections.CollectionsKt.s1(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.CollectionsKt.x(r10, r0)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L95:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lca
            java.lang.Object r12 = r10.next()
            kotlin.collections.IndexedValue r12 = (kotlin.collections.IndexedValue) r12
            int r0 = r12.getIndex()
            java.lang.Object r12 = r12.b()
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType r12 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType) r12
            r2.size()
            java.lang.Object r0 = r2.get(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r0
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r3 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.f147695b
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.b(r3, r4, r5, r6, r7, r8)
            kotlin.jvm.internal.Intrinsics.g(r0)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r12 = r9.q(r12, r1, r0)
            r11.add(r12)
            goto L95
        Lca:
            java.util.List r10 = kotlin.collections.CollectionsKt.j1(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.c(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeConstructor):java.util.List");
    }

    private final TypeConstructor g(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        TypeConstructor typeConstructorI;
        JavaClassifier javaClassifierC = javaClassifierType.c();
        if (javaClassifierC == null) {
            return h(javaClassifierType);
        }
        if (javaClassifierC instanceof JavaClass) {
            JavaClass javaClass = (JavaClass) javaClassifierC;
            FqName fqNameE = javaClass.e();
            if (fqNameE != null) {
                ClassDescriptor classDescriptorK = k(javaClassifierType, javaTypeAttributes, fqNameE);
                if (classDescriptorK == null) {
                    classDescriptorK = this.f145498a.a().n().a(javaClass);
                }
                if (classDescriptorK != null && (typeConstructorI = classDescriptorK.i()) != null) {
                    return typeConstructorI;
                }
                return h(javaClassifierType);
            }
            throw new AssertionError("Class type should have a FQ name: " + javaClassifierC);
        }
        if (javaClassifierC instanceof JavaTypeParameter) {
            TypeParameterDescriptor typeParameterDescriptorA = this.f145499b.a((JavaTypeParameter) javaClassifierC);
            if (typeParameterDescriptorA != null) {
                return typeParameterDescriptorA.i();
            }
            return null;
        }
        throw new IllegalStateException("Unknown classifier kind: " + javaClassifierC);
    }

    private final boolean i(Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor.k() == Variance.f147703e || variance == typeParameterDescriptor.k()) {
            return false;
        }
        return true;
    }

    private final boolean j(JavaTypeAttributes javaTypeAttributes) {
        if (javaTypeAttributes.g() == JavaTypeFlexibility.f145495c || javaTypeAttributes.h() || javaTypeAttributes.b() == TypeUsage.f147694a) {
            return false;
        }
        return true;
    }

    private final ClassDescriptor k(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, FqName fqName) {
        if (javaTypeAttributes.h() && Intrinsics.e(fqName, JavaTypeResolverKt.f145502a)) {
            return this.f145498a.a().p().d();
        }
        JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.f144419a;
        ClassDescriptor classDescriptorF = JavaToKotlinClassMapper.f(javaToKotlinClassMapper, fqName, this.f145498a.d().l(), null, 4, null);
        if (classDescriptorF == null) {
            return null;
        }
        if (javaToKotlinClassMapper.d(classDescriptorF) && (javaTypeAttributes.g() == JavaTypeFlexibility.f145495c || javaTypeAttributes.b() == TypeUsage.f147694a || b(javaClassifierType, classDescriptorF))) {
            return javaToKotlinClassMapper.b(classDescriptorF);
        }
        return classDescriptorF;
    }

    private final KotlinType n(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        boolean z10;
        if (!javaTypeAttributes.h() && javaTypeAttributes.b() != TypeUsage.f147694a) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zT = javaClassifierType.t();
        if (!zT && !z10) {
            SimpleType simpleTypeF = f(javaClassifierType, javaTypeAttributes, null);
            if (simpleTypeF != null) {
                return simpleTypeF;
            }
            return o(javaClassifierType);
        }
        SimpleType simpleTypeF2 = f(javaClassifierType, javaTypeAttributes.l(JavaTypeFlexibility.f145495c), null);
        if (simpleTypeF2 == null) {
            return o(javaClassifierType);
        }
        SimpleType simpleTypeF3 = f(javaClassifierType, javaTypeAttributes.l(JavaTypeFlexibility.f145494b), simpleTypeF2);
        if (simpleTypeF3 == null) {
            return o(javaClassifierType);
        }
        if (zT) {
            return new RawTypeImpl(simpleTypeF2, simpleTypeF3);
        }
        return KotlinTypeFactory.e(simpleTypeF2, simpleTypeF3);
    }
}
