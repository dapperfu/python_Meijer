package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class JavaTypeEnhancement {

    /* renamed from: a, reason: collision with root package name */
    private final JavaResolverSettings f145537a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final KotlinType f145538a;

        /* renamed from: b, reason: collision with root package name */
        private final int f145539b;

        public final int a() {
            return this.f145539b;
        }

        public final KotlinType b() {
            return this.f145538a;
        }

        public a(KotlinType kotlinType, int i10) {
            this.f145538a = kotlinType;
            this.f145539b = i10;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final SimpleType f145540a;

        /* renamed from: b, reason: collision with root package name */
        private final int f145541b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f145542c;

        public final boolean a() {
            return this.f145542c;
        }

        public final int b() {
            return this.f145541b;
        }

        public final SimpleType c() {
            return this.f145540a;
        }

        public b(SimpleType simpleType, int i10, boolean z10) {
            this.f145540a = simpleType;
            this.f145541b = i10;
            this.f145542c = z10;
        }
    }

    public JavaTypeEnhancement(JavaResolverSettings javaResolverSettings) {
        Intrinsics.j(javaResolverSettings, "javaResolverSettings");
        this.f145537a = javaResolverSettings;
    }

    private final b b(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11) {
        TypeConstructor typeConstructorK0;
        Boolean bool;
        a aVar;
        TypeProjection typeProjectionS;
        Function1<? super Integer, JavaTypeQualifiers> function12 = function1;
        boolean zA = TypeComponentPositionKt.a(typeComponentPosition);
        boolean z12 = (z11 && z10) ? false : true;
        KotlinType kotlinType = null;
        if (!zA && simpleType.I0().isEmpty()) {
            return new b(null, 1, false);
        }
        ClassifierDescriptor classifierDescriptorD = simpleType.K0().d();
        if (classifierDescriptorD == null) {
            return new b(null, 1, false);
        }
        JavaTypeQualifiers javaTypeQualifiersInvoke = function12.invoke(Integer.valueOf(i10));
        ClassifierDescriptor classifierDescriptorF = TypeEnhancementKt.f(classifierDescriptorD, javaTypeQualifiersInvoke, typeComponentPosition);
        Boolean boolH = TypeEnhancementKt.h(javaTypeQualifiersInvoke, typeComponentPosition);
        if (classifierDescriptorF == null || (typeConstructorK0 = classifierDescriptorF.i()) == null) {
            typeConstructorK0 = simpleType.K0();
        }
        TypeConstructor typeConstructor = typeConstructorK0;
        int iA = i10 + 1;
        List<TypeProjection> listI0 = simpleType.I0();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.i(parameters, "getParameters(...)");
        List<TypeParameterDescriptor> list = parameters;
        Iterator<T> it = listI0.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.x(listI0, 10), CollectionsKt.x(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection = (TypeProjection) next;
            if (z12) {
                bool = boolH;
                if (!typeProjection.a()) {
                    aVar = d(typeProjection.getType().N0(), function12, iA, z11);
                } else if (function12.invoke(Integer.valueOf(iA)).f() == NullabilityQualifier.f145558a) {
                    UnwrappedType unwrappedTypeN0 = typeProjection.getType().N0();
                    aVar = new a(KotlinTypeFactory.e(FlexibleTypesKt.c(unwrappedTypeN0).R0(false), FlexibleTypesKt.d(unwrappedTypeN0).R0(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                bool = boolH;
                aVar = new a(kotlinType, 0);
            }
            iA += aVar.a();
            if (aVar.b() != null) {
                KotlinType kotlinTypeB = aVar.b();
                Variance varianceC = typeProjection.c();
                Intrinsics.i(varianceC, "getProjectionKind(...)");
                typeProjectionS = TypeUtilsKt.k(kotlinTypeB, varianceC, typeParameterDescriptor);
            } else if (classifierDescriptorF == null || typeProjection.a()) {
                typeProjectionS = classifierDescriptorF != null ? TypeUtils.s(typeParameterDescriptor) : null;
            } else {
                KotlinType type = typeProjection.getType();
                Intrinsics.i(type, "getType(...)");
                Variance varianceC2 = typeProjection.c();
                Intrinsics.i(varianceC2, "getProjectionKind(...)");
                typeProjectionS = TypeUtilsKt.k(type, varianceC2, typeParameterDescriptor);
            }
            arrayList.add(typeProjectionS);
            function12 = function1;
            boolH = bool;
            kotlinType = null;
        }
        Boolean bool2 = boolH;
        int i11 = iA - i10;
        if (classifierDescriptorF == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((TypeProjection) it3.next()) == null) {
                    }
                }
            }
            return new b(null, i11, false);
        }
        Annotations annotations = simpleType.getAnnotations();
        C15358e c15358e = TypeEnhancementKt.f145594b;
        if (classifierDescriptorF == null) {
            c15358e = null;
        }
        TypeAttributes typeAttributesB = TypeAttributesKt.b(TypeEnhancementKt.e(CollectionsKt.r(annotations, c15358e, bool2 != null ? TypeEnhancementKt.g() : null)));
        List<TypeProjection> listI02 = simpleType.I0();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = listI02.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.x(arrayList, 10), CollectionsKt.x(listI02, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection2 = (TypeProjection) it5.next();
            TypeProjection typeProjection3 = (TypeProjection) next2;
            if (typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList2.add(typeProjection2);
        }
        SimpleType simpleTypeK = KotlinTypeFactory.k(typeAttributesB, typeConstructor, arrayList2, bool2 != null ? bool2.booleanValue() : simpleType.L0(), null, 16, null);
        if (javaTypeQualifiersInvoke.d()) {
            simpleTypeK = e(simpleTypeK);
        }
        return new b(simpleTypeK, i11, bool2 != null && javaTypeQualifiersInvoke.g());
    }

    static /* synthetic */ b c(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return javaTypeEnhancement.b(simpleType, function1, i10, typeComponentPosition, z10, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.a d(kotlin.reflect.jvm.internal.impl.types.UnwrappedType r21, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> r22, int r23, boolean r24) {
        /*
            r20 = this;
            r0 = r21
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.a(r0)
            r2 = 0
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$a
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L10:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType
            if (r1 == 0) goto Lb2
            boolean r8 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.RawType
            r1 = r0
            kotlin.reflect.jvm.internal.impl.types.FlexibleType r1 = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) r1
            kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r1.S0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.f145587a
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$b r10 = r3.b(r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r1.T0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.f145588b
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$b r4 = r3.b(r4, r5, r6, r7, r8, r9)
            r10.b()
            r4.b()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r10.c()
            if (r3 != 0) goto L48
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r4.c()
            if (r3 != 0) goto L48
            goto La8
        L48:
            boolean r2 = r10.a()
            if (r2 != 0) goto L8a
            boolean r2 = r4.a()
            if (r2 == 0) goto L55
            goto L8a
        L55:
            if (r8 == 0) goto L71
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r10.c()
            if (r0 != 0) goto L63
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r1.S0()
        L63:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r4.c()
            if (r3 != 0) goto L6d
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r1.T0()
        L6d:
            r2.<init>(r0, r3)
            goto La8
        L71:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r10.c()
            if (r0 != 0) goto L7b
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r1.S0()
        L7b:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r4.c()
            if (r2 != 0) goto L85
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r1.T0()
        L85:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r2 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.e(r0, r2)
            goto La8
        L8a:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r1 = r4.c()
            if (r1 == 0) goto L9d
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r10.c()
            if (r2 != 0) goto L97
            r2 = r1
        L97:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.e(r2, r1)
            if (r1 != 0) goto La4
        L9d:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r1 = r10.c()
            kotlin.jvm.internal.Intrinsics.g(r1)
        La4:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r2 = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.d(r0, r1)
        La8:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$a
            int r1 = r10.b()
            r0.<init>(r2, r1)
            return r0
        Lb2:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType
            if (r1 == 0) goto Lea
            r12 = r0
            kotlin.reflect.jvm.internal.impl.types.SimpleType r12 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r12
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r15 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.f145589c
            r18 = 8
            r19 = 0
            r16 = 0
            r11 = r20
            r13 = r22
            r14 = r23
            r17 = r24
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$b r1 = c(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$a r2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$a
            boolean r3 = r1.a()
            if (r3 == 0) goto Lde
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r1.c()
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r0 = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.d(r0, r3)
            goto Le2
        Lde:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r1.c()
        Le2:
            int r1 = r1.b()
            r2.<init>(r0, r1)
            return r2
        Lea:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.d(kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.jvm.functions.Function1, int, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$a");
    }

    private final SimpleType e(SimpleType simpleType) {
        return this.f145537a.a() ? SpecialTypesKt.h(simpleType, true) : new NotNullTypeParameterImpl(simpleType);
    }

    public final KotlinType a(KotlinType kotlinType, Function1<? super Integer, JavaTypeQualifiers> qualifiers, boolean z10) {
        Intrinsics.j(kotlinType, "<this>");
        Intrinsics.j(qualifiers, "qualifiers");
        return d(kotlinType.N0(), qualifiers, 0, z10).b();
    }
}
