package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPackageImpl;

/* loaded from: classes14.dex */
class e0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPackageImpl f144125a;

    /* renamed from: b, reason: collision with root package name */
    private final KPackageImpl.a f144126b;

    public e0(KPackageImpl kPackageImpl, KPackageImpl.a aVar) {
        this.f144125a = kPackageImpl;
        this.f144126b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPackageImpl.a.n(this.f144125a, this.f144126b);
    }
}
