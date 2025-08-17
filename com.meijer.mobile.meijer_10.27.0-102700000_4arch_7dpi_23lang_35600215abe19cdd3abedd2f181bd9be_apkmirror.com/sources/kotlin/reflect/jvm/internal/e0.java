package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPackageImpl;

/* loaded from: classes13.dex */
class e0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPackageImpl f143218a;

    /* renamed from: b, reason: collision with root package name */
    private final KPackageImpl.a f143219b;

    public e0(KPackageImpl kPackageImpl, KPackageImpl.a aVar) {
        this.f143218a = kPackageImpl;
        this.f143219b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPackageImpl.a.n(this.f143218a, this.f143219b);
    }
}
