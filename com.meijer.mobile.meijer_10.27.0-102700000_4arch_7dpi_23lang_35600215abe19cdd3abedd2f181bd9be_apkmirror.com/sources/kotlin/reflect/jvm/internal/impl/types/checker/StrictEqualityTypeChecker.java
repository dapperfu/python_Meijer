package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes13.dex */
public final class StrictEqualityTypeChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final StrictEqualityTypeChecker f146840a = new StrictEqualityTypeChecker();

    public final boolean a(UnwrappedType a10, UnwrappedType b10) {
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        return AbstractStrictEqualityTypeChecker.f146665a.b(SimpleClassicTypeSystemContext.f146839a, a10, b10);
    }

    private StrictEqualityTypeChecker() {
    }
}
