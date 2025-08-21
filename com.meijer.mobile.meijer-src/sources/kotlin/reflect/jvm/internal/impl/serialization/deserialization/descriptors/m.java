package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: classes14.dex */
class m implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f147485a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.EnumEntry f147486b;

    public m(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
        this.f147485a = deserializedClassDescriptor;
        this.f147486b = enumEntry;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.b.g(this.f147485a, this.f147486b);
    }
}
