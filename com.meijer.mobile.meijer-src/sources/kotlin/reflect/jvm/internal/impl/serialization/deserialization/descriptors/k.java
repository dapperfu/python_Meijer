package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: classes14.dex */
class k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor.b f147482a;

    /* renamed from: b, reason: collision with root package name */
    private final DeserializedClassDescriptor f147483b;

    public k(DeserializedClassDescriptor.b bVar, DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f147482a = bVar;
        this.f147483b = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DeserializedClassDescriptor.b.f(this.f147482a, this.f147483b, (Name) obj);
    }
}
