package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* loaded from: classes13.dex */
class l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f146619a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f146620b;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f146621c;

    public l(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f146619a = memberDeserializer;
        this.f146620b = property;
        this.f146621c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.y(this.f146619a, this.f146620b, this.f146621c);
    }
}
