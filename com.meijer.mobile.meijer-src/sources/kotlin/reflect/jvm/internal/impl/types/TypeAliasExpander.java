package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class TypeAliasExpander {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f147637c = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final TypeAliasExpander f147638d = new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.f147646a, false);

    /* renamed from: a, reason: collision with root package name */
    private final TypeAliasExpansionReportStrategy f147639a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f147640b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i10, TypeAliasDescriptor typeAliasDescriptor) {
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAliasDescriptor.getName());
        }
    }

    public TypeAliasExpander(TypeAliasExpansionReportStrategy reportStrategy, boolean z10) {
        Intrinsics.j(reportStrategy, "reportStrategy");
        this.f147639a = reportStrategy;
        this.f147640b = z10;
    }

    private final void a(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().e());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.e())) {
                this.f147639a.c(annotationDescriptor);
            }
        }
    }

    private final SimpleType k(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z10, int i10, boolean z11) {
        TypeProjection typeProjectionL = l(new TypeProjectionImpl(Variance.f147703e, typeAliasExpansion.b().q0()), typeAliasExpansion, null, i10);
        KotlinType type = typeProjectionL.getType();
        Intrinsics.i(type, "getType(...)");
        SimpleType simpleTypeA = TypeSubstitutionKt.a(type);
        if (KotlinTypeKt.a(simpleTypeA)) {
            return simpleTypeA;
        }
        typeProjectionL.c();
        a(simpleTypeA.getAnnotations(), AnnotationsTypeAttributeKt.a(typeAttributes));
        SimpleType simpleTypeR = TypeUtils.r(d(simpleTypeA, typeAttributes), z10);
        Intrinsics.i(simpleTypeR, "let(...)");
        return z11 ? SpecialTypesKt.j(simpleTypeR, g(typeAliasExpansion, typeAttributes, z10)) : simpleTypeR;
    }

    private final TypeProjection l(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i10) {
        Variance varianceK;
        Variance variance;
        Variance variance2;
        f147637c.b(i10, typeAliasExpansion.b());
        if (typeProjection.a()) {
            Intrinsics.g(typeParameterDescriptor);
            TypeProjection typeProjectionS = TypeUtils.s(typeParameterDescriptor);
            Intrinsics.i(typeProjectionS, "makeStarProjection(...)");
            return typeProjectionS;
        }
        KotlinType type = typeProjection.getType();
        Intrinsics.i(type, "getType(...)");
        TypeProjection typeProjectionC = typeAliasExpansion.c(type.K0());
        if (typeProjectionC == null) {
            return j(typeProjection, typeAliasExpansion, i10);
        }
        if (typeProjectionC.a()) {
            Intrinsics.g(typeParameterDescriptor);
            TypeProjection typeProjectionS2 = TypeUtils.s(typeParameterDescriptor);
            Intrinsics.i(typeProjectionS2, "makeStarProjection(...)");
            return typeProjectionS2;
        }
        UnwrappedType unwrappedTypeN0 = typeProjectionC.getType().N0();
        Variance varianceC = typeProjectionC.c();
        Intrinsics.i(varianceC, "getProjectionKind(...)");
        Variance varianceC2 = typeProjection.c();
        Intrinsics.i(varianceC2, "getProjectionKind(...)");
        if (varianceC2 != varianceC && varianceC2 != (variance2 = Variance.f147703e)) {
            if (varianceC == variance2) {
                varianceC = varianceC2;
            } else {
                this.f147639a.d(typeAliasExpansion.b(), typeParameterDescriptor, unwrappedTypeN0);
            }
        }
        if (typeParameterDescriptor == null || (varianceK = typeParameterDescriptor.k()) == null) {
            varianceK = Variance.f147703e;
        }
        if (varianceK != varianceC && varianceK != (variance = Variance.f147703e)) {
            if (varianceC == variance) {
                varianceC = variance;
            } else {
                this.f147639a.d(typeAliasExpansion.b(), typeParameterDescriptor, unwrappedTypeN0);
            }
        }
        a(type.getAnnotations(), unwrappedTypeN0.getAnnotations());
        return new TypeProjectionImpl(varianceC, unwrappedTypeN0 instanceof DynamicType ? c((DynamicType) unwrappedTypeN0, type.J0()) : f(TypeSubstitutionKt.a(unwrappedTypeN0), type));
    }

    public final SimpleType i(TypeAliasExpansion typeAliasExpansion, TypeAttributes attributes) {
        Intrinsics.j(typeAliasExpansion, "typeAliasExpansion");
        Intrinsics.j(attributes, "attributes");
        return k(typeAliasExpansion, attributes, false, 0, true);
    }

    private final void b(KotlinType kotlinType, KotlinType kotlinType2) {
        TypeSubstitutor typeSubstitutorF = TypeSubstitutor.f(kotlinType2);
        Intrinsics.i(typeSubstitutorF, "create(...)");
        int i10 = 0;
        for (Object obj : kotlinType2.I0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (!typeProjection.a()) {
                KotlinType type = typeProjection.getType();
                Intrinsics.i(type, "getType(...)");
                if (!TypeUtilsKt.g(type)) {
                    TypeProjection typeProjection2 = kotlinType.I0().get(i10);
                    TypeParameterDescriptor typeParameterDescriptor = kotlinType.K0().getParameters().get(i10);
                    if (this.f147640b) {
                        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.f147639a;
                        KotlinType type2 = typeProjection2.getType();
                        Intrinsics.i(type2, "getType(...)");
                        KotlinType type3 = typeProjection.getType();
                        Intrinsics.i(type3, "getType(...)");
                        Intrinsics.g(typeParameterDescriptor);
                        typeAliasExpansionReportStrategy.a(typeSubstitutorF, type2, type3, typeParameterDescriptor);
                    }
                }
            }
            i10 = i11;
        }
    }

    private final DynamicType c(DynamicType dynamicType, TypeAttributes typeAttributes) {
        return dynamicType.Q0(h(dynamicType, typeAttributes));
    }

    private final SimpleType d(SimpleType simpleType, TypeAttributes typeAttributes) {
        if (KotlinTypeKt.a(simpleType)) {
            return simpleType;
        }
        return TypeSubstitutionKt.f(simpleType, null, h(simpleType, typeAttributes), 1, null);
    }

    private final SimpleType e(SimpleType simpleType, KotlinType kotlinType) {
        SimpleType simpleTypeR = TypeUtils.r(simpleType, kotlinType.L0());
        Intrinsics.i(simpleTypeR, "makeNullableIfNeeded(...)");
        return simpleTypeR;
    }

    private final SimpleType f(SimpleType simpleType, KotlinType kotlinType) {
        return d(e(simpleType, kotlinType), kotlinType.J0());
    }

    private final SimpleType g(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z10) {
        TypeConstructor typeConstructorI = typeAliasExpansion.b().i();
        Intrinsics.i(typeConstructorI, "getTypeConstructor(...)");
        return KotlinTypeFactory.m(typeAttributes, typeConstructorI, typeAliasExpansion.a(), z10, MemberScope.Empty.f147200b);
    }

    private final TypeAttributes h(KotlinType kotlinType, TypeAttributes typeAttributes) {
        if (KotlinTypeKt.a(kotlinType)) {
            return kotlinType.J0();
        }
        return typeAttributes.p(kotlinType.J0());
    }

    private final TypeProjection j(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, int i10) {
        UnwrappedType unwrappedTypeN0 = typeProjection.getType().N0();
        if (!DynamicTypesKt.a(unwrappedTypeN0)) {
            SimpleType simpleTypeA = TypeSubstitutionKt.a(unwrappedTypeN0);
            if (!KotlinTypeKt.a(simpleTypeA) && TypeUtilsKt.E(simpleTypeA)) {
                TypeConstructor typeConstructorK0 = simpleTypeA.K0();
                ClassifierDescriptor classifierDescriptorD = typeConstructorK0.d();
                typeConstructorK0.getParameters().size();
                simpleTypeA.I0().size();
                if (!(classifierDescriptorD instanceof TypeParameterDescriptor)) {
                    if (classifierDescriptorD instanceof TypeAliasDescriptor) {
                        TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorD;
                        if (typeAliasExpansion.d(typeAliasDescriptor)) {
                            this.f147639a.b(typeAliasDescriptor);
                            return new TypeProjectionImpl(Variance.f147703e, ErrorUtils.d(ErrorTypeKind.f147879s, typeAliasDescriptor.getName().toString()));
                        }
                        List<TypeProjection> listI0 = simpleTypeA.I0();
                        ArrayList arrayList = new ArrayList(CollectionsKt.x(listI0, 10));
                        int i11 = 0;
                        for (Object obj : listI0) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt.w();
                            }
                            arrayList.add(l((TypeProjection) obj, typeAliasExpansion, typeConstructorK0.getParameters().get(i11), i10 + 1));
                            i11 = i12;
                        }
                        SimpleType simpleTypeK = k(TypeAliasExpansion.f147641e.a(typeAliasExpansion, typeAliasDescriptor, arrayList), simpleTypeA.J0(), simpleTypeA.L0(), i10 + 1, false);
                        SimpleType simpleTypeM = m(simpleTypeA, typeAliasExpansion, i10);
                        if (!DynamicTypesKt.a(simpleTypeK)) {
                            simpleTypeK = SpecialTypesKt.j(simpleTypeK, simpleTypeM);
                        }
                        return new TypeProjectionImpl(typeProjection.c(), simpleTypeK);
                    }
                    SimpleType simpleTypeM2 = m(simpleTypeA, typeAliasExpansion, i10);
                    b(simpleTypeA, simpleTypeM2);
                    return new TypeProjectionImpl(typeProjection.c(), simpleTypeM2);
                }
            }
        }
        return typeProjection;
    }

    private final SimpleType m(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i10) {
        TypeConstructor typeConstructorK0 = simpleType.K0();
        List<TypeProjection> listI0 = simpleType.I0();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listI0, 10));
        int i11 = 0;
        for (Object obj : listI0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.w();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection typeProjectionL = l(typeProjection, typeAliasExpansion, typeConstructorK0.getParameters().get(i11), i10 + 1);
            if (!typeProjectionL.a()) {
                typeProjectionL = new TypeProjectionImpl(typeProjectionL.c(), TypeUtils.q(typeProjectionL.getType(), typeProjection.getType().L0()));
            }
            arrayList.add(typeProjectionL);
            i11 = i12;
        }
        return TypeSubstitutionKt.f(simpleType, arrayList, null, 2, null);
    }
}
