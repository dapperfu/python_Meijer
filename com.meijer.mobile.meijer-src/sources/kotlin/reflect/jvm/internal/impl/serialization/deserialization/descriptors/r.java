package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: classes14.dex */
class r implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.b f147491a;

    public r(DeserializedMemberScope.b bVar) {
        this.f147491a = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.b.t(this.f147491a);
    }
}
