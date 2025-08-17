package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyPackageViewDescriptorImpl f144023a;

    public f(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.f144023a = lazyPackageViewDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyPackageViewDescriptorImpl.N0(this.f144023a);
    }
}
