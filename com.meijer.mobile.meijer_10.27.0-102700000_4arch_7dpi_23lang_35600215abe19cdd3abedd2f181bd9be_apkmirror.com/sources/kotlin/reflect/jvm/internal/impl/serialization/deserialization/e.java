package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* loaded from: classes13.dex */
class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f146595a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f146596b;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f146597c;

    public e(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f146595a = memberDeserializer;
        this.f146596b = property;
        this.f146597c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.v(this.f146595a, this.f146596b, this.f146597c);
    }
}
