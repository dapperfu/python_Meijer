package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPackageImpl;

/* renamed from: kotlin.reflect.jvm.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15225a0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPackageImpl f143150a;

    public C15225a0(KPackageImpl kPackageImpl) {
        this.f143150a = kPackageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPackageImpl.a.m(this.f143150a);
    }
}
