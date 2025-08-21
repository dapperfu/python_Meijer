package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class t implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageFragment f145475a;

    public t(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.f145475a = lazyJavaPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageFragment.J0(this.f145475a);
    }
}
