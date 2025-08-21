package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: classes14.dex */
class C implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.OptimizedImplementation f147366a;

    /* renamed from: b, reason: collision with root package name */
    private final DeserializedMemberScope f147367b;

    public C(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        this.f147366a = optimizedImplementation;
        this.f147367b = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedMemberScope.OptimizedImplementation.p(this.f147366a, this.f147367b);
    }
}
