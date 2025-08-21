package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* loaded from: classes14.dex */
public /* synthetic */ class TypeCheckerProviderContext$$Util {
    public static /* synthetic */ TypeCheckerState a(TypeCheckerProviderContext typeCheckerProviderContext, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newTypeCheckerState");
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return typeCheckerProviderContext.H0(z10, z11, z12);
    }
}
