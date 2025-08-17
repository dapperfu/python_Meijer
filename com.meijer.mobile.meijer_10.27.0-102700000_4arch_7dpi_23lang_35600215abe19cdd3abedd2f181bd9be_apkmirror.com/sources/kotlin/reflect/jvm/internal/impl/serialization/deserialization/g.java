package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes13.dex */
class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f146601a;

    /* renamed from: b, reason: collision with root package name */
    private final MessageLite f146602b;

    /* renamed from: c, reason: collision with root package name */
    private final AnnotatedCallableKind f146603c;

    public g(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.f146601a = memberDeserializer;
        this.f146602b = messageLite;
        this.f146603c = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.k(this.f146601a, this.f146602b, this.f146603c);
    }
}
