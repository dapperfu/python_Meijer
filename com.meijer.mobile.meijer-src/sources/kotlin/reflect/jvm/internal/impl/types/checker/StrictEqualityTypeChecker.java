package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes14.dex */
public final class StrictEqualityTypeChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final StrictEqualityTypeChecker f147747a = new StrictEqualityTypeChecker();

    public final boolean a(UnwrappedType a10, UnwrappedType b10) {
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        return AbstractStrictEqualityTypeChecker.f147572a.b(SimpleClassicTypeSystemContext.f147746a, a10, b10);
    }

    private StrictEqualityTypeChecker() {
    }
}
