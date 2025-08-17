package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15237b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmPackageScope f144546a;

    public C15237b(JvmPackageScope jvmPackageScope) {
        this.f144546a = jvmPackageScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmPackageScope.k(this.f144546a);
    }
}
