package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class T implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KFunctionImpl f143140a;

    /* renamed from: b, reason: collision with root package name */
    private final String f143141b;

    public T(KFunctionImpl kFunctionImpl, String str) {
        this.f143140a = kFunctionImpl;
        this.f143141b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KFunctionImpl.g0(this.f143140a, this.f143141b);
    }
}
