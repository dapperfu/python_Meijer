package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15280e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f146569a;

    public C15280e(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f146569a = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.k1(this.f146569a);
    }
}
