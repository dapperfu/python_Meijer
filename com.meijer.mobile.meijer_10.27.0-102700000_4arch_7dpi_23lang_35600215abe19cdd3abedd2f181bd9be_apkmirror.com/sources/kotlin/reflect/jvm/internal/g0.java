package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class g0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KParameterImpl f143224a;

    public g0(KParameterImpl kParameterImpl) {
        this.f143224a = kParameterImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KParameterImpl.a(this.f143224a);
    }
}
