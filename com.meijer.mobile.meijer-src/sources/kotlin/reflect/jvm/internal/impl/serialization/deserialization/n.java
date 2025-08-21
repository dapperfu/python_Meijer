package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
class n implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeDeserializer f147530a;

    public n(TypeDeserializer typeDeserializer) {
        this.f147530a = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeDeserializer.v(this.f147530a, ((Number) obj).intValue());
    }
}
