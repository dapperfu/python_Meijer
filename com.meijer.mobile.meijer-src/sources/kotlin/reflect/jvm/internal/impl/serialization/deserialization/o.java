package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes14.dex */
class o implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeDeserializer f147531a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Type f147532b;

    public o(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        this.f147531a = typeDeserializer;
        this.f147532b = type;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeDeserializer.r(this.f147531a, this.f147532b);
    }
}
