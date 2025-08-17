package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPackageImpl;

/* loaded from: classes13.dex */
class d0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPackageImpl.a f143216a;

    public d0(KPackageImpl.a aVar) {
        this.f143216a = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPackageImpl.a.o(this.f143216a);
    }
}
