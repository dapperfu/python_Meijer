package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class T implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KFunctionImpl f144047a;

    /* renamed from: b, reason: collision with root package name */
    private final String f144048b;

    public T(KFunctionImpl kFunctionImpl, String str) {
        this.f144047a = kFunctionImpl;
        this.f144048b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KFunctionImpl.g0(this.f144047a, this.f144048b);
    }
}
