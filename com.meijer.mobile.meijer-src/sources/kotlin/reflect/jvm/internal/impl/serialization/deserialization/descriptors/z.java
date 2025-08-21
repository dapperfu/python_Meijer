package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: classes14.dex */
class z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.OptimizedImplementation f147501a;

    public z(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        this.f147501a = optimizedImplementation;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DeserializedMemberScope.OptimizedImplementation.q(this.f147501a, (Name) obj);
    }
}
