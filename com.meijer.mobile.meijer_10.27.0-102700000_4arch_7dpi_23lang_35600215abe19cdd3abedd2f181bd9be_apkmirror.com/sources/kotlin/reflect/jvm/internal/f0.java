package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class f0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KParameterImpl f143222a;

    public f0(KParameterImpl kParameterImpl) {
        this.f143222a = kParameterImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KParameterImpl.j(this.f143222a);
    }
}
