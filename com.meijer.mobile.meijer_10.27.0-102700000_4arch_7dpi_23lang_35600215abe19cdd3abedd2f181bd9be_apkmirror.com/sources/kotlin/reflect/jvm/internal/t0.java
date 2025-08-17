package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class t0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KTypeImpl f147215a;

    public t0(KTypeImpl kTypeImpl) {
        this.f147215a = kTypeImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeImpl.q(this.f147215a);
    }
}
