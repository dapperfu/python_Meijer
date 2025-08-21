package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: classes14.dex */
class D implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.OptimizedImplementation f147368a;

    /* renamed from: b, reason: collision with root package name */
    private final DeserializedMemberScope f147369b;

    public D(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        this.f147368a = optimizedImplementation;
        this.f147369b = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.OptimizedImplementation.u(this.f147368a, this.f147369b);
    }
}
