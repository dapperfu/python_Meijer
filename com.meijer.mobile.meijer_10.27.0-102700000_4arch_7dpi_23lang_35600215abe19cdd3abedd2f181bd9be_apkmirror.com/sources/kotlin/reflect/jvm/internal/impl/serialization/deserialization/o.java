package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes13.dex */
class o implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeDeserializer f146624a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Type f146625b;

    public o(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        this.f146624a = typeDeserializer;
        this.f146625b = type;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeDeserializer.r(this.f146624a, this.f146625b);
    }
}
