package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
class n implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeDeserializer f146623a;

    public n(TypeDeserializer typeDeserializer) {
        this.f146623a = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeDeserializer.v(this.f146623a, ((Number) obj).intValue());
    }
}
