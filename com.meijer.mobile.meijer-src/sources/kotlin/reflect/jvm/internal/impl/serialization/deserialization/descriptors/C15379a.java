package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15379a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f147472a;

    public C15379a(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f147472a = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.i1(this.f147472a);
    }
}
