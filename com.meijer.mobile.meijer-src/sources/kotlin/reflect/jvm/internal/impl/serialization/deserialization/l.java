package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* loaded from: classes14.dex */
class l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f147526a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f147527b;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f147528c;

    public l(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f147526a = memberDeserializer;
        this.f147527b = property;
        this.f147528c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.y(this.f147526a, this.f147527b, this.f147528c);
    }
}
