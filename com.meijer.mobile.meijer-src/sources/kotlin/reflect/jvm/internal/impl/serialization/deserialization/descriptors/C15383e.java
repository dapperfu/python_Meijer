package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15383e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f147476a;

    public C15383e(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f147476a = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.k1(this.f147476a);
    }
}
