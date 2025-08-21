package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: classes14.dex */
class w implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.b f147496a;

    public w(DeserializedMemberScope.b bVar) {
        this.f147496a = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.b.N(this.f147496a);
    }
}
