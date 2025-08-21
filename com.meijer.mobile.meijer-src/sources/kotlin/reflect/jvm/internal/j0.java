package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class j0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KProperty1Impl f148101a;

    public j0(KProperty1Impl kProperty1Impl) {
        this.f148101a = kProperty1Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KProperty1Impl.i0(this.f148101a);
    }
}
