package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class h0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KProperty0Impl f143226a;

    public h0(KProperty0Impl kProperty0Impl) {
        this.f143226a = kProperty0Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KProperty0Impl.i0(this.f143226a);
    }
}
