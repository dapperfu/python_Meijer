package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPackageImpl;

/* renamed from: kotlin.reflect.jvm.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15229c0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPackageImpl.a f143154a;

    /* renamed from: b, reason: collision with root package name */
    private final KPackageImpl f143155b;

    public C15229c0(KPackageImpl.a aVar, KPackageImpl kPackageImpl) {
        this.f143154a = aVar;
        this.f143155b = kPackageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPackageImpl.a.p(this.f143154a, this.f143155b);
    }
}
