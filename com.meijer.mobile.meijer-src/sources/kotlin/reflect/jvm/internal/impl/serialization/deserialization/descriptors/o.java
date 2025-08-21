package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class o implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope f147488a;

    public o(DeserializedMemberScope deserializedMemberScope) {
        this.f147488a = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.l(this.f147488a);
    }
}
