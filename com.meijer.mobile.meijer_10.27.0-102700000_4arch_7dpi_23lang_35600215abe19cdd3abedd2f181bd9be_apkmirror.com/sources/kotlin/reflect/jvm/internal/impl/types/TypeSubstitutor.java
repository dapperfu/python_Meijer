package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;

/* loaded from: classes13.dex */
public class TypeSubstitutor {

    /* renamed from: b, reason: collision with root package name */
    public static final TypeSubstitutor f146780b = g(TypeSubstitution.f146778b);

    /* renamed from: a, reason: collision with root package name */
    private final TypeSubstitution f146781a;

    static class a implements Function1<FqName, Boolean> {
        private static /* synthetic */ void a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(FqName fqName) {
            if (fqName == null) {
                a(0);
            }
            return Boolean.valueOf(!fqName.equals(StandardNames.FqNames.f143352Q));
        }

        a() {
        }
    }

    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.a(int):void");
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f146782a;

        static {
            int[] iArr = new int[d.values().length];
            f146782a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f146782a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f146782a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    protected TypeSubstitutor(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            a(7);
        }
        this.f146781a = typeSubstitution;
    }

    private static void b(int i10, TypeProjection typeProjection, TypeSubstitution typeSubstitution) {
        if (i10 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(typeProjection) + "; substitution: " + o(typeSubstitution));
    }

    public static Variance c(Variance variance, TypeProjection typeProjection) {
        if (variance == null) {
            a(35);
        }
        if (typeProjection == null) {
            a(36);
        }
        if (!typeProjection.a()) {
            return d(variance, typeProjection.c());
        }
        Variance variance2 = Variance.f146798g;
        if (variance2 == null) {
            a(37);
        }
        return variance2;
    }

    public static Variance d(Variance variance, Variance variance2) {
        if (variance == null) {
            a(38);
        }
        if (variance2 == null) {
            a(39);
        }
        Variance variance3 = Variance.f146796e;
        if (variance == variance3) {
            if (variance2 == null) {
                a(40);
            }
            return variance2;
        }
        if (variance2 == variance3) {
            if (variance == null) {
                a(41);
            }
            return variance;
        }
        if (variance == variance2) {
            if (variance2 == null) {
                a(42);
            }
            return variance2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    private static d e(Variance variance, Variance variance2) {
        Variance variance3 = Variance.f146797f;
        return (variance == variance3 && variance2 == Variance.f146798g) ? d.OUT_IN_IN_POSITION : (variance == Variance.f146798g && variance2 == variance3) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static TypeSubstitutor f(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(6);
        }
        return g(TypeConstructorSubstitution.i(kotlinType.K0(), kotlinType.I0()));
    }

    public static TypeSubstitutor g(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            a(0);
        }
        return new TypeSubstitutor(typeSubstitution);
    }

    public static TypeSubstitutor h(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            a(3);
        }
        if (typeSubstitution2 == null) {
            a(4);
        }
        return g(DisjointKeysUnionTypeSubstitution.i(typeSubstitution, typeSubstitution2));
    }

    private static Annotations i(Annotations annotations) {
        if (annotations == null) {
            a(33);
        }
        return !annotations.p3(StandardNames.FqNames.f143352Q) ? annotations : new FilteredAnnotations(annotations, new a());
    }

    private static TypeProjection l(KotlinType kotlinType, TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, TypeProjection typeProjection2) {
        if (kotlinType == null) {
            a(26);
        }
        if (typeProjection == null) {
            a(27);
        }
        if (typeProjection2 == null) {
            a(28);
        }
        if (!kotlinType.getAnnotations().p3(StandardNames.FqNames.f143352Q)) {
            if (typeProjection == null) {
                a(29);
            }
            return typeProjection;
        }
        TypeConstructor typeConstructorK0 = typeProjection.getType().K0();
        if (!(typeConstructorK0 instanceof NewCapturedTypeConstructor)) {
            return typeProjection;
        }
        TypeProjection typeProjectionF0 = ((NewCapturedTypeConstructor) typeConstructorK0).f0();
        Variance varianceC = typeProjectionF0.c();
        d dVarE = e(typeProjection2.c(), varianceC);
        d dVar = d.OUT_IN_IN_POSITION;
        return dVarE == dVar ? new TypeProjectionImpl(typeProjectionF0.getType()) : (typeParameterDescriptor != null && e(typeParameterDescriptor.k(), varianceC) == dVar) ? new TypeProjectionImpl(typeProjectionF0.getType()) : typeProjection;
    }

