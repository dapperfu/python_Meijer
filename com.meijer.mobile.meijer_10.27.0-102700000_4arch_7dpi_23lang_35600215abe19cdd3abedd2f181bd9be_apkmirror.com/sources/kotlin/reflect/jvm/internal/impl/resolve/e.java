package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* loaded from: classes13.dex */
class e implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    private final CallableDescriptor f146218a;

    /* renamed from: b, reason: collision with root package name */
    private final CallableDescriptor f146219b;

    public e(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f146218a = callableDescriptor;
        this.f146219b = callableDescriptor2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(DescriptorEquivalenceForOverrides.i(this.f146218a, this.f146219b, (DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
    }
}
