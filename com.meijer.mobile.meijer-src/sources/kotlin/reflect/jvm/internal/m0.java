package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class m0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KProperty2Impl f148107a;

    public m0(KProperty2Impl kProperty2Impl) {
        this.f148107a = kProperty2Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KProperty2Impl.l0(this.f148107a);
    }
}
