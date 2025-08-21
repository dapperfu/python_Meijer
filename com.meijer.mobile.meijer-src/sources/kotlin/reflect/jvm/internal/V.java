package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class V implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KFunctionImpl f144051a;

    public V(KFunctionImpl kFunctionImpl) {
        this.f144051a = kFunctionImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KFunctionImpl.f0(this.f144051a);
    }
}
