package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: classes14.dex */
class i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor.DeserializedClassMemberScope f147480a;

    public i(DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope) {
        this.f147480a = deserializedClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.DeserializedClassMemberScope.J(this.f147480a);
    }
}
