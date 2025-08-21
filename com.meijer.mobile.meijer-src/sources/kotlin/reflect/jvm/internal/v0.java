package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class v0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KTypeImpl f148127a;

    public v0(KTypeImpl kTypeImpl) {
        this.f148127a = kTypeImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeImpl.m(this.f148127a);
    }
}
