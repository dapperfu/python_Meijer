package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* loaded from: classes14.dex */
class k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f147523a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f147524b;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f147525c;

    public k(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f147523a = memberDeserializer;
        this.f147524b = property;
        this.f147525c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.w(this.f147523a, this.f147524b, this.f147525c);
    }
}
