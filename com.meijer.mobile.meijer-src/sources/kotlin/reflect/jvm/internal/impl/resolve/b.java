package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* loaded from: classes14.dex */
class b implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f147068a = new b();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(DescriptorEquivalenceForOverrides.p((DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
    }
}
