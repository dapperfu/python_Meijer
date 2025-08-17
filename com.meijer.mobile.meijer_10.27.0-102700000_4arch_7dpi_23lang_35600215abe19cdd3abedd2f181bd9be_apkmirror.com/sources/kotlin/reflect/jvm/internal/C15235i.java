package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15235i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f143227a;

    public C15235i(KCallableImpl kCallableImpl) {
        this.f143227a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.o(this.f143227a);
    }
}
