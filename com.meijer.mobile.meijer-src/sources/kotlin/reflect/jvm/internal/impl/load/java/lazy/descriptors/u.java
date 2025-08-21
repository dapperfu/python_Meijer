package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class u implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageFragment f145476a;

    public u(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.f145476a = lazyJavaPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageFragment.P0(this.f145476a);
    }
}
