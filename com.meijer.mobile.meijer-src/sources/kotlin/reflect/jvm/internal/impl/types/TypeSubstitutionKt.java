package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* loaded from: classes14.dex */
public final class TypeSubstitutionKt {
    @JvmOverloads
    public static final KotlinType b(KotlinType kotlinType, List<? extends TypeProjection> newArguments, Annotations newAnnotations) {
        Intrinsics.j(kotlinType, "<this>");
        Intrinsics.j(newArguments, "newArguments");
        Intrinsics.j(newAnnotations, "newAnnotations");
        return e(kotlinType, newArguments, newAnnotations, null, 4, null);
    }

    public static final SimpleType a(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        UnwrappedType unwrappedTypeN0 = kotlinType.N0();
        SimpleType simpleType = unwrappedTypeN0 instanceof SimpleType ? (SimpleType) unwrappedTypeN0 : null;
        if (simpleType != null) {
            return simpleType;
        }
        throw new IllegalStateException(("This is should be simple type: " + kotlinType).toString());
    }

    @JvmOverloads
    public static final KotlinType c(KotlinType kotlinType, List<? extends TypeProjection> newArguments, Annotations newAnnotations, List<? extends TypeProjection> newArgumentsForUpperBound) {
        Intrinsics.j(kotlinType, "<this>");
        Intrinsics.j(newArguments, "newArguments");
        Intrinsics.j(newAnnotations, "newAnnotations");
        Intrinsics.j(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == kotlinType.I0()) && newAnnotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        TypeAttributes typeAttributesJ0 = kotlinType.J0();
        if ((newAnnotations instanceof FilteredAnnotations) && ((FilteredAnnotations) newAnnotations).isEmpty()) {
            newAnnotations = Annotations.f144596s3.b();
        }
        TypeAttributes typeAttributesA = TypeAttributesKt.a(typeAttributesJ0, newAnnotations);
        UnwrappedType unwrappedTypeN0 = kotlinType.N0();
        if (unwrappedTypeN0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeN0;
            return KotlinTypeFactory.e(d(flexibleType.S0(), newArguments, typeAttributesA), d(flexibleType.T0(), newArgumentsForUpperBound, typeAttributesA));
        }
        if (unwrappedTypeN0 instanceof SimpleType) {
            return d((SimpleType) unwrappedTypeN0, newArguments, typeAttributesA);
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmOverloads
    public static final SimpleType d(SimpleType simpleType, List<? extends TypeProjection> newArguments, TypeAttributes newAttributes) {
        Intrinsics.j(simpleType, "<this>");
        Intrinsics.j(newArguments, "newArguments");
        Intrinsics.j(newAttributes, "newAttributes");
        return (newArguments.isEmpty() && newAttributes == simpleType.J0()) ? simpleType : newArguments.isEmpty() ? simpleType.Q0(newAttributes) : simpleType instanceof ErrorType ? ((ErrorType) simpleType).W0(newArguments) : KotlinTypeFactory.k(newAttributes, simpleType.K0(), newArguments, simpleType.L0(), null, 16, null);
    }

    public static /* synthetic */ KotlinType e(KotlinType kotlinType, List list, Annotations annotations, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = kotlinType.I0();
        }
        if ((i10 & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(kotlinType, list, annotations, list2);
    }

    public static /* synthetic */ SimpleType f(SimpleType simpleType, List list, TypeAttributes typeAttributes, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = simpleType.I0();
        }
        if ((i10 & 2) != 0) {
            typeAttributes = simpleType.J0();
        }
        return d(simpleType, list, typeAttributes);
    }
}
