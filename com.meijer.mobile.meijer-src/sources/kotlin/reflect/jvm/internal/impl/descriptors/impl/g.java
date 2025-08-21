package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
class g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final ModuleDescriptorImpl f144931a;

    public g(ModuleDescriptorImpl moduleDescriptorImpl) {
        this.f144931a = moduleDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ModuleDescriptorImpl.P0(this.f144931a, (FqName) obj);
    }
}
