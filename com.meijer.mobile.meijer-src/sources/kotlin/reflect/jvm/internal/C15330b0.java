package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPackageImpl;

/* renamed from: kotlin.reflect.jvm.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15330b0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPackageImpl.a f144059a;

    public C15330b0(KPackageImpl.a aVar) {
        this.f144059a = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPackageImpl.a.q(this.f144059a);
    }
}
