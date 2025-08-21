package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* loaded from: classes14.dex */
class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f147505a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f147506b;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f147507c;

    public f(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f147505a = memberDeserializer;
        this.f147506b = property;
        this.f147507c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.x(this.f147505a, this.f147506b, this.f147507c);
    }
}
