package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: classes14.dex */
class A implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.OptimizedImplementation f147364a;

    public A(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        this.f147364a = optimizedImplementation;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DeserializedMemberScope.OptimizedImplementation.s(this.f147364a, (Name) obj);
    }
}
