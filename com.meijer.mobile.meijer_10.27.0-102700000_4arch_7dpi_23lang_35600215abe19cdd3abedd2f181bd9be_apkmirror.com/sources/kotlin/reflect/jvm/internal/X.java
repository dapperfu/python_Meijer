package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class X implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KMutableProperty1Impl f143146a;

    public X(KMutableProperty1Impl kMutableProperty1Impl) {
        this.f143146a = kMutableProperty1Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KMutableProperty1Impl.n0(this.f143146a);
    }
}
