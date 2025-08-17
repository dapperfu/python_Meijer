package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15282k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f147195a;

    public C15282k(KCallableImpl kCallableImpl) {
        this.f147195a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.x(this.f147195a);
    }
}
