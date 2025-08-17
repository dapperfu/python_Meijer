package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15284m implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f147199a;

    public C15284m(KCallableImpl kCallableImpl) {
        this.f147199a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.k(this.f147199a);
    }
}
