package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* loaded from: classes13.dex */
class c implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f146162a = new c();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(DescriptorEquivalenceForOverrides.g((DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
    }
}
