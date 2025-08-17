package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes13.dex */
class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f146217a;

    public d(boolean z10) {
        this.f146217a = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorUtilsKt.A(this.f146217a, (CallableMemberDescriptor) obj);
    }
}
