package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class x0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KTypeParameterImpl f148133a;

    public x0(KTypeParameterImpl kTypeParameterImpl) {
        this.f148133a = kTypeParameterImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeParameterImpl.f(this.f148133a);
    }
}
