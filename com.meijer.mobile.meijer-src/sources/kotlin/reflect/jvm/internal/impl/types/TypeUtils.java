package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* loaded from: classes14.dex */
public class TypeUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleType f147698a = ErrorUtils.d(ErrorTypeKind.f147818E, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final SimpleType f147699b = ErrorUtils.d(ErrorTypeKind.f147889x, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final SimpleType f147700c = new SpecialType("NO_EXPECTED_TYPE");

    /* renamed from: d, reason: collision with root package name */
    public static final SimpleType f147701d = new SpecialType("UNIT_EXPECTED_TYPE");

    public static class SpecialType extends DelegatingSimpleType {

        /* renamed from: b, reason: collision with root package name */
        private final String f147702b;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void W0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeUtils.SpecialType.W0(int):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        /* renamed from: X0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SpecialType U0(KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner == null) {
                W0(3);
            }
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public SimpleType R0(boolean z10) {
            throw new IllegalStateException(this.f147702b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        /* renamed from: S0 */
        public SimpleType Q0(TypeAttributes typeAttributes) {
            if (typeAttributes == null) {
                W0(0);
            }
            throw new IllegalStateException(this.f147702b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        protected SimpleType T0() {
            throw new IllegalStateException(this.f147702b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        public DelegatingSimpleType V0(SimpleType simpleType) {
            if (simpleType == null) {
                W0(2);
            }
            throw new IllegalStateException(this.f147702b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        public String toString() {
            String str = this.f147702b;
            if (str == null) {
                W0(1);
            }
            return str;
        }

        public SpecialType(String str) {
            this.f147702b = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeUtils.a(int):void");
    }

    public static KotlinType o(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(1);
        }
        return p(kotlinType, true);
    }

    public static boolean w(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(0);
        }
        return kotlinType == f147700c || kotlinType == f147701d;
    }

    public static boolean b(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(28);
        }
        if (kotlinType.L0()) {
            return true;
        }
        return FlexibleTypesKt.b(kotlinType) && b(FlexibleTypesKt.a(kotlinType).T0());
    }

    public static boolean c(KotlinType kotlinType, Function1<UnwrappedType, Boolean> function1) {
        if (function1 == null) {
            a(43);
        }
        return d(kotlinType, function1, null);
    }

    private static boolean d(KotlinType kotlinType, Function1<UnwrappedType, Boolean> function1, SmartSet<KotlinType> smartSet) {
        if (function1 == null) {
            a(44);
        }
        if (kotlinType == null) {
            return false;
        }
        UnwrappedType unwrappedTypeN0 = kotlinType.N0();
        if (w(kotlinType)) {
            return function1.invoke(unwrappedTypeN0).booleanValue();
        }
        if (smartSet != null && smartSet.contains(kotlinType)) {
            return false;
        }
        if (function1.invoke(unwrappedTypeN0).booleanValue()) {
            return true;
        }
        if (smartSet == null) {
            smartSet = SmartSet.f();
        }
        smartSet.add(kotlinType);
        FlexibleType flexibleType = unwrappedTypeN0 instanceof FlexibleType ? (FlexibleType) unwrappedTypeN0 : null;
        if (flexibleType != null && (d(flexibleType.S0(), function1, smartSet) || d(flexibleType.T0(), function1, smartSet))) {
            return true;
        }
        if ((unwrappedTypeN0 instanceof DefinitelyNotNullType) && d(((DefinitelyNotNullType) unwrappedTypeN0).W0(), function1, smartSet)) {
            return true;
        }
        TypeConstructor typeConstructorK0 = kotlinType.K0();
        if (typeConstructorK0 instanceof IntersectionTypeConstructor) {
            Iterator<KotlinType> it = ((IntersectionTypeConstructor) typeConstructorK0).a().iterator();
            while (it.hasNext()) {
                if (d(it.next(), function1, smartSet)) {
                    return true;
                }
            }
            return false;
        }
        for (TypeProjection typeProjection : kotlinType.I0()) {
            if (!typeProjection.a() && d(typeProjection.getType(), function1, smartSet)) {
                return true;
            }
        }
        return false;
    }

    public static KotlinType e(KotlinType kotlinType, KotlinType kotlinType2, TypeSubstitutor typeSubstitutor) {
        if (kotlinType == null) {
            a(20);
        }
        if (kotlinType2 == null) {
            a(21);
        }
        if (typeSubstitutor == null) {
            a(22);
        }
        KotlinType kotlinTypeP = typeSubstitutor.p(kotlinType2, Variance.f147703e);
        if (kotlinTypeP != null) {
            return q(kotlinTypeP, kotlinType.L0());
        }
        return null;
    }

    public static ClassDescriptor f(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(30);
        }
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorD;
        }
        return null;
    }

    public static List<TypeProjection> g(List<TypeParameterDescriptor> list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new TypeProjectionImpl(it.next().o()));
        }
        List<TypeProjection> listJ1 = CollectionsKt.j1(arrayList);
        if (listJ1 == null) {
            a(17);
        }
        return listJ1;
    }

    public static List<KotlinType> h(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(18);
        }
        TypeSubstitutor typeSubstitutorF = TypeSubstitutor.f(kotlinType);
        Collection<KotlinType> collectionA = kotlinType.K0().a();
        ArrayList arrayList = new ArrayList(collectionA.size());
        Iterator<KotlinType> it = collectionA.iterator();
        while (it.hasNext()) {
            KotlinType kotlinTypeE = e(kotlinType, it.next(), typeSubstitutorF);
            if (kotlinTypeE != null) {
                arrayList.add(kotlinTypeE);
            }
        }
        return arrayList;
    }

    public static TypeParameterDescriptor i(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(63);
        }
        if (kotlinType.K0().d() instanceof TypeParameterDescriptor) {
            return (TypeParameterDescriptor) kotlinType.K0().d();
        }
        return null;
    }

    public static boolean j(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(29);
        }
        if (kotlinType.K0().d() instanceof ClassDescriptor) {
            return false;
        }
        Iterator<KotlinType> it = h(kotlinType).iterator();
        while (it.hasNext()) {
            if (l(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(KotlinType kotlinType) {
        return kotlinType != null && kotlinType.K0() == f147698a.K0();
    }

    public static boolean l(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(27);
        }
        if (kotlinType.L0()) {
            return true;
        }
        if (FlexibleTypesKt.b(kotlinType) && l(FlexibleTypesKt.a(kotlinType).T0())) {
            return true;
        }
        if (SpecialTypesKt.c(kotlinType)) {
            return false;
        }
        if (m(kotlinType)) {
            return j(kotlinType);
        }
        if (kotlinType instanceof AbstractStubType) {
            TypeParameterDescriptor typeParameterDescriptorC = ((AbstractStubType) kotlinType).T0().c();
            return typeParameterDescriptorC == null || j(typeParameterDescriptorC.o());
        }
        TypeConstructor typeConstructorK0 = kotlinType.K0();
        if (typeConstructorK0 instanceof IntersectionTypeConstructor) {
            Iterator<KotlinType> it = typeConstructorK0.a().iterator();
            while (it.hasNext()) {
                if (l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(60);
        }
        return i(kotlinType) != null || (kotlinType.K0() instanceof NewTypeVariableConstructor);
    }

    public static KotlinType n(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(2);
        }
        return p(kotlinType, false);
    }

    public static KotlinType p(KotlinType kotlinType, boolean z10) {
        if (kotlinType == null) {
            a(3);
        }
        UnwrappedType unwrappedTypeR0 = kotlinType.N0().R0(z10);
        if (unwrappedTypeR0 == null) {
            a(4);
        }
        return unwrappedTypeR0;
    }

    public static KotlinType q(KotlinType kotlinType, boolean z10) {
        if (kotlinType == null) {
            a(8);
        }
        if (z10) {
            return o(kotlinType);
        }
        if (kotlinType == null) {
            a(9);
        }
        return kotlinType;
    }

    public static SimpleType r(SimpleType simpleType, boolean z10) {
        if (simpleType == null) {
            a(5);
        }
        if (!z10) {
            if (simpleType == null) {
                a(7);
            }
            return simpleType;
        }
        SimpleType simpleTypeR0 = simpleType.R0(true);
        if (simpleTypeR0 == null) {
            a(6);
        }
        return simpleTypeR0;
    }

    public static TypeProjection s(TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null) {
            a(45);
        }
        return new StarProjectionImpl(typeParameterDescriptor);
    }

    public static TypeProjection t(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        if (typeParameterDescriptor == null) {
            a(46);
        }
        return erasureTypeAttributes.b() == TypeUsage.f147694a ? new TypeProjectionImpl(StarProjectionImplKt.b(typeParameterDescriptor)) : new StarProjectionImpl(typeParameterDescriptor);
    }

    public static SimpleType v(TypeConstructor typeConstructor, MemberScope memberScope, Function1<KotlinTypeRefiner, SimpleType> function1) {
        if (typeConstructor == null) {
            a(12);
        }
        if (memberScope == null) {
            a(13);
        }
        if (function1 == null) {
            a(14);
        }
        SimpleType simpleTypeN = KotlinTypeFactory.n(TypeAttributes.f147647b.k(), typeConstructor, g(typeConstructor.getParameters()), false, memberScope, function1);
        if (simpleTypeN == null) {
            a(15);
        }
        return simpleTypeN;
    }

    public static SimpleType u(ClassifierDescriptor classifierDescriptor, MemberScope memberScope, Function1<KotlinTypeRefiner, SimpleType> function1) {
        if (ErrorUtils.m(classifierDescriptor)) {
            ErrorType errorTypeD = ErrorUtils.d(ErrorTypeKind.f147816D, classifierDescriptor.toString());
            if (errorTypeD == null) {
                a(11);
            }
            return errorTypeD;
        }
        return v(classifierDescriptor.i(), memberScope, function1);
    }
}
