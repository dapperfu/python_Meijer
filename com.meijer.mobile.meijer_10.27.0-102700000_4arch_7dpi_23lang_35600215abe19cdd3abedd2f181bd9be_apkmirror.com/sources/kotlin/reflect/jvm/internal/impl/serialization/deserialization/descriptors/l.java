package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: classes13.dex */
class l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor.b f146577a;

    public l(DeserializedClassDescriptor.b bVar) {
        this.f146577a = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.b.h(this.f146577a);
    }
}
