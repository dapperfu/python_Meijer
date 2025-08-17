package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes13.dex */
class i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f146607a;

    /* renamed from: b, reason: collision with root package name */
    private final MessageLite f146608b;

    /* renamed from: c, reason: collision with root package name */
    private final AnnotatedCallableKind f146609c;

    public i(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.f146607a = memberDeserializer;
        this.f146608b = messageLite;
        this.f146609c = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.p(this.f146607a, this.f146608b, this.f146609c);
    }
}
