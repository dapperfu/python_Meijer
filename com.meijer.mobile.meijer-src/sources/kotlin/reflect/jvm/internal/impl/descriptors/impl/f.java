package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyPackageViewDescriptorImpl f144930a;

    public f(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.f144930a = lazyPackageViewDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyPackageViewDescriptorImpl.N0(this.f144930a);
    }
}
