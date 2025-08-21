package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15388n implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f148108a;

    public C15388n(KCallableImpl kCallableImpl) {
        this.f148108a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(KCallableImpl.W(this.f148108a));
    }
}
