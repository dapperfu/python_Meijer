package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPackageImpl;

/* loaded from: classes14.dex */
class d0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPackageImpl.a f144123a;

    public d0(KPackageImpl.a aVar) {
        this.f144123a = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPackageImpl.a.o(this.f144123a);
    }
}
