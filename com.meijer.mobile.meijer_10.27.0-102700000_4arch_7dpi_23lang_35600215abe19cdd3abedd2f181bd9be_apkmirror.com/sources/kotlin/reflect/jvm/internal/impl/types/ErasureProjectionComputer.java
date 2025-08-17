package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* loaded from: classes13.dex */
public class ErasureProjectionComputer {
    public static /* synthetic */ TypeProjection b(ErasureProjectionComputer erasureProjectionComputer, TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType kotlinType, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i10 & 8) != 0) {
            kotlinType = typeParameterUpperBoundEraser.e(typeParameterDescriptor, erasureTypeAttributes);
        }
        return erasureProjectionComputer.a(typeParameterDescriptor, erasureTypeAttributes, typeParameterUpperBoundEraser, kotlinType);
    }

    public TypeProjection a(TypeParameterDescriptor parameter, ErasureTypeAttributes typeAttr, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType erasedUpperBound) {
        Intrinsics.j(parameter, "parameter");
        Intrinsics.j(typeAttr, "typeAttr");
        Intrinsics.j(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.j(erasedUpperBound, "erasedUpperBound");
        return new TypeProjectionImpl(Variance.f146798g, erasedUpperBound);
    }
}
