package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class j0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KProperty1Impl f147194a;

    public j0(KProperty1Impl kProperty1Impl) {
        this.f147194a = kProperty1Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KProperty1Impl.i0(this.f147194a);
    }
}
