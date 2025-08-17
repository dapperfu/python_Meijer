package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* loaded from: classes13.dex */
class k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f146616a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f146617b;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f146618c;

    public k(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f146616a = memberDeserializer;
        this.f146617b = property;
        this.f146618c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.w(this.f146616a, this.f146617b, this.f146618c);
    }
}
