package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: classes14.dex */
class j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f147481a;

    public j(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f147481a = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.a.L(this.f147481a);
    }
}
