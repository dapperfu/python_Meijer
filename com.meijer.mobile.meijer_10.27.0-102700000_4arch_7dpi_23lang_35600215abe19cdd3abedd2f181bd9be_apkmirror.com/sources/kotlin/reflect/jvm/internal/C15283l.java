package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15283l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f147197a;

    public C15283l(KCallableImpl kCallableImpl) {
        this.f147197a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.z(this.f147197a);
    }
}
