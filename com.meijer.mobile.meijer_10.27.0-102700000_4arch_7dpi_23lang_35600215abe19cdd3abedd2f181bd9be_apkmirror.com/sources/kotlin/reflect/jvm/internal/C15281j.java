package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15281j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f147193a;

    public C15281j(KCallableImpl kCallableImpl) {
        this.f147193a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.p(this.f147193a);
    }
}
