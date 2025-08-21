package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext$$Util;

/* loaded from: classes14.dex */
public final class NullabilityChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final NullabilityChecker f147744a = new NullabilityChecker();

    public final boolean a(UnwrappedType type) {
        Intrinsics.j(type, "type");
        return AbstractNullabilityChecker.f147571a.a(TypeCheckerProviderContext$$Util.a(SimpleClassicTypeSystemContext.f147746a, false, true, false, 4, null), FlexibleTypesKt.c(type), TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f147666a);
    }

    private NullabilityChecker() {
    }
}
