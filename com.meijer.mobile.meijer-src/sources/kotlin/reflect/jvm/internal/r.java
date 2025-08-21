package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class r implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f148117a;

    public r(KCallableImpl kCallableImpl) {
        this.f148117a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.y(this.f148117a);
    }
}
