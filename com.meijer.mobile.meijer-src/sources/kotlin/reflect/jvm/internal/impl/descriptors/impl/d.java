package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyPackageViewDescriptorImpl f144928a;

    public d(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.f144928a = lazyPackageViewDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyPackageViewDescriptorImpl.J0(this.f144928a);
    }
}