    private List<TypeProjection> s(List<TypeParameterDescriptor> list, List<TypeProjection> list2, int i10) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            TypeParameterDescriptor typeParameterDescriptor = list.get(i11);
            TypeProjection typeProjection = list2.get(i11);
            TypeProjection typeProjectionU = u(typeProjection, typeParameterDescriptor, i10 + 1);
            int i12 = b.f146782a[e(typeParameterDescriptor.k(), typeProjectionU.c()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                typeProjectionU = TypeUtils.s(typeParameterDescriptor);
            } else if (i12 == 3) {
                Variance varianceK = typeParameterDescriptor.k();
                Variance variance = Variance.f146796e;
                if (varianceK != variance && !typeProjectionU.a()) {
                    typeProjectionU = new TypeProjectionImpl(variance, typeProjectionU.getType());
                }
            }
            if (typeProjectionU != typeProjection) {
                z10 = true;
            }
            arrayList.add(typeProjectionU);
        }
        return !z10 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeProjection u(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, int i10) throws c {
        if (typeProjection == null) {
            a(18);
        }
        b(i10, typeProjection, this.f146781a);
        if (!typeProjection.a()) {
            KotlinType type = typeProjection.getType();
            if (type instanceof TypeWithEnhancement) {
                TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
                UnwrappedType unwrappedTypeD0 = typeWithEnhancement.D0();
                KotlinType kotlinTypeE0 = typeWithEnhancement.e0();
                TypeProjection typeProjectionU = u(new TypeProjectionImpl(typeProjection.c(), unwrappedTypeD0), typeParameterDescriptor, i10 + 1);
                return typeProjectionU.a() ? typeProjectionU : new TypeProjectionImpl(typeProjectionU.c(), TypeWithEnhancementKt.d(typeProjectionU.getType().N0(), p(kotlinTypeE0, typeProjection.c())));
            }
            if (!DynamicTypesKt.a(type) && !(type.N0() instanceof RawType)) {
                TypeProjection typeProjectionE = this.f146781a.e(type);
                TypeProjection typeProjectionL = typeProjectionE != null ? l(type, typeProjectionE, typeParameterDescriptor, typeProjection) : null;
                Variance varianceC = typeProjection.c();
                if (typeProjectionL == null && FlexibleTypesKt.b(type) && !TypeCapabilitiesKt.b(type)) {
                    FlexibleType flexibleTypeA = FlexibleTypesKt.a(type);
                    int i11 = i10 + 1;
                    TypeProjection typeProjectionU2 = u(new TypeProjectionImpl(varianceC, flexibleTypeA.S0()), typeParameterDescriptor, i11);
                    TypeProjection typeProjectionU3 = u(new TypeProjectionImpl(varianceC, flexibleTypeA.T0()), typeParameterDescriptor, i11);
                    Variance varianceC2 = typeProjectionU2.c();
                    if (typeProjectionU2.getType() != flexibleTypeA.S0() || typeProjectionU3.getType() != flexibleTypeA.T0()) {
                        return new TypeProjectionImpl(varianceC2, KotlinTypeFactory.e(TypeSubstitutionKt.a(typeProjectionU2.getType()), TypeSubstitutionKt.a(typeProjectionU3.getType())));
                    }
                } else if (!KotlinBuiltIns.o0(type) && !KotlinTypeKt.a(type)) {
                    if (typeProjectionL != null) {
                        d dVarE = e(varianceC, typeProjectionL.c());
                        if (!CapturedTypeConstructorKt.f(type)) {
                            int i12 = b.f146782a[dVarE.ordinal()];
                            if (i12 == 1) {
                                throw new c("Out-projection in in-position");
                            }
                            if (i12 == 2) {
                                return new TypeProjectionImpl(Variance.f146798g, type.K0().l().J());
                            }
                        }
                        CustomTypeParameter customTypeParameterA = TypeCapabilitiesKt.a(type);
                        if (typeProjectionL.a()) {
                            return typeProjectionL;
                        }
                        KotlinType kotlinTypeG0 = customTypeParameterA != null ? customTypeParameterA.g0(typeProjectionL.getType()) : TypeUtils.q(typeProjectionL.getType(), type.L0());
                        if (!type.getAnnotations().isEmpty()) {
                            kotlinTypeG0 = TypeUtilsKt.C(kotlinTypeG0, new CompositeAnnotations(kotlinTypeG0.getAnnotations(), i(this.f146781a.d(type.getAnnotations()))));
                        }
                        if (dVarE == d.NO_CONFLICT) {
                            varianceC = d(varianceC, typeProjectionL.c());
                        }
                        return new TypeProjectionImpl(varianceC, kotlinTypeG0);
                    }
                    typeProjection = r(typeProjection, i10);
                    if (typeProjection == null) {
                        a(25);
                    }
                }
            }
        }
        return typeProjection;
    }

