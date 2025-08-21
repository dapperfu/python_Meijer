package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPackageImpl;

/* renamed from: kotlin.reflect.jvm.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15332c0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPackageImpl.a f144061a;

    /* renamed from: b, reason: collision with root package name */
    private final KPackageImpl f144062b;

    public C15332c0(KPackageImpl.a aVar, KPackageImpl kPackageImpl) {
        this.f144061a = aVar;
        this.f144062b = kPackageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPackageImpl.a.p(this.f144061a, this.f144062b);
    }
}
