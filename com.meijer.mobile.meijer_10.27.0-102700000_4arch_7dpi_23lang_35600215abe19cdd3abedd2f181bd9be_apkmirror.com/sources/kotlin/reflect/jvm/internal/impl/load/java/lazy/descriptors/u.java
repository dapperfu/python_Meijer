package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class u implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageFragment f144569a;

    public u(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.f144569a = lazyJavaPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageFragment.P0(this.f144569a);
    }
}
