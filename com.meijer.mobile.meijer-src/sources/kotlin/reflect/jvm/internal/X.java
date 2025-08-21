package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class X implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KMutableProperty1Impl f144053a;

    public X(KMutableProperty1Impl kMutableProperty1Impl) {
        this.f144053a = kMutableProperty1Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KMutableProperty1Impl.n0(this.f144053a);
    }
}
