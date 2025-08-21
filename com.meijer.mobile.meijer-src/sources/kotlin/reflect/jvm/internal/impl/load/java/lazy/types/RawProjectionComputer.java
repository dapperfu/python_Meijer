package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes14.dex */
public final class RawProjectionComputer extends ErasureProjectionComputer {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            try {
                iArr[JavaTypeFlexibility.f145495c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JavaTypeFlexibility.f145494b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JavaTypeFlexibility.f145493a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer
    public TypeProjection a(TypeParameterDescriptor parameter, ErasureTypeAttributes typeAttr, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType erasedUpperBound) {
        Intrinsics.j(parameter, "parameter");
        Intrinsics.j(typeAttr, "typeAttr");
        Intrinsics.j(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.j(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof JavaTypeAttributes)) {
            return super.a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        JavaTypeAttributes javaTypeAttributesL = (JavaTypeAttributes) typeAttr;
        if (!javaTypeAttributesL.i()) {
            javaTypeAttributesL = javaTypeAttributesL.l(JavaTypeFlexibility.f145493a);
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[javaTypeAttributesL.g().ordinal()];
        if (i10 == 1) {
            return new TypeProjectionImpl(Variance.f147703e, erasedUpperBound);
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!parameter.k().b()) {
            return new TypeProjectionImpl(Variance.f147703e, DescriptorUtilsKt.m(parameter).I());
        }
        List<TypeParameterDescriptor> parameters = erasedUpperBound.K0().getParameters();
        Intrinsics.i(parameters, "getParameters(...)");
        if (!parameters.isEmpty()) {
            return new TypeProjectionImpl(Variance.f147705g, erasedUpperBound);
        }
        TypeProjection typeProjectionT = TypeUtils.t(parameter, javaTypeAttributesL);
        Intrinsics.g(typeProjectionT);
        return typeProjectionT;
    }
}
