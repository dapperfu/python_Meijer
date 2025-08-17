package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CapturedTypeApproximationKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.f146796e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.f146797f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.f146798g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ApproximationBounds<KotlinType> b(KotlinType type) {
        Object objG;
        Intrinsics.j(type, "type");
        if (FlexibleTypesKt.b(type)) {
            ApproximationBounds<KotlinType> approximationBoundsB = b(FlexibleTypesKt.c(type));
            ApproximationBounds<KotlinType> approximationBoundsB2 = b(FlexibleTypesKt.d(type));
            return new ApproximationBounds<>(TypeWithEnhancementKt.b(KotlinTypeFactory.e(FlexibleTypesKt.c(approximationBoundsB.c()), FlexibleTypesKt.d(approximationBoundsB2.c())), type), TypeWithEnhancementKt.b(KotlinTypeFactory.e(FlexibleTypesKt.c(approximationBoundsB.d()), FlexibleTypesKt.d(approximationBoundsB2.d())), type));
        }
        TypeConstructor typeConstructorK0 = type.K0();
        if (CapturedTypeConstructorKt.f(type)) {
            Intrinsics.h(typeConstructorK0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            TypeProjection typeProjectionF0 = ((CapturedTypeConstructor) typeConstructorK0).f0();
            KotlinType type2 = typeProjectionF0.getType();
            Intrinsics.i(type2, "getType(...)");
            KotlinType kotlinTypeC = c(type2, type);
            int i10 = WhenMappings.$EnumSwitchMapping$0[typeProjectionF0.c().ordinal()];
            if (i10 == 2) {
                return new ApproximationBounds<>(kotlinTypeC, TypeUtilsKt.n(type).J());
            }
            if (i10 == 3) {
                SimpleType simpleTypeI = TypeUtilsKt.n(type).I();
                Intrinsics.i(simpleTypeI, "getNothingType(...)");
                return new ApproximationBounds<>(c(simpleTypeI, type), kotlinTypeC);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + typeProjectionF0);
        }
        if (type.I0().isEmpty() || type.I0().size() != typeConstructorK0.getParameters().size()) {
            return new ApproximationBounds<>(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> listI0 = type.I0();
        List<TypeParameterDescriptor> parameters = typeConstructorK0.getParameters();
        Intrinsics.i(parameters, "getParameters(...)");
        for (Pair pair : CollectionsKt.u1(listI0, parameters)) {
            TypeProjection typeProjection = (TypeProjection) pair.a();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.b();
            Intrinsics.g(typeParameterDescriptor);
            b bVarI = i(typeProjection, typeParameterDescriptor);
            if (typeProjection.a()) {
                arrayList.add(bVarI);
                arrayList2.add(bVarI);
            } else {
                ApproximationBounds<b> approximationBoundsF = f(bVarI);
                b bVarA = approximationBoundsF.a();
                b bVarB = approximationBoundsF.b();
                arrayList.add(bVarA);
                arrayList2.add(bVarB);
            }
        }
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((b) it.next()).d()) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            objG = TypeUtilsKt.n(type).I();
            Intrinsics.i(objG, "getNothingType(...)");
        } else {
            objG = g(type, arrayList);
        }
        return new ApproximationBounds<>(objG, g(type, arrayList2));
    }

    public static final TypeProjection d(TypeProjection typeProjection, boolean z10) {
        if (typeProjection == null) {
            return null;
        }
        if (!typeProjection.a()) {
            KotlinType type = typeProjection.getType();
            Intrinsics.i(type, "getType(...)");
            if (TypeUtils.c(type, a.f147041a)) {
                Variance varianceC = typeProjection.c();
                Intrinsics.i(varianceC, "getProjectionKind(...)");
                return varianceC == Variance.f146798g ? new TypeProjectionImpl(varianceC, b(type).d()) : z10 ? new TypeProjectionImpl(varianceC, b(type).c()) : h(typeProjection);
            }
        }
        return typeProjection;
    }

    private static final TypeProjection h(TypeProjection typeProjection) {
        TypeSubstitutor typeSubstitutorG = TypeSubstitutor.g(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            public TypeProjection k(TypeConstructor key) {
                Intrinsics.j(key, "key");
                CapturedTypeConstructor capturedTypeConstructor = key instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) key : null;
                if (capturedTypeConstructor == null) {
                    return null;
                }
                return capturedTypeConstructor.f0().a() ? new TypeProjectionImpl(Variance.f146798g, capturedTypeConstructor.f0().getType()) : capturedTypeConstructor.f0();
            }
        });
        Intrinsics.i(typeSubstitutorG, "create(...)");
        return typeSubstitutorG.t(typeProjection);
    }

    private static final KotlinType c(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinType kotlinTypeQ = TypeUtils.q(kotlinType, kotlinType2.L0());
        Intrinsics.i(kotlinTypeQ, "makeNullableIfNeeded(...)");
        return kotlinTypeQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean e(UnwrappedType unwrappedType) {
        Intrinsics.g(unwrappedType);
        return Boolean.valueOf(CapturedTypeConstructorKt.f(unwrappedType));
    }

    private static final ApproximationBounds<b> f(b bVar) {
        ApproximationBounds<KotlinType> approximationBoundsB = b(bVar.a());
        KotlinType kotlinTypeA = approximationBoundsB.a();
        KotlinType kotlinTypeB = approximationBoundsB.b();
        ApproximationBounds<KotlinType> approximationBoundsB2 = b(bVar.b());
        return new ApproximationBounds<>(new b(bVar.c(), kotlinTypeB, approximationBoundsB2.a()), new b(bVar.c(), kotlinTypeA, approximationBoundsB2.b()));
    }

    private static final KotlinType g(KotlinType kotlinType, List<b> list) {
        kotlinType.I0().size();
        list.size();
        List<b> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(j((b) it.next()));
        }
        return TypeSubstitutionKt.e(kotlinType, arrayList, null, null, 6, null);
    }

    private static final b i(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.c(typeParameterDescriptor.k(), typeProjection).ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    SimpleType simpleTypeI = DescriptorUtilsKt.m(typeParameterDescriptor).I();
                    Intrinsics.i(simpleTypeI, "getNothingType(...)");
                    KotlinType type = typeProjection.getType();
                    Intrinsics.i(type, "getType(...)");
                    return new b(typeParameterDescriptor, simpleTypeI, type);
                }
                throw new NoWhenBranchMatchedException();
            }
            KotlinType type2 = typeProjection.getType();
            Intrinsics.i(type2, "getType(...)");
            SimpleType simpleTypeJ = DescriptorUtilsKt.m(typeParameterDescriptor).J();
            Intrinsics.i(simpleTypeJ, "getNullableAnyType(...)");
            return new b(typeParameterDescriptor, type2, simpleTypeJ);
        }
        KotlinType type3 = typeProjection.getType();
        Intrinsics.i(type3, "getType(...)");
        KotlinType type4 = typeProjection.getType();
        Intrinsics.i(type4, "getType(...)");
        return new b(typeParameterDescriptor, type3, type4);
    }

    private static final TypeProjection j(b bVar) {
        bVar.d();
        if (!Intrinsics.e(bVar.a(), bVar.b())) {
            Variance varianceK = bVar.c().k();
            Variance variance = Variance.f146797f;
            if (varianceK != variance) {
                if (KotlinBuiltIns.o0(bVar.a()) && bVar.c().k() != variance) {
                    return new TypeProjectionImpl(k(bVar, Variance.f146798g), bVar.b());
                }
                if (KotlinBuiltIns.q0(bVar.b())) {
                    return new TypeProjectionImpl(k(bVar, variance), bVar.a());
                }
                return new TypeProjectionImpl(k(bVar, Variance.f146798g), bVar.b());
            }
        }
        return new TypeProjectionImpl(bVar.a());
    }

    private static final Variance k(b bVar, Variance variance) {
        if (variance == bVar.c().k()) {
            return Variance.f146796e;
        }
        return variance;
    }
}
