package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class SpecialTypesKt {
    public static final AbbreviatedType a(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        UnwrappedType unwrappedTypeN0 = kotlinType.N0();
        if (unwrappedTypeN0 instanceof AbbreviatedType) {
            return (AbbreviatedType) unwrappedTypeN0;
        }
        return null;
    }

    public static final SimpleType b(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        AbbreviatedType abbreviatedTypeA = a(kotlinType);
        if (abbreviatedTypeA != null) {
            return abbreviatedTypeA.W0();
        }
        return null;
    }

    public static final boolean c(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return kotlinType.N0() instanceof DefinitelyNotNullType;
    }

    public static final UnwrappedType e(UnwrappedType unwrappedType, boolean z10) {
        Intrinsics.j(unwrappedType, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeC = DefinitelyNotNullType.Companion.c(DefinitelyNotNullType.f147594d, unwrappedType, z10, false, 4, null);
        if (definitelyNotNullTypeC != null) {
            return definitelyNotNullTypeC;
        }
        SimpleType simpleTypeG = g(unwrappedType);
        return simpleTypeG != null ? simpleTypeG : unwrappedType.R0(false);
    }

    public static /* synthetic */ UnwrappedType f(UnwrappedType unwrappedType, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(unwrappedType, z10);
    }

    public static final SimpleType h(SimpleType simpleType, boolean z10) {
        Intrinsics.j(simpleType, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeC = DefinitelyNotNullType.Companion.c(DefinitelyNotNullType.f147594d, simpleType, z10, false, 4, null);
        if (definitelyNotNullTypeC != null) {
            return definitelyNotNullTypeC;
        }
        SimpleType simpleTypeG = g(simpleType);
        return simpleTypeG == null ? simpleType.R0(false) : simpleTypeG;
    }

    public static /* synthetic */ SimpleType i(SimpleType simpleType, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(simpleType, z10);
    }

    public static final SimpleType j(SimpleType simpleType, SimpleType abbreviatedType) {
        Intrinsics.j(simpleType, "<this>");
        Intrinsics.j(abbreviatedType, "abbreviatedType");
        return KotlinTypeKt.a(simpleType) ? simpleType : new AbbreviatedType(simpleType, abbreviatedType);
    }

    public static final NewCapturedType k(NewCapturedType newCapturedType) {
        Intrinsics.j(newCapturedType, "<this>");
        return new NewCapturedType(newCapturedType.T0(), newCapturedType.K0(), newCapturedType.V0(), newCapturedType.J0(), newCapturedType.L0(), true);
    }

    private static final IntersectionTypeConstructor d(IntersectionTypeConstructor intersectionTypeConstructor) {
        KotlinType kotlinType;
        Collection<KotlinType> collectionA = intersectionTypeConstructor.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionA, 10));
        Iterator<T> it = collectionA.iterator();
        boolean z10 = false;
        while (true) {
            kotlinType = null;
            if (!it.hasNext()) {
                break;
            }
            KotlinType kotlinTypeF = (KotlinType) it.next();
            if (TypeUtils.l(kotlinTypeF)) {
                kotlinTypeF = f(kotlinTypeF.N0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(kotlinTypeF);
        }
        if (!z10) {
            return null;
        }
        KotlinType kotlinTypeM = intersectionTypeConstructor.m();
        if (kotlinTypeM != null) {
            if (TypeUtils.l(kotlinTypeM)) {
                kotlinTypeM = f(kotlinTypeM.N0(), false, 1, null);
            }
            kotlinType = kotlinTypeM;
        }
        return new IntersectionTypeConstructor(arrayList).s(kotlinType);
    }

    private static final SimpleType g(KotlinType kotlinType) {
        IntersectionTypeConstructor intersectionTypeConstructor;
        IntersectionTypeConstructor intersectionTypeConstructorD;
        TypeConstructor typeConstructorK0 = kotlinType.K0();
        if (typeConstructorK0 instanceof IntersectionTypeConstructor) {
            intersectionTypeConstructor = (IntersectionTypeConstructor) typeConstructorK0;
        } else {
            intersectionTypeConstructor = null;
        }
        if (intersectionTypeConstructor == null || (intersectionTypeConstructorD = d(intersectionTypeConstructor)) == null) {
            return null;
        }
        return intersectionTypeConstructorD.j();
    }
}
