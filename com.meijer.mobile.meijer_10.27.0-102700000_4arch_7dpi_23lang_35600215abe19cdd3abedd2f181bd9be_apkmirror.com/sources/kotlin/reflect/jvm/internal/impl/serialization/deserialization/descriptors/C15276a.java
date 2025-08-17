package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15276a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f146565a;

    public C15276a(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f146565a = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.i1(this.f146565a);
    }
}
