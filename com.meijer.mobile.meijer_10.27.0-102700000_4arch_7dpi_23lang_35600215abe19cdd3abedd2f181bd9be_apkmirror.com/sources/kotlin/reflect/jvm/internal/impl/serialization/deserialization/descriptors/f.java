package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f146570a;

    public f(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f146570a = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.R0(this.f146570a);
    }
}
