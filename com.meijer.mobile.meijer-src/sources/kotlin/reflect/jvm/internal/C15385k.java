package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15385k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f148102a;

    public C15385k(KCallableImpl kCallableImpl) {
        this.f148102a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.x(this.f148102a);
    }
}
