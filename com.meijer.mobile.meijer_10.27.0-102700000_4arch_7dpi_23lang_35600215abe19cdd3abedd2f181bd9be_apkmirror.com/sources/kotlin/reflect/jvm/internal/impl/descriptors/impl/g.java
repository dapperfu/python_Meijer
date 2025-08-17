package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
class g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final ModuleDescriptorImpl f144024a;

    public g(ModuleDescriptorImpl moduleDescriptorImpl) {
        this.f144024a = moduleDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ModuleDescriptorImpl.P0(this.f144024a, (FqName) obj);
    }
}
