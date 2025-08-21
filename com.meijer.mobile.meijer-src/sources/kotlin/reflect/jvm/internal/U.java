package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class U implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KFunctionImpl f144049a;

    public U(KFunctionImpl kFunctionImpl) {
        this.f144049a = kFunctionImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KFunctionImpl.a0(this.f144049a);
    }
}