    public TypeSubstitution j() {
        TypeSubstitution typeSubstitution = this.f146781a;
        if (typeSubstitution == null) {
            a(8);
        }
        return typeSubstitution;
    }

    public boolean k() {
        return this.f146781a.f();
    }

    public TypeSubstitutor m() {
        TypeSubstitution typeSubstitution = this.f146781a;
        return ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.b()) ? new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution) this.f146781a).j(), ((IndexedParametersSubstitution) this.f146781a).i(), false)) : this;
    }

    public KotlinType n(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            a(9);
        }
        if (variance == null) {
            a(10);
        }
        if (k()) {
            if (kotlinType == null) {
                a(11);
            }
            return kotlinType;
        }
        try {
            KotlinType type = u(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e10) {
            ErrorType errorTypeD = ErrorUtils.d(ErrorTypeKind.f146909D, e10.getMessage());
            if (errorTypeD == null) {
                a(13);
            }
            return errorTypeD;
        }
    }

    public KotlinType p(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            a(14);
        }
        if (variance == null) {
            a(15);
        }
        TypeProjection typeProjectionQ = q(new TypeProjectionImpl(variance, j().g(kotlinType, variance)));
        if (typeProjectionQ == null) {
            return null;
        }
        return typeProjectionQ.getType();
    }

    public TypeProjection q(TypeProjection typeProjection) {
        if (typeProjection == null) {
            a(16);
        }
        TypeProjection typeProjectionT = t(typeProjection);
        return (this.f146781a.a() || this.f146781a.b()) ? CapturedTypeApproximationKt.d(typeProjectionT, this.f146781a.b()) : typeProjectionT;
    }

    public TypeProjection t(TypeProjection typeProjection) {
        if (typeProjection == null) {
            a(17);
        }
        if (k()) {
            return typeProjection;
        }
        try {
            return u(typeProjection, null, 0);
        } catch (c unused) {
            return null;
        }
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (!ExceptionUtilsKt.a(th2)) {
                return "[Exception while computing toString(): " + th2 + "]";
            }
            throw th2;
        }
    }

    private TypeProjection r(TypeProjection typeProjection, int i10) throws c {
        KotlinType kotlinTypeP;
        KotlinType type = typeProjection.getType();
        Variance varianceC = typeProjection.c();
        if (type.K0().d() instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        SimpleType simpleTypeB = SpecialTypesKt.b(type);
        if (simpleTypeB != null) {
            kotlinTypeP = m().p(simpleTypeB, Variance.f146796e);
        } else {
            kotlinTypeP = null;
        }
        KotlinType kotlinTypeB = TypeSubstitutionKt.b(type, s(type.K0().getParameters(), type.I0(), i10), this.f146781a.d(type.getAnnotations()));
        if ((kotlinTypeB instanceof SimpleType) && (kotlinTypeP instanceof SimpleType)) {
            kotlinTypeB = SpecialTypesKt.j((SimpleType) kotlinTypeB, (SimpleType) kotlinTypeP);
        }
        return new TypeProjectionImpl(varianceC, kotlinTypeB);
    }
}
