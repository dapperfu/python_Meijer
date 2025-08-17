package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ModuleDescriptorImpl f144025a;

    public h(ModuleDescriptorImpl moduleDescriptorImpl) {
        this.f144025a = moduleDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ModuleDescriptorImpl.O0(this.f144025a);
    }
}
