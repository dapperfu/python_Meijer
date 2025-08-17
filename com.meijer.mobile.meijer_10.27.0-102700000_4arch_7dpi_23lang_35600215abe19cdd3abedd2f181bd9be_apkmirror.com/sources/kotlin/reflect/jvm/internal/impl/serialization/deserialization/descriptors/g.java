package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: classes13.dex */
class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f146571a;

    public g(List list) {
        this.f146571a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.DeserializedClassMemberScope.B(this.f146571a);
    }
}
