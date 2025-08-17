package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyPackageViewDescriptorImpl f144022a;

    public e(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.f144022a = lazyPackageViewDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(LazyPackageViewDescriptorImpl.I0(this.f144022a));
    }
}
