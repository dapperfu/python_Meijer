package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* loaded from: classes13.dex */
class s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s f146114a = new s();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorRendererOptionsImpl.u((ValueParameterDescriptor) obj);
    }
}
