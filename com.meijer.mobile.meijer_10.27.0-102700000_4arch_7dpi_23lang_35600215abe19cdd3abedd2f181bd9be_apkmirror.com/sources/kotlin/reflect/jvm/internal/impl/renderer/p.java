package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
class p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final DescriptorRendererImpl f146111a;

    public p(DescriptorRendererImpl descriptorRendererImpl) {
        this.f146111a = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorRendererImpl.p2(this.f146111a, (KotlinType) obj);
    }
}
