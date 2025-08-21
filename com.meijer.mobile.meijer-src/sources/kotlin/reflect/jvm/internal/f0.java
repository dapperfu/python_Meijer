package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class f0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KParameterImpl f144129a;

    public f0(KParameterImpl kParameterImpl) {
        this.f144129a = kParameterImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KParameterImpl.j(this.f144129a);
    }
}
