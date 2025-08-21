package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15387m implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f148106a;

    public C15387m(KCallableImpl kCallableImpl) {
        this.f148106a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.k(this.f148106a);
    }
}
