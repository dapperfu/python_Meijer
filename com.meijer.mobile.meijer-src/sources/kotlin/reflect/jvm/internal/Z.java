package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class Z implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPackageImpl f144055a;

    public Z(KPackageImpl kPackageImpl) {
        this.f144055a = kPackageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPackageImpl.R(this.f144055a);
    }
}
