package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* loaded from: classes14.dex */
class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f147502a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f147503b;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f147504c;

    public e(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f147502a = memberDeserializer;
        this.f147503b = property;
        this.f147504c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.v(this.f147502a, this.f147503b, this.f147504c);
    }
}
