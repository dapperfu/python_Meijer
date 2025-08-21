package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: classes14.dex */
class h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor.DeserializedClassMemberScope f147479a;

    public h(DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope) {
        this.f147479a = deserializedClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.DeserializedClassMemberScope.F(this.f147479a);
    }
}
