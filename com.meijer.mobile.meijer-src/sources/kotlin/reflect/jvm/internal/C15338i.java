package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15338i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KCallableImpl f144134a;

    public C15338i(KCallableImpl kCallableImpl) {
        this.f144134a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.o(this.f144134a);
    }
}
