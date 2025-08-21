package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class E implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedTypeParameterDescriptor f147471a;

    public E(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        this.f147471a = deserializedTypeParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedTypeParameterDescriptor.K0(this.f147471a);
    }
}
