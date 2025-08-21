package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: classes14.dex */
class x implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.b f147497a;

    /* renamed from: b, reason: collision with root package name */
    private final DeserializedMemberScope f147498b;

    public x(DeserializedMemberScope.b bVar, DeserializedMemberScope deserializedMemberScope) {
        this.f147497a = bVar;
        this.f147498b = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.b.D(this.f147497a, this.f147498b);
    }
}
