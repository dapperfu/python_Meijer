package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15285n implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f147201a;

    public C15285n(KCallableImpl kCallableImpl) {
        this.f147201a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(KCallableImpl.W(this.f147201a));
    }
}
