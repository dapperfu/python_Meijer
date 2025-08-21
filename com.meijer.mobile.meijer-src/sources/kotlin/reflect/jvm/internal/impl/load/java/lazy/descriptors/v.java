package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class v implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageFragment f145477a;

    public v(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.f145477a = lazyJavaPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageFragment.O0(this.f145477a);
    }
}
