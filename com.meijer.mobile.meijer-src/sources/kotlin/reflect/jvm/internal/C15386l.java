package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15386l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f148104a;

    public C15386l(KCallableImpl kCallableImpl) {
        this.f148104a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.z(this.f148104a);
    }
}
