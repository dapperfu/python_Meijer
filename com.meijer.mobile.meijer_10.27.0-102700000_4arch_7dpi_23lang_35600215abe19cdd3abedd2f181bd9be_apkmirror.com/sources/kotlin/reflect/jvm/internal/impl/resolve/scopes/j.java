package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;

/* loaded from: classes13.dex */
class j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j f146316a = new j();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeIntersectionScope.n((CallableDescriptor) obj);
    }
}
