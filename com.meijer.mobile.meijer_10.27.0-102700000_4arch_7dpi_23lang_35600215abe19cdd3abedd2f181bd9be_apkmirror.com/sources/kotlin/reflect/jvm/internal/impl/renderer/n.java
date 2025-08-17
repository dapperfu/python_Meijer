package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* loaded from: classes13.dex */
class n implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final DescriptorRendererImpl f146109a;

    public n(DescriptorRendererImpl descriptorRendererImpl) {
        this.f146109a = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorRendererImpl.p0(this.f146109a, (TypeProjection) obj);
    }
}
