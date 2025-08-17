package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* loaded from: classes13.dex */
class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f146598a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f146599b;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f146600c;

    public f(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f146598a = memberDeserializer;
        this.f146599b = property;
        this.f146600c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.x(this.f146598a, this.f146599b, this.f146600c);
    }
}
