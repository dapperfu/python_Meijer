package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes14.dex */
class p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeDeserializer f147533a;

    public p(TypeDeserializer typeDeserializer) {
        this.f147533a = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeDeserializer.z(this.f147533a, (ProtoBuf.Type) obj);
    }
}
