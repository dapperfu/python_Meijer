package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
class m implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeDeserializer f146622a;

    public m(TypeDeserializer typeDeserializer) {
        this.f146622a = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeDeserializer.f(this.f146622a, ((Number) obj).intValue());
    }
}
