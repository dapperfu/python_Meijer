package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15340b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmPackageScope f145453a;

    public C15340b(JvmPackageScope jvmPackageScope) {
        this.f145453a = jvmPackageScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmPackageScope.k(this.f145453a);
    }
}
