package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class Z implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPackageImpl f143148a;

    public Z(KPackageImpl kPackageImpl) {
        this.f143148a = kPackageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPackageImpl.R(this.f143148a);
    }
}
