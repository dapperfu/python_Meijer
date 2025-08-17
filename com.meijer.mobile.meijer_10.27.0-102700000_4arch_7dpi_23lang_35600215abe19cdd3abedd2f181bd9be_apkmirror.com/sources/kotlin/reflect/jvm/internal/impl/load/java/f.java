package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* loaded from: classes13.dex */
class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f144378a = new f();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ErasedOverridabilityCondition.d((ValueParameterDescriptor) obj);
    }
}
