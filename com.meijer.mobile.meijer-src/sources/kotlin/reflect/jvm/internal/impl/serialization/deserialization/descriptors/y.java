package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: classes14.dex */
class y implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.b f147499a;

    /* renamed from: b, reason: collision with root package name */
    private final DeserializedMemberScope f147500b;

    public y(DeserializedMemberScope.b bVar, DeserializedMemberScope deserializedMemberScope) {
        this.f147499a = bVar;
        this.f147500b = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.b.P(this.f147499a, this.f147500b);
    }
}
