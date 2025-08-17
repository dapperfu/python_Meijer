package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class o implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope f146581a;

    public o(DeserializedMemberScope deserializedMemberScope) {
        this.f146581a = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.l(this.f146581a);
    }
}
