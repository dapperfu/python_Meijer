package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: classes13.dex */
class y implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.b f146592a;

    /* renamed from: b, reason: collision with root package name */
    private final DeserializedMemberScope f146593b;

    public y(DeserializedMemberScope.b bVar, DeserializedMemberScope deserializedMemberScope) {
        this.f146592a = bVar;
        this.f146593b = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.b.P(this.f146592a, this.f146593b);
    }
}
