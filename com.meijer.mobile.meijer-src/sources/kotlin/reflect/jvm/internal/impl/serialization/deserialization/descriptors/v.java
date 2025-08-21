package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: classes14.dex */
class v implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.b f147495a;

    public v(DeserializedMemberScope.b bVar) {
        this.f147495a = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.b.E(this.f147495a);
    }
}
