package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes14.dex */
public final class TypeSystemContextKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.f147703e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.f147704f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.f147705g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TypeVariance a(Variance variance) {
        Intrinsics.j(variance, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i10 == 1) {
            return TypeVariance.f147922d;
        }
        if (i10 == 2) {
            return TypeVariance.f147920b;
        }
        if (i10 == 3) {
            return TypeVariance.f147921c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
