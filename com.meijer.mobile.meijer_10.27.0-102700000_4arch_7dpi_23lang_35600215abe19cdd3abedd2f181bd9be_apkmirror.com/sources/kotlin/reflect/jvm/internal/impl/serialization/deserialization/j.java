package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes13.dex */
class j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f146610a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoContainer f146611b;

    /* renamed from: c, reason: collision with root package name */
    private final MessageLite f146612c;

    /* renamed from: d, reason: collision with root package name */
    private final AnnotatedCallableKind f146613d;

    /* renamed from: e, reason: collision with root package name */
    private final int f146614e;

    /* renamed from: f, reason: collision with root package name */
    private final ProtoBuf.ValueParameter f146615f;

    public j(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf.ValueParameter valueParameter) {
        this.f146610a = memberDeserializer;
        this.f146611b = protoContainer;
        this.f146612c = messageLite;
        this.f146613d = annotatedCallableKind;
        this.f146614e = i10;
        this.f146615f = valueParameter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.C(this.f146610a, this.f146611b, this.f146612c, this.f146613d, this.f146614e, this.f146615f);
    }
}
